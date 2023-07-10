package com.hjwasim.springsecuritydemo.repository;

import com.hjwasim.springsecuritydemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Hjwasim
 */
public interface UserRepository extends JpaRepository<User,Long> {
    @Query("""
    select u from User u where u.username = :name
    """)
    Optional<User> findUserByUsername(String name);
}
