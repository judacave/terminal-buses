package com.cardona.juan.terminalbuses.repository.models;

public class Destino {
    private String id;
    private String nombre;
    private double distancia;

    public Destino(String id, String nombre, double distancia) {
        this.id = id;
        this.nombre = nombre;
        this.distancia = distancia;
    }

    public Destino() {
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
}
