package P01LAB_FirstStepsInCoding;

import java.util.Scanner;

public class P03_RectangleAreaInteger {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());
        int area=a*b;
        System.out.println(area);
    }
}
