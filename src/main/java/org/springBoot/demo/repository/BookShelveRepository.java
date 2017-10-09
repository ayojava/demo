/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springBoot.demo.repository;

import java.util.List;
import java.util.Optional;
import org.springBoot.demo.entity.BookShelve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ayojava
 */
@Repository
public interface BookShelveRepository extends JpaRepository<BookShelve,Long>{
    
    public List<BookShelve> findBookShelveByOrderByShelveNameAsc();
    
    public Optional<BookShelve> findBookShelveById(Long bookShelveId);
}
