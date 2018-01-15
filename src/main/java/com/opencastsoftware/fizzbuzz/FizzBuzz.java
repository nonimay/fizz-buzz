package com.opencastsoftware.fizzbuzz;


import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzz {

    public static String print(int start, int end) {
        Stream<String> s = IntStream.rangeClosed(start, end).mapToObj(i -> convertToFizzBuzzString(i));
        return s.collect(Collectors.joining(" "));
    }

    public static String convertToFizzBuzzString(int i) {
        if (i % 15 == 0) {
            return "fizzbuzz";
        } else if (i % 3 == 0) {
            return "fizz";
        } else if (i % 5 == 0) {
            return "buzz";
        } else {
            return String.valueOf(i);
        }
    }
}
