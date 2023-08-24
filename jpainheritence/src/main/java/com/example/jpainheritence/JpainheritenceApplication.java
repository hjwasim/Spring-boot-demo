package com.example.jpainheritence;

import com.example.jpainheritence.entity.EntityA;
import com.example.jpainheritence.entity.EntityB;
import com.example.jpainheritence.repository.EntityARepository;
import com.example.jpainheritence.repository.EntityBRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpainheritenceApplication {

    private final EntityARepository repositoryA;
    private final EntityBRepository repositoryB;

    public JpainheritenceApplication(EntityARepository repositoryA, EntityBRepository repositoryB) {
        this.repositoryA = repositoryA;
        this.repositoryB = repositoryB;
    }

    public static void main(String[] args) {
        SpringApplication.run(JpainheritenceApplication.class, args);
    }

    @PostConstruct
    public void init(){
        EntityA a = new EntityA();
        a.setName("Hjwasim");
        a.setType("JAVA");
        this.repositoryA.save(a);

        EntityB b = new EntityB();
        b.setCount(999);
        b.setType("SQL");
        this.repositoryB.save(b);
    }
}
