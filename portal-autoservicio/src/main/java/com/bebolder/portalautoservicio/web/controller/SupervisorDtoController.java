package com.bebolder.portalautoservicio.web.controller;

import com.bebolder.portalautoservicio.domain.dto.SolicitudVacacionesDto;
import com.bebolder.portalautoservicio.domain.service.SolicitudVacacionesService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/supervisor")
public class SupervisorDtoController {
    @Autowired
    private SolicitudVacacionesService solicitudVacacionesService;

    @PostMapping("/solicitud-vacaciones/save")
    @ApiOperation("Save Supervisor Vacation Request")
    @ApiResponses({
            @ApiResponse(code = 200, message = "vacation request save"),
            @ApiResponse(code = 404, message = "vacation request not save")
    })
    public ResponseEntity<SolicitudVacacionesDto> save(@RequestBody SolicitudVacacionesDto solicitudVacacionesDto) {

        return new ResponseEntity<>(solicitudVacacionesService.save(solicitudVacacionesDto), HttpStatus.CREATED);
    }


}
