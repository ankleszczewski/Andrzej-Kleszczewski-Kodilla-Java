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
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        Shape circle = new Circle();
        shapeCollector.addFigure(circle);

        //Then
        Assert.assertEquals(shapeCollector.shapes.size(), 1);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle();
        Shape square = new Square();
        Shape triangle = new Triangle();
        shapeCollector.shapes.add(circle);
        shapeCollector.shapes.add(square);
        shapeCollector.shapes.add(triangle);
        //When
        shapeCollector.removeFigure(circle);
        //Then
        Assert.assertEquals(shapeCollector.shapes.size(), 2);
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle();
        Shape square = new Square();
        Shape triangle = new Triangle();
        shapeCollector.shapes.add(circle);
        shapeCollector.shapes.add(square);
        shapeCollector.shapes.add(triangle);
        //When
        Shape figure = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(figure, circle);


    }
}
