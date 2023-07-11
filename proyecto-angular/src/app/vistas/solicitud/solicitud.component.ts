import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { ListaSolicitudesI } from 'src/app/modelos/listaSolicitudes.interface';
import { ResponseI } from 'src/app/modelos/response.interface';
import { ApiService } from 'src/app/services/api/api.service';
import { AlertasService } from 'src/app/services/alertas/alertas.service'; 
import { FormGroup, FormControl, Validators } from '@angular/forms';


@Component({
  selector: 'app-solicitud',
  templateUrl: './solicitud.component.html',
  styleUrls: ['./solicitud.component.css']
})
export class SolicitudComponent implements OnInit {

  solicitudForm = new FormGroup({
    solicitudVacacionesId: new FormControl(0),
    cantidadDias: new FormControl(0),
    inicioVacaciones: new FormControl(''),
    finVacaciones: new FormControl(''),
    fechaReintegro: new FormControl(''),
    observacion: new FormControl(''),
    direccion: new FormControl(''),
    firmaEmpleado: new FormControl(null),
    firmaSupervisor: new FormControl(null),
    usuarioId: new FormControl(0),
    gestionSolicitudDto: new FormControl(null),

  });

  constructor(private activeRouter:ActivatedRoute , private router:Router, private api:ApiService, private alertas:AlertasService) { }

  ngOnInit(): void {

  }

  onSubmit() {
    const formValue = this.solicitudForm.value as ListaSolicitudesI;
    this.postForm(formValue);
  }

  postForm(form:ListaSolicitudesI) {

    this.api.postSolicitud(form).subscribe( data => {
      let respuesta:ResponseI = data;
      if(form.usuarioId) {
        this.alertas.showSuccess('Solicitud Creada', 'Hecho');
      }else {
        this.alertas.showError('No se puedo crear la solicitud', 'Error')
      }
      this.router.navigate(['dashboard']);
    })

  }

  salir() {
    this.router.navigate(['dashboard']);
  }


}
