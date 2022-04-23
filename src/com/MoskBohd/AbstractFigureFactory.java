package com.MoskBohd;

public class AbstractFigureFactory {
    public static IFigure create(double a, double b, double c, Figure figure){

        switch (figure){
            case ISOSCELESTRAPEZOID:
                return IsoscelesTrapezoidFactory.create(a, b, c);
            case TRIANGLE:
                return new Triangle(a, b, c);
        }
        return null;
    }
}
