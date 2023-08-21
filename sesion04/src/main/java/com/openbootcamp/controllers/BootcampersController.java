package com.openbootcamp.controllers;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.springframework.stereotype.Component;

import javax.swing.plaf.PanelUI;

@Component
@Path("/")
public class BootcampersController {

    // métodos/funciones (comportamientos)
    @GET
    public String hola() {
        return "Hola";
    }
}
