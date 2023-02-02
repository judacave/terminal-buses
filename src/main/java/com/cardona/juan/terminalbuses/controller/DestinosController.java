package com.cardona.juan.terminalbuses.controller;

import com.cardona.juan.terminalbuses.service.IDestinosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("destinos")
public class DestinosController {
    @Autowired
    IDestinosService destinosService;

    @GetMapping("/list")
    public ResponseEntity GETlistarDestinos(){

        return new ResponseEntity(destinosService.obtenerDestinos() , HttpStatus.FOUND);
    }
}
