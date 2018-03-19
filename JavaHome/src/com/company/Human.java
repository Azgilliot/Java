package com.company;

public class Human {

    String name = "unknown";
    int age = 0;
    float height = 123.4f;
    int weight = 99;
    String gender = "not indicated";

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;


    }
}
