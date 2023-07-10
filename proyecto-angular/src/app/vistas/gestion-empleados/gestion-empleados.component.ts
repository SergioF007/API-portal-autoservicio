import { Component, OnInit } from '@angular/core';
import { ApiService } from 'src/app/services/api/api.service';
import { Router, ActivatedRoute } from '@angular/router';
import { ListaUsuariosI } from 'src/app/modelos/listaUsuarios.interface';

@Component({
  selector: 'app-gestion-empleados',
  templateUrl: './gestion-empleados.component.html',
  styleUrls: ['./gestion-empleados.component.css']
})
export class GestionEmpleadosComponent implements OnInit {

  usuarios:ListaUsuariosI [] = []; 

  constructor( private activeRouter:ActivatedRoute, private router : Router, private api : ApiService) { }

  ngOnInit(): void {
    this.api.getAllUsers().subscribe(data => {
      this.usuarios = data;
    })
  }

  editarEmpleado(id : any) {
    this.router.navigate(['editar', id]);
    // console.log(id) // lo uso para ver en consola lo que me recibe
  }

  nuevoEmpleado() {
    this.router.navigate(['nuevo']);
  }

  salir() {
    this.router.navigate(['dashboard']);
  }

}
