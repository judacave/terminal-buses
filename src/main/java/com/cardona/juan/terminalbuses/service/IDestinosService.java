package com.cardona.juan.terminalbuses.service;

import com.cardona.juan.terminalbuses.repository.models.Destino;

import java.util.List;

public interface IDestinosService {
    List<Destino> obtenerDestinos();
    Destino agregarDestino(Destino destino);

}
