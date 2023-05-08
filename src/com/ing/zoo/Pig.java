package com.ing.zoo;

import java.util.Random;

public class Pig extends TrickAnimal implements Herbivore, Carnivore {

    public Pig(String name, String... tricks) {
        super(name, tricks);
    }

    @Override
    public void sayHello()
    {
        helloText = "splash";
        super.sayHello();
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch oink";
        System.out.println(name + ": " + eatText);
    }

    @Override
    public void eatMeat()
    {
        eatText = "nomnomnom oink thx";
        System.out.println(name + ": " + eatText);
    }

    /*
    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "rolls in the mud";
        }
        else
        {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
     */
}
