package com.kodilla.good.patterns.challenges.flights;

public class Application {
    public static void main (String[] args) {

        FlightSearcher flightSearcher = new FlightSearcher();
        ConnectedFlightSearcher connectedFlightSearcher = new ConnectedFlightSearcher();

        flightSearcher.searchByStartPoint("Warszawa");
        flightSearcher.searchByEndpoint("Warszawa");

        connectedFlightSearcher.searchByStartPoint("Warszawa");
        connectedFlightSearcher.searchByEndPoint("Warszawa");

    }
}
