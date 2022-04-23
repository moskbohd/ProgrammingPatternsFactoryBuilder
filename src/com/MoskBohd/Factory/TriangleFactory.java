package com.MoskBohd.Factory;

public class TriangleFactory {

    public static Triangle create(double a, double b, double c){

        if (a + b > c) return null;
        return new Triangle(a, b, c);
    }
}
