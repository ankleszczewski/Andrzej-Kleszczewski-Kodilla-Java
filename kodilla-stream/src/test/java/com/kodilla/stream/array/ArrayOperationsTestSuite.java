package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given

        int[] fib = new int[20];

        fib[0] = 0;
        fib[1] = 1;
        fib[2] = 1;
        fib[3] = 2;
        fib[4] = 3;
        fib[5] = 5;
        fib[6] = 8;
        fib[7] = 13;
        fib[8] = 21;
        fib[9] = 34;
        fib[10] = 55;
        fib[11] = 89;
        fib[12] = 144;
        fib[13] = 233;
        fib[14] = 377;
        fib[15] = 610;
        fib[16] = 987;
        fib[17] = 1597;
        fib[18] = 2584;
        fib[19] = 4181;

        //When
        double average = ArrayOperations.getAverage(fib);

        //Then
        Assert.assertEquals(average, 547, 0.5);

        }

    }

