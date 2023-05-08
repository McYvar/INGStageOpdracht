package com.ing.zoo;

import java.util.Random;

public class TrickAnimal extends Animal {
    public String[] tricks;

    public TrickAnimal(String name, String ... tricks) {
        super(name);
        this.tricks = tricks;
    }

    public void performTrick() {
        if (tricks.length == 0) {
            System.out.println(name + " didn't learn any tricks...");
            return;
        }
        Random random = new Random();
        int rnd = random.nextInt(tricks.length);
        System.out.println(name + " performs: " + tricks[rnd]);
    }
}
