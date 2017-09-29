package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;


public class FlightsTable {

    private final List<Flight> flights = new ArrayList<>();

    public FlightsTable() {

        flights.add(new Flight("Warszawa", "Berlin"));
        flights.add(new Flight("Warszawa", "Gdańsk"));
        flights.add(new Flight("Warszawa", "Wrocław"));
        flights.add(new Flight("Berlin", "Warszawa"));
        flights.add(new Flight("Gdańsk", "Warszawa"));
        flights.add(new Flight("Wroclaw", "Warszawa"));
    }

    public List<Flight> getList() {
        return new ArrayList<>(flights);
    }






}