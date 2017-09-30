/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springBoot.demo.service;

import org.springBoot.demo.repository.BookShelveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ayojava
 */
@Service
@Transactional
public class BookShelveService {
    
    private final BookShelveRepository bookShelveRepository;
    
    @Autowired
    public BookShelveService(BookShelveRepository bookShelveRepository){
        this.bookShelveRepository = bookShelveRepository;
    }
}
