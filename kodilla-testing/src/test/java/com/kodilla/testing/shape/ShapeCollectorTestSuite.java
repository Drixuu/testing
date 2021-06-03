package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.text.DecimalFormat;

@DisplayName("Figures Test Suite \ud83d\ude2d")
public class ShapeCollectorTestSuite {

    ShapeCollector shapeCollector = new ShapeCollector();
    Circle circle = new Circle(4);
    Square square = new Square(8);
    Triangle triangle = new Triangle(32, 53);
    private static DecimalFormat round = new DecimalFormat("0.00");

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Nested
    @DisplayName("Test for adding and removing")
    class TestFigures {
        @Test
        void testAddFigure() {
            //Given
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(triangle);
            //When
            shapeCollector.addFigure(square);
            //Then
            Assertions.assertEquals(3, shapeCollector.getFiguresList().size());
        }

        @Test
        void testRemoveFigure() {
            //Given
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(triangle);
            //When
            shapeCollector.removeFigure(square);
            //Then
            Assertions.assertEquals(2, shapeCollector.getFiguresList().size());
        }
    }

    @Nested
    @DisplayName("Test for receiving info")
    class TestReceivingInfo {
        @Test
        void testGetFigure() {
            //Given
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(triangle);
            //When
            shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(circle, shapeCollector.getFiguresList().get(0));
        }

        @Test
        void testShowFigures() {
            //Given
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(triangle);
            //When
            shapeCollector.showFigures();
            //Then
            Assertions.assertEquals("[This circle has field of: " + round.format(circle.getField()) + ", This triangle has field of: " + triangle.getField() + "]", shapeCollector.showFigures());
        }
    }
}
