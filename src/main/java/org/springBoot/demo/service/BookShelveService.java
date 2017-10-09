/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springBoot.demo.service;

import java.util.List;
import java.util.Optional;
import org.springBoot.demo.entity.BookShelve;
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
    
    public BookShelve saveBookShelve(BookShelve bookShelve){
        return bookShelveRepository.save(bookShelve);
    }
    
    public Optional<BookShelve> findABookShelve(Long shelveID){
        return bookShelveRepository.findBookShelveById(shelveID);
    }
    
    public Long bookShelveCount(){
        return bookShelveRepository.count();
    }
    
    public List<BookShelve> findAll(){
        return bookShelveRepository.findBookShelveByOrderByShelveNameAsc();
    }
    
    
}
