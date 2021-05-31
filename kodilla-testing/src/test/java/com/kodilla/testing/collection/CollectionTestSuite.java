package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("when oddNumbersExterminator get empty list, " +
            "then exterminate should print empty list"
    )

    @Test
    void testOddNumbersExterminatorEmptyList () {
        //Given
        List<Integer> emptyList = Arrays.asList();
        //When
        List<Integer> resultList = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing for empty list");
        //Then
        Assertions.assertEquals(emptyList, resultList);
    }

    @DisplayName("when oddNumbersExterminator get filled numbers list, " +
            "then exterminate should return even numbers list"
    )

    @Test
    void testOddNumbersExterminatorNormalList () {
        //Given
        List<Integer> oddList = Arrays.asList(1,3,7,13);
        List<Integer> evenList = Arrays.asList(2,6,20);
        //When
        List<Integer> resultList = oddNumbersExterminator.exterminate(evenList);
        System.out.println("Testing if inputs are even numbers");
        //Then
        Assertions.assertEquals(evenList, resultList);
    }
}
