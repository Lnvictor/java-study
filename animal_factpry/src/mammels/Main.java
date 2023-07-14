package mammels;

import java.util.*;
import commons.Animal;
import amphibians.Sapo;

public class Main {
    public static List<Animal> animals = new ArrayList<>();

    public static void  constructZoo(){
        Lion simba = new Lion("Simba", 10);
        Giraffe eduard = new Giraffe("Eduard", 15);
        Tiger mirella = new Tiger("Mirella", 5);
        Sapo joseph = new Sapo("Joseph", 2);

        animals.add(simba);
        animals.add(eduard);
        animals.add(mirella);
		animals.add(joseph);
    }

    private static Animal findAnimal(int option) {
        return animals.get(option - 1);
    }

    public static void main(String[] args) {
        Main.constructZoo();
        System.out.println("########### Welcome to our Zoo ############");
        System.out.println("What animal Do you wanna see?");
        System.out.println("1- Simba (Lion)");
        System.out.println("2- Eduard (Giraffe)");
        System.out.println("3- Mirella (Tiger)");
        System.out.println("4- Joseph (Sapo)");

        Scanner scanner = new Scanner(System.in);
        int option = Integer.parseInt(scanner.nextLine());

        Animal animal = findAnimal(option);
        System.out.println(animal.noise());
    }
}
