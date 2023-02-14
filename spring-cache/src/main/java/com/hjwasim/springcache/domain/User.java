package com.hjwasim.springcache.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private String username;
    private int age;
}
