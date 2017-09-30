/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springBoot.demo.controller;

import org.springBoot.demo.service.BookShelveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ayojava
 */
@RestController
@RequestMapping("/bookShelve")
public class BookShelveController {
    
    private final BookShelveService bookShelveService;
    
    @Autowired
    public BookShelveController(BookShelveService bookShelveService){
        this.bookShelveService= bookShelveService;
    }
}
