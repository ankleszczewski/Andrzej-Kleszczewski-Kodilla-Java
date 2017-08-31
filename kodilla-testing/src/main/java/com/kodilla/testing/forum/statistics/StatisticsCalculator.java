package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.weather.stub.Temperatures;

import java.util.ArrayList;
import java.util.List;

public class StatisticsCalculator  {

    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double usersPostsAverage;
    private double usersCommentsAverage;
    private double commentsPerPostAverage;


    public void calculateAdvStatistics (Statistics statistics) {
        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        usersPostsAverage = (double)postsQuantity / (double)usersQuantity;
        usersCommentsAverage = (double)commentsQuantity / (double)usersQuantity;
        commentsPerPostAverage = (double)commentsQuantity / (double)postsQuantity;

    }

    public void showStatistics() {
        System.out.println("Quantity of users: " + usersQuantity);
        System.out.println("Quantity of posts: " + postsQuantity);
        System.out.println("Quantity of comments: " + commentsQuantity);
        System.out.println("Average of posts per user: " + usersPostsAverage);
        System.out.println("Average of comments per user: " + usersCommentsAverage);
        System.out.println("Average of comments per post: " + commentsPerPostAverage);
    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getUsersPostsAverage() {
        return usersPostsAverage;
    }

    public double getUsersCommentsAverage() {
        return usersCommentsAverage;
    }

    public double getCommentsPerPostAverage() {
        return commentsPerPostAverage;
    }
}
