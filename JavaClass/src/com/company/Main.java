/*
package com.company;

public class Main {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) // simple "for" cycle
        {
            System.out.println(i);
        }

        // array creation
        int[] a = new int[5];

        int[] b = {13, 15, 16, 23, 2312}; //with initialization

        int[][] c = new int[5][5];

        int[][] d = {
                {13, 15, 16, 23},
                {23, 36, 57, 58}
        };

        c[0][0] = 5;

        a[0] = 0; // put new value (0) into array index 0
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        a[4] = 4;

        System.out.println("Length of b " + b.length);

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);

        System.out.println("element is " + d[0][2]);


        // simple example of 2d array
        String[][] names = {
                {"1", "Roman"},
                {"2", "Indus"}
        };


        for (int j = 0; j < names.length; j++) {
            if (j == 4)
                continue;
            System.out.println("j is : " + j);
        }
    }
}
*/

/*package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;*/


//        boolean[] someNewItems = new boolean[10];
//        someNewItems[0] = true;
//        someNewItems[1] = true;
//        someNewItems[2] = false;
//        someNewItems[3] = true;
//        someNewItems[4] = false;
//
//        System.out.println(someNewItems[0] + " " +someNewItems[1] + " " +someNewItems[2] + " " +someNewItems[3] + " " +someNewItems[4] + " " + someNewItems[6]);

/*int gas =100;
while (gas >0){
    System.out.println(gas);
    gas--;
}
        System.out.println("out of loop body");*/


//System.out.println((10000 + Math.random()*8999));
/*

        int gas = 0;
        do {
            System.out.println("gas is 0");
        } while (gas > 0);


    }

    {


        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }
*/
     /*   public class Main {

        public static void main (String[]args) throws IOException {
            int a = Integer.parseInt(input("Размерность массива:"));
            String[] stringArray = new String[a];

            for (int i = 0; i < stringArray.length; i++) {

                stringArray[i] = input("ВВедите значение элемента" + i);
            }
        }




        public static String input (String value) throws IOException {

            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the value " + value + " : ");
            return reader.readLine();
        }


    }*/

/*package com.company;

public class Main {
    public static void main(String[] args) {

    SphericalHorseInVacuum sphericalHorseInVacuum = new SphericalHorseInVacuum();

    sphericalHorseInVacuum.neigh();
    sphericalHorseInVacuum.gallop();
        System.out.println(sphericalHorseInVacuum);
        SphericalHorseOnSun sphericalHorseOnSun = new SphericalHorseOnSun();
        sphericalHorseOnSun.neigh();
        sphericalHorseOnSun.gallop();

        sphericalHorseInVacuum.breathe();
        sphericalHorseOnSun.breathe();
    }
}*/
/*

package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("text0");
        arrayList.add("text1");
        arrayList.add("text2");
        arrayList.add("text3");
        arrayList.add("text4");

        */
/*arrayList.set(2, "New element");

        System.out.println(arrayList.get(2));

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }*//*

      //  for (String var : arrayList) System.out.println(var);
        arrayList.forEach(System.out::println);


        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "val 1");
        hashMap.put(2, "val 2");
        hashMap.put(3, "val 3");
        hashMap.put(4, "val 4");
        hashMap.put(1, "val 5");

        //System.out.println(hashMap.get(1));
        for (Map.Entry<Integer, String> map : hashMap.entrySet()){
           */
/* map.getKey();
            map.getValue();*//*


            System.out.println(map.getKey() + " " + map.getValue());
        }

        Date date = new Date();
        System.out.println(date);



    }
}
*/

package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        input();

    }



        public static void input(){
            BufferedReader br;

            br = new BufferedReader(new InputStreamReader(System.in));
            try {
                Integer.parseInt(br.readLine());
                throw new IOException();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e){
                System.out.println("wrong formate");
                try {

                    try {
                        Integer.parseInt(br.readLine());
                    } catch (IOException e1) {

                    }

                } catch (NumberFormatException e1  ) {
                    System.out.println("Failed Try, dummy!");
                    System.exit(1);
                }
            }
        }



}