package com.company;

import newpackage.SphericalHorse;

public class SphericalHorseInVacuum extends SphericalHorse implements Breathe {
    @Override
    public void neigh() {
        System.out.println("Horse is neighing in costume");
    }

    @Override
    public void gallop() {
        System.out.println("Run with jetpack");
    }

    @Override
    public String toString() {
        return "Spherical horse in vacuum";
    }

    @Override
    public void breathe() {
        System.out.println("OK, horse in vacuume can breath on vacuum");
    }
}
