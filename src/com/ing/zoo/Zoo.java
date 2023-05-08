package com.ing.zoo;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        // rather than using each animal their class name, I find it more dynamic to order them in a animal list upon creation
        Lion henk = new Lion("henk");
        Hippo elsa = new Hippo("elsa");
        Pig dora = new Pig("dora",              // trick animal
                "rolls in the mud",
                "runs in circles");
        Tiger wally = new Tiger("wally",        // trick animal
                "jumps in tree",
                "scratches ears");
        Zebra marty = new Zebra("marty");
        Giraffe garry = new Giraffe("garry",    // trick animal
                "bows down",
                "digs a hole");
        Cat peppy = new Cat("peppy",            // trick animal
                "does a back flip",
                "starts licking their private spot",
                "start chasing their own tail");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter command: ");

            String input = scanner.nextLine();
            String[] splitInput = input.split(" "); // we use a string split to check for the commands
            String command = splitInput[0];

            Animal currentAnimal = null;
            if (splitInput.length > 1) {
                for (Animal animal : Animal.animals) { // we search through all animals to find a match
                    if (splitInput[1].equals(animal.name)) {
                        currentAnimal = animal;
                        break;
                    }
                }
            }

            if (currentAnimal == null && splitInput.length > 1) { // if no animal was found, but the input was longer, we extend the command
                command += " " + splitInput[1];
            }

            switch (command) {
                case "hello":
                    if (currentAnimal != null) currentAnimal.sayHello(); // if an animal name was found one animal says hello
                    else for (Animal animal : Animal.animals) animal.sayHello(); // else all animals say hello
                    break;

                case "give meat":
                    for (Animal animal : Animal.animals) { // each animal that eats meat get filtered and gets their meat
                        if (animal instanceof Carnivore) {
                            ((Carnivore) animal).eatMeat();
                        }
                    }
                    break;

                case "give leave":
                    for (Animal animal : Animal.animals) { // each animal that eats leaves get filtered and gets their meat
                        if (animal instanceof Herbivore) {
                            ((Herbivore) animal).eatLeaves();
                        }
                    }
                    break;

                case "perform trick":
                    for (Animal animal : Animal.animals) { // each animal that eats leaves get filtered and gets their meat
                        if (animal instanceof TrickAnimal) {
                            ((TrickAnimal) animal).performTrick();
                        }
                    }
                    break;

                case "exit":
                    System.out.println("Thanks for visiting the zoo!");
                    return;

                default:
                    System.out.println("Unknown command: " + input);
                    break;
            }
            System.out.println();
        }
    }
}
