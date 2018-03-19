package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cat murka = new Cat(4, true, true, new Color(223,145,65), 2.3, true);
        /*murka.fur = true;
        murka.isAlive = true;
        murka.name = "Murka";
        murka.paws = 4;
        murka.tail = true;
        murka.weight = 3.0;
        murka.eyeColor = Color.RED;*/
        System.out.println(murka.weight);
        System.out.println(murka.fur);
        System.out.println(murka.isAlive);
        System.out.println(murka.name);
        System.out.println(murka.paws);
        System.out.println(murka.tail);
        System.out.println(murka.eyeColor);
        System.out.println(murka.weight);
        System.out.println(Cat.rodoslovnaya);
        System.out.println("Counter is: " + Cat.counter);


        Cat vaska = new Cat();
        vaska.fur = false;
        vaska.isAlive = true;
        vaska.name = "Vaska";
        vaska.paws = 4;
        vaska.tail = true;
        vaska.weight = 5.0;
        vaska.eyeColor = Color.BLACK;
        System.out.println("\n\n");
        System.out.println(vaska.weight);
        System.out.println(vaska.fur);
        System.out.println(vaska.isAlive);
        System.out.println(vaska.name);
        System.out.println(vaska.paws);
        System.out.println(vaska.tail);
        System.out.println("somegetter" + vaska.getName());
        System.out.println(vaska.weight);
        vaska.setName("SomeNewRandomName");
        System.out.println("getter " + vaska.getName());
        vaska.setWeight(3.2);
        System.out.println("new Weight is: " + vaska.getWeight());
        vaska.setIsAlive(false);
        System.out.println("Vaska now " + vaska.getIsAlive());
        System.out.println("Counter is: " + Cat.counter);

    }
}
