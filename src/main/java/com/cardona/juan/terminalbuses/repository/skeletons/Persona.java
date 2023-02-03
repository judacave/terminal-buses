package com.cardona.juan.terminalbuses.repository.skeletons;

public abstract class Persona {
    private int id;

    public Persona(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
