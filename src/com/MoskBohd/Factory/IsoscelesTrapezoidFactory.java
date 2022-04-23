package com.MoskBohd.Factory;

public class IsoscelesTrapezoidFactory {

    public static IsoscelesTrapezoid create(double lengthUp, double lengthDown, double height){
        // find is isosceles trapezoid
        double lengthOfSideA = 2 * (lengthDown + lengthUp) * height / 2 / height - lengthDown;
        if (lengthOfSideA != lengthUp) return null;
        return new IsoscelesTrapezoid(lengthUp, lengthDown, height);
    }
}
