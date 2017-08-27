package com.kodilla.testing.shape;

import java.util.List;

public class ShapeCollector {
     static String addFigure(Shape shape) {
        return shape.getShapeName();

    }
    static String removeFigure(Shape shape) {
    return shape.getShapeName();
    }
    static String getFigure(List<String> shape, int i) {
    return shape.get(i);
    }
}
