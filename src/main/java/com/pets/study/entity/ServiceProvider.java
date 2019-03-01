package com.pets.study.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ServiceProvider {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name, email;

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}