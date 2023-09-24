package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void shouldConvertKmToMiles(){
        UnitConverter uc = new UnitConverter();
        boolean condition = uc.convertKmToMiles(10) == 16f;
        assertTrue(condition);
    }

    @Test
    public void shouldConvertLbToKg(){
        UnitConverter uc = new UnitConverter();
        boolean condition = uc.convertLbToKg(5.5f) == 10f;
        assertTrue(condition);
    }

    public void shouldConvertCelsiusToFarenheit(){
        UnitConverter uc = new UnitConverter();
        boolean condition = uc.convertCelsiusToFh(1) == 73f;
        assertTrue(condition);
    }

}
