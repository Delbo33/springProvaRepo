package com.example.springbootprova.demospringbootprova.exceptions;

public class SingleNotFoundException extends RuntimeException{

    public SingleNotFoundException(String message){
        super(message);
    }

    public SingleNotFoundException(String message, Throwable cause){
        super(message, cause);
    }
    
}
