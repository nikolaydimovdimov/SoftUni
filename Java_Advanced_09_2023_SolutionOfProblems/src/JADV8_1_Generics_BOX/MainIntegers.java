package JADV8_1_Generics_BOX;

import java.util.Scanner;

public class MainIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        while (n-->0){
            Box<Integer> boxString=new Box<>(Integer.parseInt(scanner.nextLine()));
            System.out.println(boxString.toString());
        }
    }
}
