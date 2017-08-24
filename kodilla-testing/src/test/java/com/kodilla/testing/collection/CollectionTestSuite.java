package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;


import org.junit.*;

import java.util.*;


public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
            public void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> numbers = new ArrayList<Integer>();

        //When
        List<Integer> oddNumbers = OddNumbersExterminator.exterminate(numbers);
        System.out.println("Testing empty list");

        //Then
        Assert.assertEquals(oddNumbers.size(), 0);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> numbers = new ArrayList<Integer>();
        for(Integer i=0; i<10; i++) {
            numbers.add(i);
        }
        List<Integer> testNumbers = new ArrayList<Integer>();
        testNumbers.add(0);
        testNumbers.add(2);
        testNumbers.add(4);
        testNumbers.add(6);
        testNumbers.add(8);



        //When
        List<Integer> oddNumbers = OddNumbersExterminator.exterminate(numbers);
        System.out.println("Testing list with numbers");

        //Then
        Assert.assertEquals(oddNumbers, testNumbers);
        }
    }
