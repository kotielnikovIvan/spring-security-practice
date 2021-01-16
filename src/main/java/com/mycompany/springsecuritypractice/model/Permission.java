package com.mycompany.springsecuritypractice.model;

public enum Permission {

    FRIENDS_READ("friends:read"),
    FRIENDS_WRITE("friends:write"),
    FRIENDS_DELETE("friends:delete");

    private final String authority;

    Permission(String authority) {
        this.authority = authority;
    }

    public String getAuthority() {
        return authority;
    }
}
