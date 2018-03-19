package com.company;

public class Truck extends Car {

    public int wheels = 8;
    public int maxWeight = 7000;

    public void newWeels(int wheels, int maxWeight){
        this.wheels = wheels;
        this.maxWeight = maxWeight;
        System.out.println("Колес: " + wheels + ", макс вес: "+ maxWeight);

    /*public Truck(int w, char c, float s, float max_height){
      //  super(w, c, s);
        this.maxWeight = maxWeight;
        }

*/
    }
}


