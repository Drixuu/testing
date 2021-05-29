package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;


public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("\n" + "Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();

        int addResult = calculator.add(21, 346);
        int substractResult = calculator.subtract(345, 3);

        if (addResult != 0) {
            System.out.println("Result is: " + addResult);
        } else {
            System.out.println("Add result is 0");
        }

        if (substractResult != 0) {
            System.out.println("Result is: " + substractResult);
        } else {
            System.out.println("Substraction result is 0");
        }
    }
}