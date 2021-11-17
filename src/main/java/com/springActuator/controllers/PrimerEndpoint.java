package com.springActuator.controllers;


import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@RestControllerEndpoint(id = "nuevoEndPoint")
public class PrimerEndpoint {
    @GetMapping("/primerEndpoint")
    public @ResponseBody ResponseEntity<String> customEndPoint(){
        return  new ResponseEntity<>("Hola,este es mi primer end-point", HttpStatus.OK);
    }
}