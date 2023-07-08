import { EquipoI } from "./equipo.interface";

export interface ListaUsuariosI{
    usuarioId: number;
    tipoDocumento: string;
    documento: string;
    nombre: string;
    apellidos: string;
    celular: string;
    direccion: string;
    fechaIngreso: string;
    fechaRetiro: string;
    tipoContrato: string;
    estado: boolean;
    cargo: string;
    correo: string;
    equipoId: number;
    equipoDto: EquipoI | null;
}