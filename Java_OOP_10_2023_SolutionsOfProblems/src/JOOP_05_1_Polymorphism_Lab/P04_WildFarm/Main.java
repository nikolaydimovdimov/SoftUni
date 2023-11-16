package JOOP_05_1_Polymorphism_Lab.P04_WildFarm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] token = scanner.nextLine().split("\\s+");
        while (!token[0].equals("End")) {
            String type = token[0];
            String name = token[1];
            Double weight = Double.parseDouble(token[2]);
            String region = token[3];
            String breed = "";
            if (token.length == 5) breed = token[4];

            Animal animal = null;
            switch (type) {
                case "Cat":
                    animal = new Cat(name, type, weight, region, breed);
                    break;
                case "Tiger":
                    animal = new Tiger(name, type, weight, region);
                    break;
                case "Mouse":
                    animal = new Mouse(name, type, weight, region);
                    break;
                case "Zebra":
                    animal = new Zebra(name, type, weight, region);
                    break;
            }

            token = scanner.nextLine().split("\\s+");
            String foodType=token[0];
            Integer foodQuantity=Integer.parseInt(token[1]);

            Food food = null;
            if (foodType.equals("Meat")) {
                food = new Meat(foodQuantity);
            } else {
                food = new Vegetable(foodQuantity);
            }

            animal.makeSound();
            animal.eat(food);
            System.out.println(animal.toString());

            token = scanner.nextLine().split("\\s+");
        }
    }
}
