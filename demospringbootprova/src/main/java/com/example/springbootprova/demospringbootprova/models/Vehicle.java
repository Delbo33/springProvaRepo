package com.example.springbootprova.demospringbootprova.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Vehicle{
    
    private int id;

    Vehicle(@JsonProperty("id") int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

}
