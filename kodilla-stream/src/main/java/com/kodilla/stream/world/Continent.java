package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String continentName;
    private final List<Country> countries = new ArrayList<Country>();
    public Continent(String continentName) {
        this.continentName = continentName;
    }

   public List<Country> getCountries() {
        return countries;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public String getContinentName() {
        return continentName;
    }
}
