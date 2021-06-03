package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> figures= new ArrayList<>();

    public List<Shape> getFiguresList() {
        return figures;
    }

    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public void removeFigure(Shape shape) {
        figures.remove(shape);
    }

    public Shape getFigure(int n) {
        return figures.get(n);
    }

    public String showFigures() {
        System.out.println(figures);
        return figures.toString();
    }
}
