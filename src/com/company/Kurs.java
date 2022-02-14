package com.company;

import java.time.LocalDate;

public class Kurs {
    private String name;
    private int number;
    private String surname;
    private LocalDate begindate;

    public Kurs(String name, int number, String surname, LocalDate begindate) {
        this.name = name;
        this.number = number;
        this.surname = surname;
        this.begindate = begindate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBegindate() {
        return begindate;
    }

    public void setBegindate(LocalDate begindate) {
        this.begindate = begindate;
    }
}
