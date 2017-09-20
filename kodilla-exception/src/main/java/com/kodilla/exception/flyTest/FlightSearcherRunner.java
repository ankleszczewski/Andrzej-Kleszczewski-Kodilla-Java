package com.kodilla.exception.flyTest;

import java.time.LocalDateTime;

public class FlightSearcherRunner {
    public static void main (String[] args) {
        FlightSearcher flightSearcher = new FlightSearcher();
        Flight firstFlight = new Flight("New York", "Tokyo");

        try {
            flightSearcher.findFlight(firstFlight);
        } catch (RouteNotFoundException e) {
            System.out.println("Destinantion is not exists");
        } finally {
            System.out.println("Destination checked: " + LocalDateTime.now());
        }
    }
}
