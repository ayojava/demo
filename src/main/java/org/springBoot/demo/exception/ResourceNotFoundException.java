/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springBoot.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author ayojava
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    
    public ResourceNotFoundException(){
    
    }
    
    public ResourceNotFoundException(String message){
        super(message);
    }
    
    public ResourceNotFoundException(String message, Throwable throwable){
        super(message, throwable);
    }
    
}
