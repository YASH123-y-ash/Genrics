package com.comparison;

import com.Comparison.Comparison;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComparisonTest {


    @Test
   // UC1-to validate given three integer value gives maximum return true
    public void givenInteger_ShouldReturnLargest()
    {
        Comparison comparison = new Comparison();
        int max = comparison.largest(45,24,98);
        Assertions.assertEquals(98,max);
    }

    @Test
    // UC2-to validate given three float value gives maximum return true
    public void givenFloatObject_ShouldReturnMax()
    {
        float max = Comparison.largest(4.5f,4.6f,4.7f);
        System.out.println(max);
        Assertions.assertEquals(4.7f,max);
    }

    @Test
    // UC3-to validate given three String value gives maximum return true
    public void givenStringObject_ShouldReturnMax()
    {
        String max = Comparison.maximum("Yash","Wardhan","Qweef");
        System.out.println(max);
        Assertions.assertEquals("Yash",max);
    }
}
