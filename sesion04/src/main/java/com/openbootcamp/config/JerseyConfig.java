package com.openbootcamp.config;

// Configuración básica para Jersey.

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@ApplicationPath("/")
@Component
public class JerseyConfig extends ResourceConfig {

    // constructor
    public JerseyConfig() {
        // indicamos dónde van a estar nuestros controladores
        this.packages("com.openbootcamp.controllers");
    }
}
