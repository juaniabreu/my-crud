package com.pruebajpa.my_crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludosController {

    @GetMapping("/hola")
    public String holaMundo(){
        return "Hola Mundo!";
    }

}
