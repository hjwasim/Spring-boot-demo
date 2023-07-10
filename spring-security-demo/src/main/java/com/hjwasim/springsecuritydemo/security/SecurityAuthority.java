package com.hjwasim.springsecuritydemo.security;

import com.hjwasim.springsecuritydemo.entity.Authority;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

/**
 * @author Hjwasim
 */
@AllArgsConstructor
public class SecurityAuthority implements GrantedAuthority {
    private final Authority authority;

    @Override
    public String getAuthority() {
        return authority.getName();
    }
}
