package com.company;

import java.awt.*;

public class Car {
    public int weight;
    public String model;
    public char color;
    public int speed;


    public void outPut(){
        System.out.println("Марка авто: " + model + ", Вес: " + weight + ", цвет: " + color + ", Скорость: " + speed);
    }

    public Car(int w, String m, char c, int s) {
        weight = w;
        model = m;
        color = c;
        speed = s;
    }

    public Car(){}
}
