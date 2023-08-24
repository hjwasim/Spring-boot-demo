package com.example.jpainheritence.service;

import com.example.jpainheritence.entity.EntityA;
import com.example.jpainheritence.entity.EntityB;
import com.example.jpainheritence.repository.EntityARepository;
import com.example.jpainheritence.repository.EntityBRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Hjwasim
 */
@Service
public class DemoService {
    private final EntityARepository repositoryA;
    private final EntityBRepository repositoryB;

    public DemoService(EntityARepository repositoryA, EntityBRepository repositoryB) {
        this.repositoryA = repositoryA;
        this.repositoryB = repositoryB;
    }

    public List<EntityA> getA(String type) {
        return repositoryA.findByType(type);
    }

    public List<EntityB> getB(String type) {
        return repositoryB.findByType(type);
    }

    public EntityB getBFromNumber(int number) {
        return repositoryB.findByCount(number);
    }
}

