package JOOP_04_1_Interfaces_and_Abstraction_Lab.P05_BorderControl_Extended;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Identifiable> personsList = new ArrayList<>();

        String[] token = scanner.nextLine().split("\\s+");

        while (!token[0].equals("End")) {
            if (token.length == 2) {
                Robot robot = new Robot(token[0], token[1]);
                personsList.add(robot);
            } else {
                Citizen citizen = new Citizen(token[0], Integer.parseInt(token[1]), token[2]);
                personsList.add(citizen);
            }
            token = scanner.nextLine().split("\\s+");
        }
        String lastDigitsId = scanner.nextLine();
        personsList.stream()
                .filter(el -> el.getId().endsWith(lastDigitsId))
                .forEach(el -> System.out.println(el.getId()));
    }
}
