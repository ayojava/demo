/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springBoot.demo.exception;

import javax.servlet.http.HttpServletRequest;
import org.springBoot.demo.util.ErrorDetail;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *
 * @author ayojava
 */
@ControllerAdvice
public class GenericExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorDetail> handleResourceNotFound(ResourceNotFoundException exceptionObj,HttpServletRequest requestObj){
        
        ErrorDetail errorDetail = new ErrorDetail();
        errorDetail.setStatus(HttpStatus.NOT_FOUND.name());
        errorDetail.setTitle("Resource Not Found");
        errorDetail.setDetail(exceptionObj.getMessage());
        errorDetail.setMessage(exceptionObj.getClass().getName());
        return new ResponseEntity<>(errorDetail,HttpStatus.NOT_FOUND);
    }
    
    
}
