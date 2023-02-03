package com.cardona.juan.terminalbuses.controller;

import com.cardona.juan.terminalbuses.repository.models.BusGrande;
import com.cardona.juan.terminalbuses.service.IDestinosService;
import com.cardona.juan.terminalbuses.service.IViajesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("viajes")
public class ViajesController {
    @Autowired
    IViajesService viajesService;

    @GetMapping("/list")
    public ResponseEntity GETlistarDestinos(){

        return new ResponseEntity(viajesService.obtenerViajes() , HttpStatus.FOUND);
    }

    @PostMapping("/{placa}/{id}")
    public ResponseEntity POSTcrearViaje(@PathVariable("placa")String placa,@PathVariable("id") String id) {
        viajesService.asignarParametrosViaje(placa,id);
        return new ResponseEntity(viajesService.obtenerViajes(), HttpStatus.CREATED);
    }
}
