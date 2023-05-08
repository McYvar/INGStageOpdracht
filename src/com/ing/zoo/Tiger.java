package com.ing.zoo;

import java.util.Random;

public class Tiger extends TrickAnimal implements Carnivore {

    public Tiger(String name, String... tricks) {
        super(name, tricks);
    }

    @Override
    public void sayHello()
    {
        helloText = "rraaarww";
        super.sayHello();
    }

    @Override
    public void eatMeat()
    {
        eatText = "nomnomnom oink wubalubadubdub"; // yea I get the rick and morty ref here hehe
        System.out.println(name + ": " + eatText);
    }

    /*
    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
     */
}
