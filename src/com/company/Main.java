package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Kurs k = new Kurs("Java",5,"Peaksoft", LocalDate.of(2020,1,24));
        Student s= new Student("Janyl", "Barpybaeva", LocalDate.of(1991,11,10),12);
        System.out.println(k.getName()+k.getNumber()+k.getSurname()+k.getBegindate());
        System.out.println(s.getName()+s.getSurname()+s.getAge());
    }
}

