package com.ing.zoo;

public class Cat extends TrickAnimal implements Herbivore, Carnivore {
    public Cat(String name, String... tricks) {
        super(name, tricks);
    }

    @Override
    public void sayHello() {
        helloText = "Meow";
        super.sayHello();
    }

    @Override
    public void eatMeat() {
        eatText = "*gulp* purr purr";
        System.out.println(name + ": " + eatText);
    }

    @Override
    public void eatLeaves() {
        eatText = "*bleh* ...";
        System.out.println(name + ": " + eatText);
    }
}
