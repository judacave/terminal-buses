package com.cardona.juan.terminalbuses.repository.models;

import java.util.ArrayList;
import java.util.List;

public abstract class Bus {

    private String placa;
    private String empresa;
    private int capacidad;

    private List<Pasajero> pasajeros;

    public Bus(String placa, String empresa, int capacidad) {
        this.placa = placa;
        this.empresa = empresa;
        this.capacidad = capacidad;
        this.pasajeros = new ArrayList<>();
    }

    public Bus() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(List<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public abstract void definirVelocidad();

    @Override
    public String toString() {
        return "Bus{" +
                "placa='" + placa + '\'' +
                ", empresa='" + empresa + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }
}
