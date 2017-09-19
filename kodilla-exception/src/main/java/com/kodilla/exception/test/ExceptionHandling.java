package com.kodilla.exception.test;

import java.time.LocalDateTime;

public class ExceptionHandling {
    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String done = secondChallenge.probablyIWillThrowException(2, 1.5);
            System.out.println(done);
        } catch (StringException e) {
            System.out.println("Nice try!");
        } finally {
            System.out.println("Exception checked: " + LocalDateTime.now());
        }
    }
}
