package com.openbootcamp.services;

import com.openbootcamp.models.Bootcamper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BootcamperService {

    // creamos una lista de bootcampers (usuarios)
    private List<Bootcamper> bootcampers = new ArrayList<>();

    // métodos/funciones (comportamientos)
    // método que nos devuelva a todos los usuarios (lista de bootcampers)
    public List<Bootcamper> getAll() {
        return bootcampers;
    }

    // método que introduce lo que le pasemos como parámetro
    public void add(Bootcamper bootcamper) {
        bootcampers.add(bootcamper);
    }

    public Bootcamper get(String nombre) {
        for (Bootcamper bootcamper : bootcampers) {
            if (bootcamper.getNombre().equalsIgnoreCase(nombre)) {
                return bootcamper;
            }
        }

        return null;
    }
}
