package com.kodilla.exception.flyTest;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class FlightSearcher {
    public void findFlight (Flight flight) throws RouteNotFoundException {
    Map<String, Boolean> flights = new HashMap<>();
    flights.put("New York", TRUE);
    flights.put("Warsaw", FALSE);
    flights.put("Berlin", TRUE);
    flights.put("London", TRUE);
    flights.put("Paris", FALSE);

    if (flights.get(flight.getArrivalAirport()) == null) {
        throw new RouteNotFoundException("Destinantion is not exist");
    } else if (flights.get(flight.getArrivalAirport()).booleanValue()) {
        System.out.println("Destinantion exists and you can fly there");
    } else {
        System.out.println("Destinantion exists but arrive is not possible");
    }
    }
}
