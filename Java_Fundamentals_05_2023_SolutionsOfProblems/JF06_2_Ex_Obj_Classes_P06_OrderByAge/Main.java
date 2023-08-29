package JF06_2_Ex_Obj_Classes_P06_OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people=new ArrayList<>();

        String line=scanner.nextLine();

        while (!line.equals("End")){
            Person newPerson=new Person(line.split(" ")[0],
                    line.split(" ")[1],Integer.parseInt(line.split(" ")[2]));
            people.add(newPerson);
            line=scanner.nextLine();
        }
        people.sort(Comparator.comparing(Person::getAge));

        for (Person person : people) {
            System.out.println(person.output());
        }
    }
}
