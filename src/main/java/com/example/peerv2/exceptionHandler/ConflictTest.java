package com.example.peerv2.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class ConflictTest extends RuntimeException{

    public ConflictTest (String message){
        super(message);
    }

}
