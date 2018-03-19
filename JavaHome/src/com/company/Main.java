package com.company;

/*
package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Hello");

        System.out.println("Enter 2 numbers: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str1 = reader.readLine();
        String str2 = reader.readLine();

        int a = Integer.parseInt(str1);

        int b = Integer.parseInt(str2);

        if (a < b){
            System.out.println(a+"<" +b);
        } else if (a > b) {
            System.out.println(a + ">" + b);
        }else
            System.out.println("Equals!");


    }

 }



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {


        System.out.println("Enter 3 numbers: ");

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String str1 = read.readLine();
        String str2 = read.readLine();
        String str3 = read.readLine();

        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);
        int c = Integer.parseInt(str3);

        int A, B, C;

if (a < b && a < c) {
    A = a;
}
//kjbhjkhhkjkjh



    }
}



public class Main{
    public static void main(String[] args) {

        for (int i=01; i<=50; i++){
            System.out.println( i + " Hello world");
        }
    }
}




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        String[] perem = new String[5];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++){
            System.out.println("Enter variable: ");
            String a = reader.readLine();
            perem[i] = a;
        }
        System.out.println(Arrays.toString(perem));
    }
}




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
*/
/*
/**
 * хз что делать дальще */


/*
public class Main{
    public static void main(String[] args) {
        String[][] student = new String[10][2];

        student[0][0] = "Петров";
        student[0][1] = "Петр";
        student[1][0] = "Сидоров";
        student[1][1] = "Иван";
        student[2][0] = "Сидорчук";
        student[2][1] = "Василий";
        student[3][0] = "Петренко";
        student[3][1] = "Игорь";
        student[4][0] = "Сидоренко";
        student[4][1] = "Тарас";
        student[5][0] = "Ващенко";
        student[5][1] = "Станислав";
        student[6][0] = "Рустанов";
        student[6][1] = "Илья";
        student[7][0] = "Савченко";
        student[7][1] = "Светлана";
        student[8][0] = "Переходюк";
        student[8][1] = "Ирина";
        student[9][0] = "Степанищенко";
        student[9][1] = "Александр";

    }
}
*/


import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;//
// /** ЗАДАЧА №296 */
/*
public class Main {
    public static void main(String[] args) throws IOException {
        int a = 5;
        int b = 3;
        int sum;
        int an = 0;
        int bn = 0;

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите сумму покупки: ");

        String str = read.readLine();
        sum = Integer.parseInt(str);
        do {
            if (sum % 5 == 0 || ((sum-3)%5==0 && ((sum-3) !=0))) {
                sum -= 5;
                an++;

            } if ((sum % 3 == 0 && sum !=0) || ((sum-5)%3==0 && ((sum-5)>0))) {
                sum -= 3;
                bn++;
            }}
            while (sum > 0);



            System.out.println("Лиса должна дать: " + an + " монет" + ", Кот должен дать: " + bn + " монет" + "и получить сдачу" + sum);

*/
/*
    public static boolean mult3(int b, int sum) {
        if (sum %3)
        return true;
    }

    public static boolean mult5(int a, int sum) {
        if (sum %5 )
        return true;
    }

    }
}
*/
 /*
package com.company;

public class Main{
    public static void main(String[] args) {

        Cat murzik = new Cat("Murzik", 2, "male");
        Cat murka = new Cat("Murka", "female");

        System.out.println(murka.gender);
        System.out.println(murzik.name + " " + murzik.age);

        murzik.setAge(1);

        System.out.println(murzik.getAge());

    }
}*/
 /*
 package com.company;
 public class Main{
     public static void main(String[] args) {

         Human Inna = new Human("Inna", 22 );

         Inna.setAge(21);
         Inna.getName("Anni");
         System.out.println(Inna.age + " "+ Inna.getName());

     }
 }*/
/*

 public class Main{
     public static void main(String[] args) {
         Car mb = new Car();
         mb.color = Color.blue;
         mb.weight = 2000;
         mb.model = "W210";
         mb.speed = 300;

         mb.outPut();


        Car vw = new Car(4000, "Crafter", Color.blue, 120);

        vw.outPut();
     }
 }*/

/*
public class Main{
    public static void main(String[] args){

        Building b1 = new Building("Svecha", 1990, 18);
        Building b2 = new Building("Hrusch", 1964, 5);

        b1.info();
        b2.info();
        b1.yearsOld(1990);
    }
}*/
/*

public class Main{
    public static void main(String[] args) {
        Tree dub = new Tree(13, "bereza");
        Tree sosna = new Tree(23, true, "sosna");
        Tree elka = new Tree();

        Tree test = new Tree();
    }
}

class Tree{
    private int age;
    private boolean isLive;
    private String name;

    Tree (int age, String name) {
        this.age = age;
        this.name = name;
    }
    Tree (int age, boolean isLive, String name){
        this.age = age;
        this.isLive = isLive;
        this.name = name;
    }
    Tree(){
        System.out.println("Пустой конструктор сработал!");
    }


}*/


/*
public class Main {
    public static void main(String[] args) {

        Student freshman = new Student(186, "Freshmen", 2);

        freshman.tell();

        Truck faw = new Truck();
        faw.newWeels(6, 1300);
        faw.newWeels(6, 12300);

    }
}*/

/*
class someMain{
    protected int value;
}
 class notSomeMain extends someMain{
    public void setAndPrint (int val){
        this.value = val;
        System.out.println("Значение переменной: " + val);
    }
 }

 public class Main{
     public static void main(String[] args) {
         notSomeMain test = new notSomeMain();
         test.setAndPrint(12);
     }
 }*/
/*
    public class Main{
    public static void main(String[] args) {

        Shape[] arr = new Shape[]{new Circle(), new Square()};

        for (int i = 0; i <arr.length ; i++) {
                arr[i].draw();
        }


    }
}*/
/*

import java.util.Scanner;

class someMain{
    protected Scanner input = new Scanner(System.in);
    protected int age;

    public void askSmth(){
        age = input.nextInt();
    }
}

class innerSomeMain extends someMain{
    private String name;
    public void askSmth(){
        System.out.println("Hello...");
        name = input.nextLine();
        System.out.println("Hello "+ name);
    }
}
public class Main{
    public static void main(String[] args) {
        innerSomeMain abc = new innerSomeMain();
        abc.askSmth();
    }
}*/



public class Main{
    public static void main(String[] args) {

        GUI app = new GUI();
        app.setVisible(true);
    }
}