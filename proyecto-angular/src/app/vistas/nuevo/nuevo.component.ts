import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { ListaUsuariosI } from 'src/app/modelos/listaUsuarios.interface';
import { ResponseI } from 'src/app/modelos/response.interface';
import { ApiService } from 'src/app/services/api/api.service';
import { AlertasService } from 'src/app/services/alertas/alertas.service';
import { Router , ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-nuevo',
  templateUrl: './nuevo.component.html',
  styleUrls: ['./nuevo.component.css']
})
export class NuevoComponent implements OnInit {

  nuevoForm = new FormGroup({
    usuarioId: new FormControl(0),
    tipoDocumento: new FormControl(''),
    documento: new FormControl(''),
    nombre: new FormControl(''),
    apellidos: new FormControl(''),
    celular: new FormControl(''),
    direccion: new FormControl(''),
    fechaIngreso: new FormControl(''),
    fechaRetiro: new FormControl(''),
    tipoContrato: new FormControl(''),
    estado: new FormControl(false),
    cargo: new FormControl(''),
    correo: new FormControl(''),
    equipoId: new FormControl(0),
    equipoDto: new FormControl(null)

  });

  constructor(private activeRouter:ActivatedRoute , private router:Router, private api:ApiService, private alertas:AlertasService ) { }

  ngOnInit(): void {
  }


  onSubmit() {
    const formValue = this.nuevoForm.value as ListaUsuariosI;
    this.postForm(formValue);
  }

  postForm(form:ListaUsuariosI) {

    this.api.postUser(form).subscribe( (data) => {
      let respuesta:ResponseI = data;
      if(form.documento) {
        this.alertas.showSuccess('Empleado Creado', 'Hecho');
      }else {
        this.alertas.showError(respuesta.message, 'Error')
      }
      console.log(respuesta);
      this.router.navigate(['gestion-empleados']);

    } )
  }


  salir() {

    this.router.navigate(['dashboard']);

  }

}
