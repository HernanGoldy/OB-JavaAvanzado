package com.openbootcamp.controllers;


import com.openbootcamp.models.Bootcamper;
import com.openbootcamp.services.BootcamperService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class BootcampersController {

    // atributos (características)
    private BootcamperService bootcamperService; // variable de instancia

    // constructores - aquí hacemos la inyección de dependencias a través de los parámetros
    public BootcampersController(BootcamperService bootcamperService) {
        this.bootcamperService = bootcamperService;

        this.bootcamperService.add(new Bootcamper("uno", Math.random()));
        this.bootcamperService.add(new Bootcamper("dos", Math.random()));
        this.bootcamperService.add(new Bootcamper("tres", Math.random()));
        this.bootcamperService.add(new Bootcamper("cuatro", Math.random()));
        this.bootcamperService.add(new Bootcamper("cinco", Math.random()));
    }

    // métodos/funciones (comportamientos)
    @GET
    @Path("/bootcampers")
    @Produces("application/json") // dice qué tipo de respuesta va a ejecutar (un json)
    public List<Bootcamper> listarTodos() {
        return bootcamperService.getAll();
    }

    @POST
    @Path("/bootcampers")
    @Produces("application/json") // dice qué tipo de respuesta va a ejecutar (un json)
    @Consumes("application/json") // indica a nuestro método en qué formato la va a recibir
    public Response agregarBootcamper(Bootcamper bootcamper) {
        bootcamperService.add(bootcamper);
        return Response.created(
                URI.create("/bootcampers/" + bootcamper.getNombre())
        ).build(); // .build() es para construir
    }
}
