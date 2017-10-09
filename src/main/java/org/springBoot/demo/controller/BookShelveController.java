/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springBoot.demo.controller;

import java.util.List;
import javax.validation.Valid;
import org.springBoot.demo.entity.BookShelve;
import org.springBoot.demo.exception.ResourceNotFoundException;
import org.springBoot.demo.service.BookShelveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    
    @PostMapping("/new")
    public BookShelve newBookShelve(@Valid @RequestBody BookShelve bookShelve ){
        return bookShelveService.saveBookShelve(bookShelve);
    }
    
    @GetMapping("/id/{bookShelveId}")
    public BookShelve findBookShelveById(@PathVariable Long bookShelveId) throws ResourceNotFoundException{
        return bookShelveService.findABookShelve(bookShelveId).
                orElseThrow(() -> new ResourceNotFoundException("BookShelve with id [" + bookShelveId + " ] not found " ));
    }
    
    @GetMapping("/all")
    public List<BookShelve> findAllBookShelves(){
        return bookShelveService.findAll();
    }
    
    @GetMapping("/count")
    public Long countBookShelves(){
        return bookShelveService.bookShelveCount();
    }
}
