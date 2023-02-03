package com.cardona.juan.terminalbuses.repository.models;

import com.cardona.juan.terminalbuses.repository.skeletons.Bus;

import java.util.List;

public class Viaje {
    private String id;
    private String date;
    private Bus bus;
    private Destino destino;
    private List<Pasajero> pasajeros;

    public Viaje(String id, String date, Bus bus, Destino destino, List<Pasajero> pasajeros) {
        this.id = id;
        this.date = date;
        this.bus = bus;
        this.destino = destino;
        this.pasajeros = pasajeros;
    }

    public Viaje() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(List<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }
}
