/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springBoot.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

/**
 *
 * @author ayojava
 */
@Data   
@Entity
@JsonIgnoreProperties(value = {"createDate"})
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String bookName;
    
    private String bookAuthor;
    
    private String publisherName;
    
    private String bookISBN;
    
    @ManyToOne
    private BookShelve bookShelve;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable = false)
    @CreationTimestamp
    private Date createDate;

    
    //http://www.baeldung.com/configuration-properties-in-spring-boot
    //https://www.callicoder.com/spring-boot-rest-api-tutorial-with-mysql-jpa-hibernate/
    //http://websystique.com/spring-boot/spring-boot-rest-api-example/
}
