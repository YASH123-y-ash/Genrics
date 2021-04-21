package com.comparison;

import com.Comparison.Comparison;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComparisonTest {


    @Test
   // UC1-to validate given three integer value gives maximum return true
    public void givenInteger_ShouldReturnLargest() {
        Comparison comparison = new Comparison();
        int max = comparison.largest(45, 24, 98);
        Assertions.assertEquals(98, max);
    }
}
