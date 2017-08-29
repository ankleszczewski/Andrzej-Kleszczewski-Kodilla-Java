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
        ShapeCollector shapeCollector = new ShapeCollector(new ArrayList<String>());
        shapeCollector.shapes.add("Circle");
        //When
        ShapeCollector testShapeCollector = new ShapeCollector(new ArrayList<String>());
        testShapeCollector.addFigure(testShapeCollector.shapes, new Circle());
        //Then
        Assert.assertEquals(shapeCollector.getShapes(), testShapeCollector.getShapes());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector(new ArrayList<String>());
        shapeCollector.shapes.add("Circle");
        shapeCollector.shapes.add("Triangle");
        shapeCollector.shapes.add("Square");
        shapeCollector.shapes.remove("Circle");
        //When
        ShapeCollector testShapeCollector = new ShapeCollector(new ArrayList<String>());
        testShapeCollector.shapes.add("Circle");
        testShapeCollector.shapes.add("Triangle");
        testShapeCollector.shapes.add("Square");
        testShapeCollector.removeFigure(testShapeCollector.shapes, new Circle());
        //Then
        Assert.assertEquals(shapeCollector.getShapes(), testShapeCollector.getShapes());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector(new ArrayList<String>());
        shapeCollector.shapes.add("Circle");
        shapeCollector.shapes.add("Triangle");
        shapeCollector.shapes.add("Square");
        String shape = shapeCollector.shapes.get(1);
        //When
        ShapeCollector testShapeCollector = new ShapeCollector(new ArrayList<String>());
        testShapeCollector.shapes.add("Circle");
        testShapeCollector.shapes.add("Triangle");
        testShapeCollector.shapes.add("Square");
        String testShape = testShapeCollector.getFigure(testShapeCollector.shapes, 1);
        //Then
        Assert.assertEquals(shape, testShape);

    }
}
