package com.opencastsoftware.fizzbuzz;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.opencastsoftware.fizzbuzz.generators.*;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

@RunWith(JUnitQuickcheck.class)
public class FizzBuzzTest {

    @Property
    public void containsMultipleOfThree(@From(MultipleOfThree.class) int aMultipleOfThree) {
        assertThat(FizzBuzz.convertToFizzBuzzString(aMultipleOfThree), containsString("fizz"));
    }

    @Property
    public void containsMultipleOfFive(@From(MultipleOfFive.class) int aMultipleOfFive) {
        assertThat(FizzBuzz.convertToFizzBuzzString(aMultipleOfFive), containsString("buzz"));
    }

    @Property
    public void containsMultipleOfThreeAndFive(@From(MultipleOfThreeAndFive.class) int aMultipleOfThreeAndFive) {
        assertEquals(FizzBuzz.convertToFizzBuzzString(aMultipleOfThreeAndFive), "fizzbuzz");
    }

    @Test
    public void testOnetoTwenty() {
        assertEquals("1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz", FizzBuzz.print(1, 20));
    }
}
