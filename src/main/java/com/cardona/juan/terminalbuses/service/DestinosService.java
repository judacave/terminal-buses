package com.cardona.juan.terminalbuses.service;

import com.cardona.juan.terminalbuses.repository.DestinosRepository;
import com.cardona.juan.terminalbuses.repository.models.Destino;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinosService implements IDestinosService{
    @Autowired
    private DestinosRepository destinos;
    @Override
    public List<Destino> obtenerDestinos() {
        return destinos.getDestinos();
    }

    @Override
    public Destino agregarDestino(Destino destino) {
        Destino newDestino = new Destino(destino.getId(),
                destino.getNombre(),
                destino.getDistancia());
        destinos.agregarDestino(newDestino);
        return newDestino;
    }
}
