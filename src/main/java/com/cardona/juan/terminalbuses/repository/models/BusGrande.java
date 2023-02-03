package com.cardona.juan.terminalbuses.repository.models;

import com.cardona.juan.terminalbuses.repository.skeletons.Bus;

public class BusGrande extends Bus {

    public BusGrande(String placa, String empresa, int capacidad) {

        super(placa, empresa, capacidad);
    }

    public BusGrande() {
    }

    @Override
    public void definirVelocidad() {
        System.out.println("Como soy un Bus grande mi velocidad maxima es 60km/h");
    }
}
