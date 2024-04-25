package com.example.lab4.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = {"/home"}, method = RequestMethod.GET)
public class HomeController {

    @GetMapping(value = {""})
    public String verHome(){
        return "index";
    }

    @GetMapping(value = {"/empleados"})
    public String verEmpleados(){
        return "/empleados";
    }

    @GetMapping(value = {"/historial"})
    public String verHistorial(){
        return "/historial";
    }

    @GetMapping(value = {"/reportes"})
    public String verReportes(){
        return "/reportes";
    }

}
