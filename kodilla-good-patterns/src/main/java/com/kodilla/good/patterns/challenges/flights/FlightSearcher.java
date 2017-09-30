package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearcher {
    private final FlightsTable flightsTable = new FlightsTable();

    public List<Flight> searchByStartPoint(String startPoint) {
        List<Flight> flight = flightsTable.getList().stream()
                .filter(flights -> flights.getStartPoint().equals(startPoint))
                .collect(Collectors.toList());
        System.out.println("Searcing flights by Startpoint...");
        flight.stream()
                .forEach(System.out::println);

        return flight;
    }

    public List<Flight> searchByEndpoint (String endpoint) {
        List<Flight> flight = flightsTable.getList().stream()
                .filter(flights -> flights.getEndPoint().equals(endpoint))
                .collect(Collectors.toList());
        System.out.println("Searching flights by Endpoint...");
        flight.stream()
                .forEach(System.out::println);

        return flight;

    }
}

