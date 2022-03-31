package models.impl;

import manager.Inventory;
import models.FooBarAbstract;

public class Foo extends FooBarAbstract {

    public Foo() {
        this.duration = 1;
    }

    @Override
    public void mine() {
        System.out.println("mining foo");
        Inventory.fooTotal++;
    }

    @Override
    public void assemble() {
        System.out.println("assembling foo");
        Inventory.fooTotal--;
        Inventory.foobarTotal++;
    }


}
