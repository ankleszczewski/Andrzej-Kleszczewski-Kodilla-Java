package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        Calculator calculator = new Calculator(2, 1);

        String result = SimpleUser.getUsername();

        int addResult = Calculator.add();
        int substractResult = Calculator.substract();

        //SimpleUser Test
        if (result.equals("theForumUser")) {
            System.out.println("SimpleUser Test OK");
        } else {
            System.out.println("SimpleUser Error!");
        }

        //Calculator Test
        if (addResult == 2 + 1) {
            System.out.println("Calculator add Test OK");
        } else {
            System.out.println("Caculator add Error!");
        }

        if (substractResult == 2 - 1) {
            System.out.println("Calculator substract Test OK");
        } else {
            System.out.println("Calculator substract Test Error!");
        }

    }
}
