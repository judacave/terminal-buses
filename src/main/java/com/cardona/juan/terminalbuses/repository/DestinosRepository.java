package com.cardona.juan.terminalbuses.repository;

import com.cardona.juan.terminalbuses.repository.models.Destino;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DestinosRepository {

    private List<Destino> destinos;

    public DestinosRepository() {
        destinos = new ArrayList<>(List.of(new Destino("1","Medellin",230),
                new Destino("2","Bogota",320),
                new Destino("3","Barranquilla",930)));
    }

    public void agregarDestino(Destino destino){
        destinos.add(destino);
    }

    public List<Destino> getDestinos(){
        return destinos;
    }

    public void setDestinos(List<Destino> destinos) {
        this.destinos = destinos;
    }
}
