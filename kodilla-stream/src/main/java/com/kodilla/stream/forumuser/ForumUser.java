package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int userId;
    private final String userName;
    private final char userSex;
    private final LocalDate birthdate;
    private final int numOfPosts;

    public ForumUser(int userId, String userName, char userSex, int yearOfBirth, int monthOfBirth, int dayOfBirth, int numOfPosts) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.birthdate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numOfPosts = numOfPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getNumOfPosts() {
        return numOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", birthdate=" + birthdate +
                ", numOfPosts=" + numOfPosts +
                '}';
    }
}
