package com.example.jpainheritence.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Hjwasim
 */

//THIS WONT CREATE ANY TABLE RATHER, IT WILL BE USED AS COMMON ENTITY
// [sharing common attributes with the entity which inherits it].
@MappedSuperclass
@Getter
@Setter
public class BaseEntity {

    //Every Entity should have an ID.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //example sake
    private String type;
}
