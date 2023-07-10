import { Component, OnInit } from '@angular/core';
import { ApiService } from 'src/app/services/api/api.service';
import { Router } from '@angular/router';

import { ListaUsuariosI } from 'src/app/modelos/listaUsuarios.interface';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  usuarios:ListaUsuariosI [] = []; 

  constructor(private api : ApiService, private router : Router) { }

  ngOnInit(): void {

  }

  gestionEmpleado() {

    this.router.navigate(['gestion-empleados']);

  }

  solicitudEmpleado() {

    this.router.navigate(['solicitud'])

  }



}
