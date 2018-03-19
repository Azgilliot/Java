package com.company;

public class Building {
    public String name;
    public int year;
    public int floors;

    public Building(String name, int year, int floors) {
        this.name = name;
        this.year = year;
        this.floors = floors;
    }

    public void info(){
        System.out.println("namr is: " + name + " year: " + year + " floors: " + floors);
    }

    public void yearsOld(int year){
        System.out.println("Возраст дома: " + (2015-year) );
    }
}
