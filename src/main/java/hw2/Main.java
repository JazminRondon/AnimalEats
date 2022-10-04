package hw2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        System.out.println("How many pets do you have?");
        Scanner scanner = new Scanner(System.in);
        int numberOfPets = scanner.nextInt();

        ArrayList<String> petType = new ArrayList<>();
        ArrayList<String> petName = new ArrayList<>();
        Scanner pet = new Scanner(System.in);

        for (int i = 0; i < numberOfPets; i++) {
            System.out.println("What kind of pet do you have? (Dog, Cat, Frog)");
            petType.add(pet.nextLine());
            System.out.println("What is its name?");
            petName.add(pet.nextLine());
        }
        for (int i = 0; i < petName.size(); i++) {
            if (petType.get(i).equalsIgnoreCase("Cat")) {
                Cat cat = new Cat(petName.get(i));
                System.out.println(cat.getName() + " says "+ cat.noise());
                //              System.out.print(cat.noise());
            } else if (petType.get(i).equalsIgnoreCase("Dog")) {
                Animal dog = new Dog(petName.get(i));
                System.out.println(dog.getName() + " says "+dog.noise() );
            } else if (petType.get(i).equalsIgnoreCase("Frog")) {
                Animal frog = new Frog(petName.get(i));
                System.out.println(frog.getName() + " says " +frog.noise());
            } else {
                Animal unknown = new Animal(petName.get(i));
                System.out.println(unknown.getName() + " says "+unknown.noise() );
            }
        }
    }
}

