package com.example.springbootprova.demospringbootprova.controllers;

import java.util.List;

import com.example.springbootprova.demospringbootprova.models.Vehicle;
import com.example.springbootprova.demospringbootprova.services.VehicleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicles")
public class Controller {

    private final VehicleService service;

    @Autowired
    Controller(VehicleService service){
        this.service = service;
    }

    @PostMapping
    public void insertVehicle(@RequestBody Vehicle v){
        this.service.insertVehicle(v);
    }

    @GetMapping
    public List<Vehicle> getVehicles(){
        return this.service.getVehicles();
    }

    @GetMapping(path = "{id}")
    public Vehicle getSingVehicle(@PathVariable int id){
        return this.service.getSingleVehicle(id);
    }
    
}
