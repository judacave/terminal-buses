package com.cardona.juan.terminalbuses.repository;

import com.cardona.juan.terminalbuses.repository.models.Bus;
import com.cardona.juan.terminalbuses.repository.models.Viaje;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ViajesRepository {
    private List<Viaje> viajes;

    public ViajesRepository() {
        viajes = new ArrayList<>();
    }

    public List<Viaje> getViajes() {
        return viajes;
    }

    public void setViajes(List<Viaje> viajes) {
        this.viajes = viajes;
    }

    public void registrarNueviaje(Viaje viaje) {
        viajes.add(viaje);
    }
}
