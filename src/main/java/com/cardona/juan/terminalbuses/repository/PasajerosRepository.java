package com.cardona.juan.terminalbuses.repository;


import com.cardona.juan.terminalbuses.repository.models.Pasajero;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class PasajerosRepository {


    private List<Pasajero> pasajeros1;

    public PasajerosRepository() {
        pasajeros1 = new ArrayList<>(List.of(new Pasajero(1, "Juan"),
                new Pasajero(2, "Alejandra"),
                new Pasajero(3, "Julian"),
                new Pasajero(4, "Mariana"),
                new Pasajero(5, "Valeria"),
                new Pasajero(6,"Stiven")));
    }


    public void agregarPasajero(Pasajero pasajero){
        pasajeros1.add(pasajero);
    }

    public List<Pasajero> getPasajeros1() {
        return pasajeros1;
    }

    public void setPasajeros1(List<Pasajero> pasajeros1) {
        this.pasajeros1 = pasajeros1;
    }
}
