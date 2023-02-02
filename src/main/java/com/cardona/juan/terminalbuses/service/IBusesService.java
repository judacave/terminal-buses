package com.cardona.juan.terminalbuses.service;

import com.cardona.juan.terminalbuses.repository.models.Bus;

import java.util.List;

public interface IBusesService {
    List<Bus> obtenerBuses();
    Bus agregarBus(Bus bus);
}
