package com.hjwasim.springcache.service;

import com.hjwasim.springcache.domain.User;
import jakarta.annotation.PostConstruct;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@CacheConfig(cacheNames = {"user"})
public class UserService {

    private List<User> users = new ArrayList<>();

    @PostConstruct
    private void fillUsers() {
        users.add(User.builder().username("user_1").age(20).build());
        users.add(User.builder().username("user_2").age(76).build());
        users.add(User.builder().username("user_3").age(54).build());
        users.add(User.builder().username("user_4").age(30).build());
    }

    @Cacheable
    public List<User> findAll() {
        simulateSlowService();
        return this.users;
    }

    private void simulateSlowService() {
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
