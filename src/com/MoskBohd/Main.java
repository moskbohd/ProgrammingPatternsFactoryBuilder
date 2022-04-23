package com.MoskBohd;

public class Main {

    public static void main(String[] args) {

        IsoscelesTrapezoid isoscelesTrapezoid = IsoscelesTrapezoidFactory.create(5, 11, 4);
        System.out.println(isoscelesTrapezoid);
        Triangle triangle = (Triangle) AbstractFigureFactory.create(2, 4, 6, Figure.TRIANGLE);
        System.out.println(triangle);
    }
}
