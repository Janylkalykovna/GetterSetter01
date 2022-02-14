package com.company;

import java.time.LocalDate;

public class Student {
    private String name;
    private String surname;
    private int LocalDate;
    private int age;

    public Student(String name, String surname, LocalDate dateofBith, int age) {
        this.name = name;
        this.surname = surname;
        this.LocalDate = LocalDate;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDateofBith() {
        return LocalDate;
    }

    public void setDateofBith(int dateofBith) {
        this.LocalDate = dateofBith;
    }

    public int getAge() {

        return age;

        }

    public void setAge(int age) {
    if (age<0){
        System.out.println("Mynday jaw bolboyt tuura emes");
    }
        this.age = age;
    }
}
