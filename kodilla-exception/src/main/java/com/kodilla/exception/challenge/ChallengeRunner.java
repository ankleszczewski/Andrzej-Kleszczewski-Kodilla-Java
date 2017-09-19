package com.kodilla.exception.challenge;

public class ChallengeRunner {
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Problem with dividing, you can't divide by zero!");
        } finally {

        }
    }
}
