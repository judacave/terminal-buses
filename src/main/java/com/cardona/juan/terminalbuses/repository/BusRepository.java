package com.cardona.juan.terminalbuses.repository;

import com.cardona.juan.terminalbuses.repository.models.Bus;
import com.cardona.juan.terminalbuses.repository.models.BusGrande;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BusRepository {
    private List<Bus> buses;

    public BusRepository() {
            Bus b1 = new BusGrande("B1","Bolivariano",10);
            Bus b2 = new BusGrande("B2","Flota Occidental",8);
            Bus b3 = new BusGrande("B3","Velotax",8);
        buses = new ArrayList<>(List.of(b1,b2,b3));
    }

    public List<Bus> obtenerBuses(){
        return this.buses;
    }

    public void registrarNuevoBus(Bus bus) {
        buses.add(bus);
    }
}
