package com.openbootcamp.services;

import com.openbootcamp.models.Bootcamper;
import org.jvnet.hk2.annotations.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BootcamperService {

    // creamos una lista de bootcampers (usuarios)
    private List<Bootcamper> bootcampers = new ArrayList<>();

    // métodos/funciones (comportamientos)
    // método que nos devuelva a todos los usuarios (lista de bootcampers)
    public List<Bootcamper> getAllBootcampers() {
        return bootcampers;
    }

    // método que introduce lo que le pasemos como parámetro
    public void addBootcamper(Bootcamper bootcamper) {
        bootcampers.add(bootcamper);
    }
}
