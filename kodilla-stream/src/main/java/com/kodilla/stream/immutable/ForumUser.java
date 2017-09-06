package com.kodilla.stream.immutable;

public final class ForumUser {
    private final String username;
    private final String realName;

    ForumUser(final String username, final String realName) {
        this.username = username;
        this.realName = realName;
    }

    String getUsername() {
        return username;
    }

    String getRealName() {
        return realName;
    }
}
