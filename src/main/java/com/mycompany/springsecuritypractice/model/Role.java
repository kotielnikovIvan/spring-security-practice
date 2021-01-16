package com.mycompany.springsecuritypractice.model;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

public enum Role {

    ADMIN(Set.of(Permission.FRIENDS_READ, Permission.FRIENDS_WRITE, Permission.FRIENDS_DELETE)),
    USER(Set.of(Permission.FRIENDS_READ)),
    CUSTOMER(Collections.emptySet());

    private final Set<Permission> permissions;

    Role(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public Set<SimpleGrantedAuthority> getAuthorities() {
        return permissions.stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getAuthority()))
                .collect(Collectors.toSet());
    }
}
