package com.cardona.juan.terminalbuses.service;

import com.cardona.juan.terminalbuses.repository.models.Viaje;

import java.util.List;

public interface IViajesService {
    List<Viaje> obtenerViajes();
    Viaje crearViaje(Viaje viaje);

    Viaje asignarParametrosViaje(String placa,String id);
}
