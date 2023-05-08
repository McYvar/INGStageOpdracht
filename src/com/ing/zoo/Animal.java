package com.ing.zoo;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    public static List<Animal> animals = new ArrayList<>();

    public String name;
    public String helloText;
    public String eatText;

    // non-trick animals
    public Animal(String name) {
        this.name = name;
        animals.add(this);
    }

    public void sayHello() {
        System.out.println(name + " says " + helloText);
    }
}
