package JOOP_03_2_Inheritance_Ex.animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String commandFirst = scanner.nextLine();

        while (!commandFirst.equals("Beast!")) {

            String animalType = commandFirst;

            String[] commandSecond = scanner.nextLine().split("\\s+");
            String name = commandSecond[0];
            int age = Integer.parseInt(commandSecond[1]);
            String gender = "";
            if (!animalType.equals("Kitten") && !animalType.equals("Tomcat")) {
                gender = commandSecond[2];
            }

            try {
                switch (animalType) {
                    case "Dog":
                       Dog dog=new  Dog(name, age, gender);
                       System.out.println(dog);
                       break;
                    case "Cat":
                        Cat cat=new  Cat(name, age, gender);
                        System.out.println(cat);
                        break;
                    case "Frog":
                        Frog frog=new  Frog(name, age, gender);
                        System.out.println(frog);
                        break;
                    case "Kitten":
                        Kitten kitten=new  Kitten(name, age);
                        System.out.println(kitten);
                        break;
                    case "Tomcat":
                        Tomcat tomcat=new  Tomcat(name, age);
                        System.out.println(tomcat);
                        break;
                }
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }

            commandFirst = scanner.nextLine();
        }
    }
}

