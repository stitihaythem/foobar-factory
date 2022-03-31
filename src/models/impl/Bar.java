package models.impl;

import manager.Inventory;
import models.FooBarAbstract;

import java.util.Random;

public class Bar extends FooBarAbstract {

    public Bar() {
        this.duration = this.getMiningDuration();
    }

    @Override
    public void mine() {
        System.out.println("mining bar");

        System.out.println("duration: " + this.getMiningDuration());
        Inventory.barTotal++;
    }

    @Override
    public void assemble() {
        System.out.println("assembling bar");
        Inventory.barTotal--;
        Inventory.foobarTotal++;
    }

    private long getMiningDuration(){
        Random random = new Random();
        return (long) random.doubles(1.5,3)
                .findFirst()
                .getAsDouble();
    }
}
