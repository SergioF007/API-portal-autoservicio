import { Component, OnInit } from '@angular/core';
import { ApiService } from 'src/app/services/api/api.service';
import { Router, ActivatedRoute } from '@angular/router';
import { ListaSolicitudesI } from 'src/app/modelos/listaSolicitudes.interface';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-gestion-solicitud',
  templateUrl: './gestion-solicitud.component.html',
  styleUrls: ['./gestion-solicitud.component.css']
})
export class GestionSolicitudComponent implements OnInit {

  solicitudes:ListaSolicitudesI [] = [];

  //formulario: FormGroup = new FormGroup({
  //  usuarioId: new FormControl()
  //});
  formulario: FormGroup;

  constructor(private activeRouter:ActivatedRoute, private router : Router, private api : ApiService) {
    this.formulario = new FormGroup({
      usuarioId: new FormControl()
    });
   }

  ngOnInit(): void {

    this.formulario = new FormGroup({
      usuarioId: new FormControl()
    });
  }

  buscar() {

    // aseguro que el formulario no sea null 
    if (this.formulario) {
      
      // Obtener el valor del campo de entrada de usuarioId
      const usuarioId = this.formulario.get('usuarioId')?.value;

      this.api.getSolicitudUser(usuarioId).subscribe(data => {
        this.solicitudes = data;
      })
    }
  }

  salir() {
    this.router.navigate(['dashboard']);
      
  }

}
