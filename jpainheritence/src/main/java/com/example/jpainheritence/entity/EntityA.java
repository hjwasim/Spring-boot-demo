package com.example.jpainheritence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Hjwasim
 */
@Entity
@Table(name = "a")
@Getter
@Setter
public class EntityA extends BaseEntity {
    private String name; //just count for example
}
