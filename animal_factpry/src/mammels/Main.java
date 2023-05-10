package mammels;

import java.util.*;

public class Main {
    public static List<Mammel> animals = new ArrayList<Mammel>();

    public static void  constructZoo(){
        Lion simba = new Lion("Simba", 10);
        Giraffe eduard = new Giraffe("Eduard", 15);
        Tiger mirella = new Tiger("Mirrela", 5);

        animals.add(simba);
        animals.add(eduard);
        animals.add(mirella);
    }

    private static Mammel findAnimal(int option) {
        return animals.get(option - 1);
    }

    public static void main(String[] args) {
        Main.constructZoo();
        System.out.println("########### Welcome to our Zoo ############");
        System.out.println("What animal Do you wanna see?");
        System.out.println("1- Simba (Lion)");
        System.out.println("2- Eduard (Giraffe)");
        System.out.println("3- Mirella (Tiger)");

        Scanner scanner = new Scanner(System.in);
        int option = Integer.parseInt(scanner.nextLine());

        Mammel mammel = findAnimal(option);
        System.out.println(mammel.noise());
    }
}
