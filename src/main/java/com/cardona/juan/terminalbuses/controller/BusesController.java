package com.cardona.juan.terminalbuses.controller;

import com.cardona.juan.terminalbuses.repository.models.Bus;
import com.cardona.juan.terminalbuses.repository.models.BusGrande;
import com.cardona.juan.terminalbuses.service.IBusesService;
import com.cardona.juan.terminalbuses.service.IDestinosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("buses")
public class BusesController {
    @Autowired
    IBusesService busesService;

    @GetMapping("/list")
    public ResponseEntity GETlistarBuses(){

        return new ResponseEntity(busesService.obtenerBuses() , HttpStatus.FOUND);
    }

    @PostMapping("/crear")
    public ResponseEntity POSTagregarBus(@RequestBody BusGrande bus) {
        return new ResponseEntity(busesService.agregarBus(bus), HttpStatus.CREATED);
    }
}