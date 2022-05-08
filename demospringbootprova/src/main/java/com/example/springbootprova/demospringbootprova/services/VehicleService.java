package com.example.springbootprova.demospringbootprova.services;

import java.util.List;

import com.example.springbootprova.demospringbootprova.models.Vehicle;
import com.example.springbootprova.demospringbootprova.repositories.VehicleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {
    
    private VehicleRepository repo;

    @Autowired
    VehicleService(VehicleRepository repo){
        this.repo = repo;
    }

    public void insertVehicle(Vehicle v){
        this.repo.insertVehicle(v);
    }

    public List<Vehicle> getVehicles (){
        return this.repo.getVehicles();
    }

    public Vehicle getSingleVehicle(int id){
        return this.repo.getSingleVehicle(id);
    }
}
