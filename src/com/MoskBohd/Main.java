package com.MoskBohd;

import com.MoskBohd.Builder.MyInteger;
import com.MoskBohd.Builder.Student;
import com.MoskBohd.Factory.*;

public class Main {

    public static void main(String[] args) {

        IsoscelesTrapezoid isoscelesTrapezoid = IsoscelesTrapezoidFactory.create(5, 11, 4);
        System.out.println(isoscelesTrapezoid);
        Triangle triangle = (Triangle) AbstractFigureFactory.create(2, 4, 6, Figure.TRIANGLE);
        System.out.println(triangle);

        Student student = new Student.Builder()
                .withFirstName("Bohdan")
                .withLastName("Moskalskyi")
                .withPatronymic("Andriyovich")
                .build();
        System.out.println(student);

        // my integer
        MyInteger myInteger = new MyInteger();
        System.out.println(myInteger.isPrime(5));
    }
}
