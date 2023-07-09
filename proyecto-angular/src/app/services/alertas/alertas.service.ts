import { Injectable } from '@angular/core';
import { ToastrModule, ToastrService } from 'ngx-toastr';

@Injectable({
  providedIn: 'root'
})
export class AlertasService {

  constructor(private toast:ToastrService) { }

  showSuccess(texto:any,titulo:any) {
    this.toast.success(texto,titulo);
  }

  showError(texto:any,titulo:any) {
    this.toast.error(texto,titulo);
  }

}
