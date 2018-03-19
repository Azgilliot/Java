package com.company;

import newpackage.SphericalHorse;

public class SphericalHorseOnSun extends SphericalHorse implements Breathe {

    @Override
    public void neigh() {
        System.out.println("Horse is neighting on sun");
    }


    @Override
    public void breathe() {
        System.out.println("Ok, horse in vacuume can breathe on Sun");
    }
}
