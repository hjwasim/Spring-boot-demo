package com.example.jpainheritence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Hjwasim
 */
@Entity
@Table(name = "b")
@Getter
@Setter
public class EntityB extends BaseEntity {
    private Integer count; //just count for example
}
