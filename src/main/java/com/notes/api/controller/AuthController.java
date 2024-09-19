package com.notes.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthController {

    @GetMapping("/hola")
    public String holaMundo() {
        return "Hola mundo";
    }

    @GetMapping("/saludo/{nombre}/{edad}")
    public String holaMundo(@PathVariable String nombre, @PathVariable int edad) {
        return "Hola " + nombre + ", Tu edad es " + edad;
    }

}
