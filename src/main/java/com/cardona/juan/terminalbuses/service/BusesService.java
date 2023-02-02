package com.cardona.juan.terminalbuses.service;

import com.cardona.juan.terminalbuses.repository.BusRepository;
import com.cardona.juan.terminalbuses.repository.models.Bus;
import com.cardona.juan.terminalbuses.repository.models.BusGrande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusesService implements IBusesService{

    @Autowired
    BusRepository buses;
    @Override
    public List<Bus> obtenerBuses() {
        return buses.obtenerBuses();
    }

    @Override
    public Bus agregarBus(Bus bus) {
        Bus newBus = new BusGrande(bus.getPlaca(),bus.getEmpresa(),bus.getCapacidad());
        buses.registrarNuevoBus(newBus);
        return newBus;
    }
}
