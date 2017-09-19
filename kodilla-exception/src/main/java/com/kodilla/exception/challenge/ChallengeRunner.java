package com.kodilla.exception.challenge;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ChallengeRunner {
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Problem with dividing, you can't divide by zero!");
        } finally {
            System.out.println("Exception checked: " + LocalDateTime.now());
        }
    }
}
