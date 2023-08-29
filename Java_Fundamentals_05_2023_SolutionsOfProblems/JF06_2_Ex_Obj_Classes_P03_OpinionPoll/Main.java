package JF06_2_Ex_Obj_Classes_P03_OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPerson=Integer.parseInt(scanner.nextLine());
        List<Person> personsList=new ArrayList<>();
        for (int i = 0; i < numberOfPerson; i++) {
            String line=scanner.nextLine();
            if(Integer.parseInt(line.split(" ")[1])>30){
                Person nextPerson=new Person(line.split(" ")[0],Integer.parseInt(line.split(" ")[1]));
                personsList.add(nextPerson);
            }
        }
        for (Person person : personsList) {
            System.out.println(person.output());
        }
    }
}
