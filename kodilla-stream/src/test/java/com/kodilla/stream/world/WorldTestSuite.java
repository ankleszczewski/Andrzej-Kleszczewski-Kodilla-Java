package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //Given
        //Creating Countries
        Country poland = new Country("Poland", new BigDecimal("100000"));
        Country germany = new Country("Germany", new BigDecimal("100000"));
        Country usa = new Country("USA", new BigDecimal("1000000"));
        Country canada = new Country("Canada", new BigDecimal("1000000"));
        Country brasil = new Country("Brasil", new BigDecimal("10000000"));
        Country chile = new Country("Chle", new BigDecimal("10000000"));
        Country libya = new Country("Libya", new BigDecimal("100000000"));
        Country egypt = new Country("Egypt", new BigDecimal("100000000"));

        //Creating Continents
        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");
        Continent northAmerica = new Continent("North America");
        Continent southAmerica = new Continent("South America");

        //Creating World
        World world = new World();

        //When
        //Adding countries to contiinents
        europe.addCountry(poland);
        europe.addCountry(germany);
        northAmerica.addCountry(usa);
        northAmerica.addCountry(canada);
        southAmerica.addCountry(brasil);
        southAmerica.addCountry(chile);
        africa.addCountry(libya);
        africa.addCountry(egypt);

        //Adding continents to world
        world.addContinent(europe);
        world.addContinent(northAmerica);
        world.addContinent(southAmerica);
        world.addContinent(africa);

        //Then
        Assert.assertEquals(world.getPeopleQuantity(), new BigDecimal("222200000"));

    }
}
