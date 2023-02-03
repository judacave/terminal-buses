package com.cardona.juan.terminalbuses.controller;

import com.cardona.juan.terminalbuses.repository.models.BusGrande;
import com.cardona.juan.terminalbuses.repository.models.Destino;
import com.cardona.juan.terminalbuses.service.IDestinosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("destinos")
public class DestinosController {
    @Autowired
    IDestinosService destinosService;

    @GetMapping("/list")
    public ResponseEntity GETlistarDestinos(){

        return new ResponseEntity(destinosService.obtenerDestinos() , HttpStatus.FOUND);
    }
    @PostMapping("/crear")
    public ResponseEntity POSTagregarDestino(@RequestBody Destino destino) {
        return new ResponseEntity(destinosService.agregarDestino(destino), HttpStatus.CREATED);
    }
}
