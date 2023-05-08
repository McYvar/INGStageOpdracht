package com.ing.zoo;

public class Giraffe extends TrickAnimal implements Herbivore {

    public Giraffe(String name, String... tricks) {
        super(name, tricks);
    }

    @Override
    public void sayHello() {
        helloText = "wazzup";
        super.sayHello();
    }

    @Override
    public void eatLeaves() {
        eatText = "hapslikweg";
        System.out.println(name + ": " + eatText);
    }
}
