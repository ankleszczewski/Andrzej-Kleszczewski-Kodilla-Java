package com.kodilla.testing.user;

public class SimpleUser {
    private static String username;

    public SimpleUser (String username) {
        this.username = username;
    }

    public static String getUsername() {
        return  username;
    }

}
