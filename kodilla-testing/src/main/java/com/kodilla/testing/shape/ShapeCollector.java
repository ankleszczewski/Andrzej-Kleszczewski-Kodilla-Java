package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;


public class ShapeCollector {
    List<String> shapes;

    public ShapeCollector(List<String> shapes) {
        this.shapes = shapes;
    }

    void addFigure(List<String> shapes, Shape shape) {
        String figure = shape.getShapeName();
        shapes.add(figure);

    }
    void removeFigure(List<String> shapes, Shape shape) {
        String figure = shape.getShapeName();
        shapes.remove(figure);
    }
    String getFigure(List<String> shapes, int i) {
        return shapes.get(i);
    }

    public List<String> getShapes() {
        return shapes;
    }
}
