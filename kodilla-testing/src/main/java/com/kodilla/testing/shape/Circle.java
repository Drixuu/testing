package com.kodilla.testing.shape;

import java.text.DecimalFormat;

public class Circle implements Shape {

    double radius;
    private static DecimalFormat round = new DecimalFormat("0.00");

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName () {
        return "Circle";
    }

    @Override
    public double getField () {
        return Math.PI * (radius * radius);
    }

    @Override
    public String toString() {
        return "This circle has field of: " + round.format(Math.PI * (radius * radius));
    }
}
