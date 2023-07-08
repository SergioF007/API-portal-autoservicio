import { Component, OnInit } from '@angular/core';
import { Router , ActivatedRoute} from '@angular/router';
import { ListaUsuariosI } from 'src/app/modelos/listaUsuarios.interface';
import { ApiService } from 'src/app/services/api/api.service';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-editar',
  templateUrl: './editar.component.html',
  styleUrls: ['./editar.component.css']
})
export class EditarComponent implements OnInit {

  constructor(private activeRouter:ActivatedRoute , private router:Router, private api:ApiService) { }

  datosEmpleado:ListaUsuariosI | undefined;
  editarForm = new FormGroup({
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
    estado: new FormControl(''),
    cargo: new FormControl(''),
    correo: new FormControl(''),
    equipoId: new FormControl(0),

  });

  ngOnInit(): void {

    let usuarioId = this.activeRouter.snapshot.paramMap.get('id');
    this.api.getSingleUser(usuarioId).subscribe(data => { 
      this.datosEmpleado = data; 
      this.editarForm.setValue({
        'usuarioId': this.datosEmpleado.usuarioId,
        'tipoDocumento': this.datosEmpleado.tipoDocumento,
        'documento' : this.datosEmpleado.documento,
        'nombre' : this.datosEmpleado.nombre,
        'apellidos' : this.datosEmpleado.apellidos,
        'celular' : this.datosEmpleado.celular,
        'direccion' : this.datosEmpleado.direccion,
        'fechaIngreso' : this.datosEmpleado.fechaIngreso, 
        'fechaRetiro' : this.datosEmpleado.fechaRetiro,
        'tipoContrato' : this.datosEmpleado.tipoContrato,
        'estado' : this.datosEmpleado.tipoContrato,
        'cargo' : this.datosEmpleado.cargo,
        'correo' : this.datosEmpleado.correo,
        'equipoId' : this.datosEmpleado.equipoId
      });
      console.log(this.editarForm.value);
    })
  }

}
