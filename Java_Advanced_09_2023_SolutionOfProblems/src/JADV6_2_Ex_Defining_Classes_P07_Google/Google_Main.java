package JADV6_2_Ex_Defining_Classes_P07_Google;

import java.util.*;


public class Google_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Person> peopleInGoogle = new HashMap<>();

        String name;

        String[] input = scanner.nextLine().split("\\s+");

        while (!input[0].equals("End")) {
            name = input[0];
            peopleInGoogle.putIfAbsent(name, new Person(name));
            String command = input[1];
            if (command.equals("company")) {
                String company=input[2];
                String department=input[3];
                double salary=Double.parseDouble(input[4]);
                peopleInGoogle.get(name)
                        .setCompanyPerson(new Company(company,department,salary));
            } else if (command.equals("car")) {
                String model=input[2];
                int speed=Integer.parseInt(input[3]);
                peopleInGoogle.get(name)
                        .setCarPerson(new Car(model,speed));
            } else if (command.equals("parents")) {
                String parentName=input[2];
                String birthDay=input[3];
                peopleInGoogle.get(name)
                        .getParentsPerson().add(new Parent(parentName, birthDay));
            } else if (command.equals("children")) {
                String childName=input[2];
                String birthDay=input[3];
                peopleInGoogle.get(name)
                        .getChildrenPerson().add(new Child(childName, birthDay));
            } else if (command.equals("pokemon")) {
                String pokemonName=input[2];
                String type=input[3];
                peopleInGoogle.get(name).
                        getPokemonPerson().add(new Pokemon(pokemonName, type));
            }
            input = scanner.nextLine().split("\\s+");
        }
        name=scanner.nextLine();

        System.out.println(peopleInGoogle.get(name).toString());
    }
}
