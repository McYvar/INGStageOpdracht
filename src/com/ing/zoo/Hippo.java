package com.ing.zoo;

public class Hippo extends Animal implements Herbivore {

    public Hippo(String name) {
        super(name);
    }

    @Override
    public void sayHello()
    {
        helloText = "splash";
        super.sayHello();
    }

    @Override
    public void eatLeaves() {
        eatText = "munch munch lovely";
        System.out.println(name + ": " + eatText);
    }

}
