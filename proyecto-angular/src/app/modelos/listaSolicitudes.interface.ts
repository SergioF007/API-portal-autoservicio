import { GestionSolicitudI } from "./gestionSolicitud.interface";

export interface ListaSolicitudesI{
    solicitudVacacionesId: number;
    cantidadDias: number;
    inicioVacaciones: string;
    finVacaciones: string;
    fechaReintegro: string;
    observacion: string;
    firmaEmpleado: boolean | null;
    firmaSupervisor: boolean | null;
    usuarioId: number;
    gestionSolicitudDto: GestionSolicitudI | null;

}