package com.bebolder.portalautoservicio.web.controller;

import com.bebolder.portalautoservicio.domain.dto.AdministradorDto;
import com.bebolder.portalautoservicio.domain.service.AdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/administrador")
public class AdministradorDtoController {

    @Autowired
    private AdministradorService administradorService;

    @GetMapping("/all")
    public ResponseEntity<List<AdministradorDto>> getAll() {
        return new ResponseEntity<>(administradorService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/rolId/{Id}")
    public ResponseEntity<List<AdministradorDto>> getUserByRol(@PathVariable("Id") int rolId) {
        return administradorService.getUserByRol(rolId)
                .map(administradorDtos -> new ResponseEntity<>(administradorDtos, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    public AdministradorDto save(AdministradorDto administradorDto) {
        return administradorService.save(administradorDto);
    }
}
