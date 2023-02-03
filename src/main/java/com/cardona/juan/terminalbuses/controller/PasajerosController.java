package com.cardona.juan.terminalbuses.controller;

import com.cardona.juan.terminalbuses.repository.models.BusGrande;
import com.cardona.juan.terminalbuses.repository.models.Pasajero;
import com.cardona.juan.terminalbuses.service.IBusesService;
import com.cardona.juan.terminalbuses.service.IPasajerosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pasajeros")
public class PasajerosController {
    @Autowired
    IPasajerosService pasajerosService;

    @GetMapping("/list")
    public ResponseEntity GETlistarPasajeros(){

        return new ResponseEntity(pasajerosService.obtenerPasajeros() , HttpStatus.FOUND);
    }

    @PostMapping("/crear")
    public ResponseEntity POSTagregarBus(@RequestBody Pasajero pasajero) {
        return new ResponseEntity(pasajerosService.agregarPasajero(pasajero), HttpStatus.CREATED);
    }
}