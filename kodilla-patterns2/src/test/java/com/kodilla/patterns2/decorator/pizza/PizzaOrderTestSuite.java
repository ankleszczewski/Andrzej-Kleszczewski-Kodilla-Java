package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testStandardPizzaOrder() {
        System.out.println("Pizza Standard");
        //Given
        PizzaOrder theOrder = new StandardPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        String description = theOrder.getDescription();
        System.out.println(description);
        System.out.println("Cena: " + calculatedCost);
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
        assertEquals("Ciasto, sos, ser", description);
    }

    @Test
    public void testPizzaWithHamAndAnanas() {
        System.out.println("Pizza: Średnia hawajska");
        //Given
        PizzaOrder theOrder = new StandardPizzaOrder();
        theOrder = new HamDecorator(theOrder);
        theOrder = new AnanasDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        String description = theOrder.getDescription();
        System.out.println(description);
        System.out.println("Cena: " + calculatedCost);
        //Then
        assertEquals(new BigDecimal(23), calculatedCost);
        assertEquals("Ciasto, sos, ser + szynka + ananas", description);
    }

    @Test
    public void testPizzaVip() {
        System.out.println("Pizza: Vip Class");
        //Given
        PizzaOrder theOrder = new StandardPizzaOrder();
        theOrder = new HamDecorator(theOrder);
        theOrder = new BaconDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new KabanosDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);
        theOrder = new DoubleCheeseDecorator(theOrder);

        //When
        BigDecimal calculatedCost = theOrder.getCost();
        String description = theOrder.getDescription();
        System.out.println(description);
        System.out.println("Cena: " + calculatedCost);
        //Then
        assertEquals(new BigDecimal(37), calculatedCost);
        assertEquals("Ciasto, sos, ser + szynka + boczek + salami + kabanos + cebula + dodatkowy ser", description);
    }



}
