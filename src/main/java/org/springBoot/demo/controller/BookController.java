/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springBoot.demo.controller;

import org.springBoot.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ayojava
 */
@RestController
@RequestMapping("/book")
public class BookController {
    
    private final BookService bookService;
    
    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }
    
    
}
