package com.example.jpainheritence.repository;

import com.example.jpainheritence.entity.EntityB;

/**
 * @author Hjwasim
 */
public interface EntityBRepository extends CommonRepository<EntityB, Integer>{
    EntityB findByCount(Integer count);
}
