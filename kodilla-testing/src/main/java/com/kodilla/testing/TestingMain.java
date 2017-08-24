package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main() {
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        Calculator calculator = new Calculator(2, 1);

        String result = simpleUser.getUsername();

        int addResult = calculator.add();
        int substractResult = calculator.substract();

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

