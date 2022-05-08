package com.example.springbootprova.demospringbootprova.repositories;


import java.util.List;

import com.example.springbootprova.demospringbootprova.models.Vehicle;

import org.springframework.stereotype.Repository;

@Repository
public class VehicleRepository {

    
     private List<Vehicle> vehicles;

     VehicleRepository(List<Vehicle> vehicles){
          this.vehicles = vehicles;
     }

     public List<Vehicle> getVehicles(){
          return this.vehicles;
     };

     public void setVehicles(List<Vehicle> list){
          this.vehicles = list;
     }

     public void insertVehicle(Vehicle v){
          this.vehicles.add(v);
     }

     public Vehicle getSingleVehicle(int id){
          return this.vehicles.get(id);
     }


}
