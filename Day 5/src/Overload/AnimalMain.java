package Overload;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop.");

        while (true) {
            System.out.print("Enter animal name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.print("Is it a dog? (yes/no): ");
            String isDogInput = scanner.nextLine().toLowerCase();
            boolean isDog = isDogInput.equals("yes");

            Animal animal = new Animal(name, isDog);
            animalList.add(animal);
        }

        for (Animal animal : animalList) {
            System.out.println(animal.toString());
        }
    }
}
