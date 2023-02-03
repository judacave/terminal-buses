package com.cardona.juan.terminalbuses.service;

import com.cardona.juan.terminalbuses.repository.models.Pasajero;
import com.cardona.juan.terminalbuses.repository.skeletons.Bus;

import java.util.List;

public interface IPasajerosService {
    List<Pasajero> obtenerPasajeros();
    Pasajero agregarPasajero(Pasajero pasajero);
}
