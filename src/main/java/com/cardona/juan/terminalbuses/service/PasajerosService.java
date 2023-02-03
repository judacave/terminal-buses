package com.cardona.juan.terminalbuses.service;

import com.cardona.juan.terminalbuses.repository.PasajerosRepository;
import com.cardona.juan.terminalbuses.repository.models.BusGrande;
import com.cardona.juan.terminalbuses.repository.models.Pasajero;
import com.cardona.juan.terminalbuses.repository.skeletons.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasajerosService implements IPasajerosService{

    @Autowired
    PasajerosRepository pasajeros;
    @Override
    public List<Pasajero> obtenerPasajeros() {
        return pasajeros.getPasajeros1();
    }

    @Override
    public Pasajero agregarPasajero(Pasajero pasajero) {
        Pasajero newPasajero = new Pasajero(pasajero.getId(),pasajero.getName());
        pasajeros.agregarPasajero(newPasajero);
        return newPasajero;
    }
}
