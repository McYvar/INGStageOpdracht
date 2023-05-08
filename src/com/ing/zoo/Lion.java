package com.ing.zoo;

public class Lion extends Animal implements Carnivore {

    public Lion(String name) {
        super(name);
    }

    @Override
    public void sayHello()
    {
        helloText = "roooaoaaaaar";
        super.sayHello();
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom thx mate";
        System.out.println(name + ": " + eatText);
    }
}
