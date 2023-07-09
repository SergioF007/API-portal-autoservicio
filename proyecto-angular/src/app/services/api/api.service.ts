import { Injectable } from '@angular/core';
import { ResponseI } from 'src/app/modelos/response.interface';
import {HttpClient , HttpHeaders} from '@angular/common/http'
import {Observable} from 'rxjs'
import { ListaUsuariosI } from 'src/app/modelos/listaUsuarios.interface';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  url: string = "http://localhost:8090/portal-autoservicio/api/";

  constructor(private http:HttpClient) { }

  getAllUsers():Observable<ListaUsuariosI[]> {

    let direccion = this.url + "administrador/all";

    return this.http.get<ListaUsuariosI[]>(direccion);
  }

  getSingleUser(id : any):Observable<ListaUsuariosI> {

    let direccion = this.url + "administrador/" + id;
    return this.http.get<ListaUsuariosI>(direccion);
  }

  postUser(form:ListaUsuariosI):Observable<ResponseI> {
    let direccion = this.url + "administrador/save";
    return this.http.post<ResponseI>(direccion, form);
  }
  

}
