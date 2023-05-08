package com.ing.zoo;

import java.util.Random;

public class Zebra extends Animal implements Herbivore {

    public Zebra(String name) {
        super(name);
    }

    @Override
    public void sayHello()
    {
        helloText = "zebra zebra";
        super.sayHello();
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(name + ": " + eatText);
    }
}
