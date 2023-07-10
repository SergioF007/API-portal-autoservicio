
export interface GestionSolicitudI{
    gestionSolicitudId: number;
    solicitudVacacionesId: number;
    aprobacionSupervisor: boolean;
    aprobacionAdministrador: boolean;
    estado: string;
    fecha: string;    
}