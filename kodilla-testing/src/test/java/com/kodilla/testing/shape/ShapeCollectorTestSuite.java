package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        List<String> shapes = new ArrayList<String>();
        shapes.add("Circle");
        //When
        List<String> testShapes = new ArrayList<String>();
        testShapes.add(ShapeCollector.addFigure(new Circle()));
        //Then
        Assert.assertEquals(shapes, testShapes);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        List<String> shapes = new ArrayList<String>();
        shapes.add("Circle");
        shapes.add("Triangle");
        shapes.add("Square");
        shapes.remove("Circle");
        //When
        List<String> testShapes = new ArrayList<String>();
        testShapes.add("Circle");
        testShapes.add("Triangle");
        testShapes.add("Square");
        testShapes.remove(ShapeCollector.removeFigure(new Circle()));
        //Then
        Assert.assertEquals(shapes, testShapes);
    }

    @Test
    public void testGetFigure() {
        //Given
        List<String> shapes = new ArrayList<String>();
        shapes.add("Circle");
        shapes.add("Triangle");
        shapes.add("Square");
        String shape = shapes.get(1);
        //When
        List<String> testShapes = new ArrayList<String>();
        testShapes.add("Circle");
        testShapes.add("Triangle");
        testShapes.add("Square");
        String testShape = ShapeCollector.getFigure(testShapes,1);
        //Then
        Assert.assertEquals(shape, testShape);

    }
}
