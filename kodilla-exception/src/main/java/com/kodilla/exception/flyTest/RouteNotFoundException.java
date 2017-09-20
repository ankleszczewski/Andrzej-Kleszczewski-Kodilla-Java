package com.kodilla.exception.flyTest;

public class RouteNotFoundException extends Exception {
    public RouteNotFoundException (final String statement) {
        super(statement);
    }
}
