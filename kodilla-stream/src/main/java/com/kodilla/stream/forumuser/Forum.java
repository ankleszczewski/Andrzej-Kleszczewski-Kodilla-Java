package com.kodilla.stream.forumuser;



import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(1, "Dżery", 'M', 1990, 10,
                10, 10));
        usersList.add(new ForumUser(2, "The Old Man", 'M', 1950, 7,
                20, 15));
        usersList.add(new ForumUser(3, "Karolcia", 'F', 1995, 5,
                4, 2));
        usersList.add(new ForumUser(4, "Zwykły Troll", 'M', 1994, 4,
                3, 152));
        usersList.add(new ForumUser(5, "Cichy", 'M', 1998, 3,
                2, 0));
        usersList.add(new ForumUser(6, "Janusz", 'M', 1960, 8,
                8, 5));
        usersList.add(new ForumUser(7, "Fanboy", 'M', 1999, 9,
                9, 21));
        usersList.add(new ForumUser(8, "Admin", 'F', 1980, 8,
                9, 101));
        usersList.add(new ForumUser(9, "Random User", 'F', 1990, 1,
                1, 0));
        usersList.add(new ForumUser(10, "Bot", 'F', 2000, 1,
                1, 200));


    }

    public List<ForumUser> getUsersList() {
        return new ArrayList<ForumUser> (usersList);
    }
}