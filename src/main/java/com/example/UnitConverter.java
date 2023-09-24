package com.example;

public class UnitConverter {
    public float convertKmToMiles(float kilometers){
        float miles = kilometers * 1.6f;
        return miles;
    }

    public float convertCelsiusToFh(float celsius){
        float farenheit =  (celsius * 9/5) + 32;
        return farenheit;
    }

    public float convertLbToKg(float lbs){
        float kgs = lbs / 2.205f;
        return kgs;
    }
}
