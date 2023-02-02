package com.cardona.juan.terminalbuses.service;

import com.cardona.juan.terminalbuses.repository.BusRepository;
import com.cardona.juan.terminalbuses.repository.DestinosRepository;
import com.cardona.juan.terminalbuses.repository.PasajerosRepository;
import com.cardona.juan.terminalbuses.repository.ViajesRepository;
import com.cardona.juan.terminalbuses.repository.models.Bus;
import com.cardona.juan.terminalbuses.repository.models.BusGrande;
import com.cardona.juan.terminalbuses.repository.models.Destino;
import com.cardona.juan.terminalbuses.repository.models.Viaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ViajesService implements IViajesService{

    @Autowired
    ViajesRepository viajes;
    @Autowired
    BusRepository buses;
    @Autowired
    DestinosRepository destinos;
    @Autowired
    PasajerosRepository pasajeros;
    @Override
    public List<Viaje> obtenerViajes() {
        return viajes.getViajes();
    }

    @Override
    public Viaje crearViaje(Viaje viaje) {
        viajes.registrarNueviaje(viaje);
        return viaje;
    }

    @Override
    public void asignarParametrosViaje(String placa, String id) {
        List<Bus> busasignado = buses.obtenerBuses().stream().filter(bus -> bus.getPlaca().equals(placa)).collect(Collectors.toList());
        List<Destino> destinoSeleccionado = destinos.getDestinos().stream().filter(d -> d.getId().equals(id)).collect(Collectors.toList());
        crearViaje(new Viaje("V1","12/10/22",busasignado.get(0),destinoSeleccionado.get(0),pasajeros.getPasajeros1()));
    }
}

//    String id, String date, Bus bus, Destino destino, List<Pasajero> pasajeros
