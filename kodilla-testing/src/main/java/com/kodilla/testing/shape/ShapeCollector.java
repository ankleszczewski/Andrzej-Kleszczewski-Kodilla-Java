package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;


public class ShapeCollector {

    List<Shape> shapes = new ArrayList<Shape>();


    void addFigure(Shape shape) {
        shapes.add(shape);
    }

    void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    Shape getFigure(int i) {
    return shapes.get(i);

    }

}
