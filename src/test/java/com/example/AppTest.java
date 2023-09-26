package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest 
{
    final float ACCEPTED_DIFFERENCE = 0.01f;

    @Test
    public void shouldConvertKmToMiles(){
        //Given 
        float km = 10;
        float expectedMiles = 6.2137f;

        //Action
        UnitConverter uc = new UnitConverter();
        float result = uc.convertKmToMiles(km);

        //Check
        boolean condition = (result - expectedMiles) < ACCEPTED_DIFFERENCE;
        assertTrue(condition);
    }

    @Test
    public void shouldConvertLbToKg(){
        //Given
        float lbs = 10;
        float expectedKgs = 4.5359f;

        //Action
        UnitConverter uc = new UnitConverter();
        float result = uc.convertLbToKg(lbs);

        //Check
        boolean condition = (result - expectedKgs) < ACCEPTED_DIFFERENCE;
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
        boolean condition = (expectedFarenheit - result) < ACCEPTED_DIFFERENCE;
        assertTrue(condition);
    }

}
