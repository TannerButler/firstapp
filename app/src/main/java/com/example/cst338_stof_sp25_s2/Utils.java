package com.example.cst338_stof_sp25_s2;

public class Utils {
    public static double ctof(double celsius){
        return (celsius * 1.8) + 32;
    }

    public static double ftoc(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }
}
