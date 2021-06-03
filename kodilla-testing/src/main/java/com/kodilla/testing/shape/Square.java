package com.kodilla.testing.shape;

public class Square implements Shape {

    double fieldNumber;

    public Square(double fieldNumber) {
        this.fieldNumber = fieldNumber;
    }

    @Override
    public String getShapeName () {
        return "Square";
    }

    @Override
    public double getField () {
        return fieldNumber * fieldNumber;
    }

    @Override
    public String toString() {
        return "This square has field of: " + fieldNumber * fieldNumber;
    }
}
