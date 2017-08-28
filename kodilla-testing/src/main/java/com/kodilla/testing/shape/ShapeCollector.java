package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;


public class ShapeCollector {
    List<String> shapes;

    public ShapeCollector(List<String> shapes) {
        this.shapes = shapes;
    }

    String addFigure(Shape shape) {
        return shape.getShapeName();

    }
    String removeFigure(Shape shape) {
        return shape.getShapeName();
    }
    String getFigure(List<String> shapes, int i) {
        return shapes.get(i);
    }

    public List<String> getShapes() {
        return shapes;
    }
}
