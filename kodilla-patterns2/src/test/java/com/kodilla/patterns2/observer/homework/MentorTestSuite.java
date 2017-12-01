package com.kodilla.patterns2.observer.homework;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Exercises exercise1 = new Exercises("Write some code");
        Exercises exercise2 = new Exercises("Write some more code");
        Exercises exercise3 = new Exercises("More and more code");

        Mentor janNowak = new Mentor("Jan Nowak");
        Mentor nowakJan = new Mentor("Nowak Jan");

        exercise1.registerObserver(janNowak);
        exercise1.registerObserver(nowakJan);
        exercise2.registerObserver(janNowak);
        exercise2.registerObserver(nowakJan);
        exercise3.registerObserver(janNowak);

        //When
        exercise1.addTask("Well done");
        exercise2.addTask("Remarks");
        exercise3.addTask("Waiing for check");

        //Then
        assertEquals(3, janNowak.getUpdateCount());
        assertEquals(2, nowakJan.getUpdateCount());

    }
}
