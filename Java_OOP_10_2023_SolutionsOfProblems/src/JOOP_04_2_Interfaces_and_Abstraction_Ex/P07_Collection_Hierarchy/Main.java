package JOOP_04_2_Interfaces_and_Abstraction_Ex.P07_Collection_Hierarchy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Collection> addColl=new ArrayList<>();
        addColl.add(new  AddCollection());
        addColl.add(new AddRemoveCollection());
        addColl.add(new MyListImpl());

        String[] text=scanner.nextLine().split("\\s+");
        for (Collection collection : addColl) {
            for (String txt : text) {
                System.out.print(collection.add(txt)+" ");
            }
            System.out.println();
        }

        int n=Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <3 ; i++) {
            Collection saver = new AddCollection();
            int count=n;
            while (count-- > 0) {
               saver.add(addColl.get(i).remove());
            }
            System.out.println(saver.toString());
        }

    }
}
