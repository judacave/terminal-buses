package com.cardona.juan.terminalbuses.service;

import com.cardona.juan.terminalbuses.repository.models.Bus;
import com.cardona.juan.terminalbuses.repository.models.Destino;
import com.cardona.juan.terminalbuses.repository.models.Pasajero;
import com.cardona.juan.terminalbuses.repository.models.Viaje;

import java.util.List;

public interface IViajesService {
    List<Viaje> obtenerViajes();
    Viaje crearViaje(Viaje viaje);

    void asignarParametrosViaje(String placa,String id);
}
