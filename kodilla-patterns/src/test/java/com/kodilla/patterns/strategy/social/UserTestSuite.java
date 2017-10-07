package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User richard = new Millenials("Richard Smith");
        User john = new YGeneration("John Connor");
        User kodilla = new ZGeneration("Kodilla");
        //When
        String richardShouldUse = richard.sharePost();
        System.out.println("Richard should use: " + richardShouldUse);
        String johnShouldUse = john.sharePost();
        System.out.println("John should use: " + johnShouldUse);
        String kodillsShouldUse = kodilla.sharePost();
        System.out.println("Kodills should use: " + kodillsShouldUse);
        //Then
        Assert.assertEquals(richardShouldUse, "Snapchat");
        Assert.assertEquals(johnShouldUse, "Facebook");
        Assert.assertEquals(kodillsShouldUse, "Twitter");
    }

    @Test
    public void blictestIndividualSharingStrategy() {
        //Given
        User richard = new Millenials("Richard Smith");
        //When
        String richardShouldUse = richard.sharePost();
        System.out.println("Richard should use: " + richardShouldUse);
        richard.setSocialPublisher(new FacebookPublisher());
        richardShouldUse = richard.sharePost();
        System.out.println("Richard now should use: " + richardShouldUse);
        //Then
        Assert.assertEquals(richardShouldUse, "Facebook");


    }
}
