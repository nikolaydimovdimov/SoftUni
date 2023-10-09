package JADV6_2_Ex_Defining_Classes_P01_OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> personsList = new ArrayList<>();
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        while (numberOfPeople-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            personsList.add(new Person(input[0], Integer.parseInt(input[1])));
        }

        personsList.stream()
                .filter(a -> a.getAge() > 30)
                .sorted((a, b) -> a.getName().compareTo(b.getName()))
                .forEach(a -> System.out.printf("%s - %d%n", a.getName(), a.getAge()));
    }
}
