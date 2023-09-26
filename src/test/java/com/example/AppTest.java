package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest 
{

    @Test
    public void shouldConvertKmToMiles(){
        //Given 
        float km = 10;
        float miles = 6.2137f;

        //Action
        UnitConverter uc = new UnitConverter();
        float result = uc.convertKmToMiles(km);

        //Check
        boolean condition = result == miles;
        assertTrue(condition);
    }

    @Test
    public void shouldConvertLbToKg(){
        //Given
        float lbs = 10;
        float kgs = 4.5359f;

        //Action
        UnitConverter uc = new UnitConverter();
        float result = uc.convertLbToKg(lbs);

        //Check
        boolean condition = result == kgs;
        assertTrue(condition);
    }
   
    @Test
    public void shouldConvertCelsiusToFarenheit(){
        //Given
        float celsius = 35;
        float expectedFarenheit = 95;

        //Action
        UnitConverter uc = new UnitConverter();
        float result = uc.convertCelsiusToFh(celsius);

        //Check
        boolean condition = result == expectedFarenheit;
        assertTrue(condition);
    }

}
