package P01LAB_FirstStepsInCoding;

import java.util.Scanner;

public class P04_InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double in=Double.parseDouble(scanner.nextLine());
        double cm=in*2.54;
        System.out.println(cm);
    }
}
