package com.kodilla.exception.test;

public class SecondChallenge {
    public String probablyIWillThrowException(double x, double y) throws StringException {
        if(x >= 2 || x < 1 || y == 1.5) {
            throw new StringException();
        }
        return "Done!";
    }
}
