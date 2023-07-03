package com.bebolder.portalautoservicio.web.controller;

import com.bebolder.portalautoservicio.domain.dto.AdministradorDto;
import com.bebolder.portalautoservicio.domain.dto.SolicitudVacacionesDto;
import com.bebolder.portalautoservicio.domain.service.AdministradorService;
import com.bebolder.portalautoservicio.domain.service.SolicitudVacacionesService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/administrador")
public class AdministradorDtoController {

    @Autowired
    private AdministradorService administradorService;
    @Autowired
    private SolicitudVacacionesService solicitudVacacionesService;

    @GetMapping("/all")
    @ApiOperation("GET all Users")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<List<AdministradorDto>> getAll() {
        return new ResponseEntity<>(administradorService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/rolId/{Id}")
    @ApiOperation("Searche Users By Rol with a Id")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Usuarios of Rol not found")
    })
    public ResponseEntity<List<AdministradorDto>> getUserByRol(@ApiParam(value = "The Users with the Role Employeer", required = true, example = "3") @PathVariable("Id") int rolId) {
        return administradorService.getUserByRol(rolId)
                .map(administradorDtos -> new ResponseEntity<>(administradorDtos, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/{Id}")
    @ApiOperation("Searche a Users with a Id")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "User not found")
    })
    public ResponseEntity<AdministradorDto> getUsuario(@ApiParam(value = "The id of the user", required = true, example = "2") @PathVariable("Id") int usuarioId) {
        return administradorService.getUsuario(usuarioId)
                .map(administradorDto -> new ResponseEntity<>(administradorDto, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    @ApiOperation("Save User")
    @ApiResponses({
            @ApiResponse(code = 200, message = "User save"),
            @ApiResponse(code = 404, message = "User not save")
    })
    public ResponseEntity<AdministradorDto> save(@RequestBody AdministradorDto administradorDto) {
        return new ResponseEntity<>(administradorService.save(administradorDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{Id}")
    @ApiOperation("Delete a Usuarios Whit a Id")
    @ApiResponses({
            @ApiResponse(code = 200, message = "User delete"),
            @ApiResponse(code = 404, message = "User not delete")
    })
    public ResponseEntity delete(@PathVariable("Id") int usuarioId) {
        if (administradorService.delete(usuarioId)) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/solicitudes-vacaciones/usuarioId/{Id}")
    @ApiOperation(" Search vacation requests by user ")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Ok"),
            @ApiResponse(code = 404, message = "vacation request not found")
    })
    public ResponseEntity<List<SolicitudVacacionesDto>> getByUsuarioId(@PathVariable("Id") int usuarioId){

        return solicitudVacacionesService.getByUsuarioId(usuarioId)
                .map(solicitudVacacionesDtos -> new ResponseEntity<>(solicitudVacacionesDtos, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }

    @PostMapping("/solicitud-vacaciones/save")
    @ApiOperation("Save admin vacation request")
    @ApiResponses({
            @ApiResponse(code = 200, message = "vacation request save"),
            @ApiResponse(code = 404, message = "vacation request not save")
    })
    public ResponseEntity<SolicitudVacacionesDto> save(@RequestBody SolicitudVacacionesDto solicitudVacacionesDto) {

        return new ResponseEntity<>(solicitudVacacionesService.save(solicitudVacacionesDto), HttpStatus.CREATED);
    }



}
