/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springBoot.demo.util;

import java.time.LocalDateTime;
import lombok.Data;

/**
 *
 * @author ayojava
 * Sends Error Response 
 */
@Data
public class ErrorDetail {
    
    public ErrorDetail(){
        localDateTime = LocalDateTime.now();
    }
    
    /**
     * provides a brief title of the Error Condition
     */
    private String title;
    
    /**
     * Contains the http status code for the current request
     */
    private String status;
    
    /**
     * contains a short description of the error
     */
    private String detail;
    
    /**
     * Time when error occurred
     */
    private LocalDateTime localDateTime;
    
    /**
     * info such as exception class name or stack trace
     */
    private String message;
    
    
}
