package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    static List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<Integer>();
        for (Integer number: numbers) {
            if (numbers.get(number) % 2 == 0) {
            oddNumbers.add(numbers.get(number));
            }
        }
        return oddNumbers;
    }
}