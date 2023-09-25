package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest 
{

    @Test
    public void shouldConvertKmToMiles(){
        UnitConverter uc = new UnitConverter();
        boolean condition = uc.convertKmToMiles(10) == 6.2137f;
        assertTrue(condition);
    }

    @Test
    public void shouldConvertLbToKg(){
        UnitConverter uc = new UnitConverter();
        boolean condition = uc.convertLbToKg(5.5f) == 24.9476f;
        assertTrue(condition);
    }
   
    @Test
    public void shouldConvertCelsiusToFarenheit(){
        UnitConverter uc = new UnitConverter();
        boolean condition = uc.convertCelsiusToFh(32) == 89.6f;
        assertTrue(condition);
    }

}
