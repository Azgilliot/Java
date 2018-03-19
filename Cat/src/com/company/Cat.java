package com.company;

import java.awt.*;

public class Cat {

    int paws;
    boolean fur;
    String name;
    boolean tail;
    Color eyeColor;
    double weight;
    boolean isAlive;
    static String rodoslovnaya = "Britain";
    static int counter = 0;

    public Cat(int paws, boolean fur, boolean tail, Color eyeColor, double weight, boolean isAlive ){
        this.paws = paws;
        this.fur = fur;
        this.tail = tail;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.isAlive = isAlive;
        counter++;

    }
    /*public Cat(String name, int paws, boolean fur, boolean tail, Color eyeColor, double weight, boolean isAlive){
        this.name = name;
        this.paws = paws;
        this.fur = fur;
        this.tail = tail;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.isAlive = isAlive;
    }*/




   /* public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    public boolean getIsAlive(){
        return false;
    }
    public void setIsAlive(boolean isAlive){
        this.isAlive = isAlive;
    }*/




}
