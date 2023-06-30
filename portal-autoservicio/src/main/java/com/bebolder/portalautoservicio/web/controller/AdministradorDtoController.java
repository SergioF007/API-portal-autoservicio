package com.bebolder.portalautoservicio.web.controller;

import com.bebolder.portalautoservicio.domain.dto.AdministradorDto;
import com.bebolder.portalautoservicio.domain.service.AdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{Id}")
    public ResponseEntity<AdministradorDto> getUsuario(@PathVariable("Id") int usuarioId) {
        return administradorService.getUsuario(usuarioId)
                .map(administradorDto -> new ResponseEntity<>(administradorDto, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<AdministradorDto> save(@RequestBody AdministradorDto administradorDto) {
        return new ResponseEntity<>(administradorService.save(administradorDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{Id}")
    public ResponseEntity delete(@PathVariable("Id") int usuarioId) {
        if (administradorService.delete(usuarioId)) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
