package com.example.jpainheritence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

/**
 * @author Hjwasim
 */
// serves as a template for concrete repository interfaces that extend it.
// we can define our common queries which will be used in child repos.
@NoRepositoryBean
public interface CommonRepository<T1, T2> extends JpaRepository<T1, T2> {
    @Query("""
            select t from #{#entityName} t where t.type = :type
            """)
    List<T1> findByType(String type);
}
