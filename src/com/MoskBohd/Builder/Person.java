package com.MoskBohd.Builder;

import java.time.LocalDate;

public class Person {

    private String firstName;
    private String lastName;
    private String patronymic;
    private LocalDate dateOFBirth;

    public Person(String firstName, String lastName, String patronymic, LocalDate dateOFBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.dateOFBirth = dateOFBirth;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOFBirth() {
        return dateOFBirth;
    }

    public void setDateOFBirth(LocalDate dateOFBirth) {
        this.dateOFBirth = dateOFBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOFBirth=" + dateOFBirth +
                '}';
    }


}
