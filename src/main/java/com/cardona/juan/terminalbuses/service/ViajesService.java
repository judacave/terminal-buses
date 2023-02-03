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
import java.util.Date;
import java.util.List;
import java.util.UUID;
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
        if(pasajeros.getPasajeros1().size() <= busasignado.get(0).getCapacidad()){
            crearViaje(new Viaje(UUID.randomUUID().toString(),new Date().toString(),busasignado.get(0),destinoSeleccionado.get(0),pasajeros.getPasajeros1()));
            int newCapacidad = busasignado.get(0).getCapacidad() - pasajeros.getPasajeros1().size();
            busasignado.get(0).setCapacidad(newCapacidad);
        }else{
            System.out.println("Se excedio la capacidad de pasajeros para este bus");
        }

    }
}

//    String id, String date, Bus bus, Destino destino, List<Pasajero> pasajeros
