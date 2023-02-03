package com.cardona.juan.terminalbuses.repository.models;

import com.cardona.juan.terminalbuses.repository.skeletons.Bus;

public class BusPequeno extends Bus {
    public BusPequeno(String placa, String empresa, int capacidad) {
        super(placa, empresa, capacidad);
    }

    @Override
    public void definirVelocidad() {
        System.out.println("Como soy un bus pequeno mi velocidad maxima es de 90km/h");
    }
}
