package com.company;

public class Cat {

    String name;
    int age;
    String gender;

    public Cat(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public Cat(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


