package com.kodilla.testing.shape;

public class Triangle implements Shape {

    double a;
    double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public String getShapeName () {
        return "Triangle";
    }

    @Override
    public double getField () {
        return (a*h)/2;
    }

    @Override
    public String toString() {
        return "This triangle has field of: " + (a*h)/2;
    }
}
