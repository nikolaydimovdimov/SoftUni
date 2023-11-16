package JOOP_04_2_Interfaces_and_Abstraction_Ex.P03_Birthday_Celebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Birthable> birthableList=new ArrayList<>();
        String[] token=scanner.nextLine().split("\\s+");
        while (!token[0].equals("End")){
            switch (token[0]){
                case "JOOP_04_2_Interfaces_and_Abstraction_Ex.P04_Food_Shortage.Citizen":
                    birthableList.add(new Citizen(token[1],
                            Integer.parseInt(token[2]),
                            token[3],
                            token[4]));
                    break;
                case "JOOP_04_2_Interfaces_and_Abstraction_Ex.P04_Food_Shortage.Pet":
                    birthableList.add(new Pet(token[1],token[2]));
                    break;
            }
        token=scanner.nextLine().split("\\s+");
        }
        String year=scanner.nextLine();
        birthableList.stream()
                .filter(el->el.getBirthDate().endsWith(year))
                .forEach(el-> System.out.println(el.getBirthDate()));
    }


}
