package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;


public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<Shape>();


    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    public Shape getFigure(int i) {
    return shapes.get(i);
    }

    public int figuresSize() {
        return shapes.size();
    }

}
