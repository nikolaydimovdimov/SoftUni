package P01LAB_FirstStepsInCoding;

import java.util.Scanner;

public class P08_PetShop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int dogFood=Integer.parseInt(scanner.nextLine());
        int catFood=Integer.parseInt(scanner.nextLine());
        double amount=dogFood*2.5+catFood*4;
        System.out.println(amount + " lv.");
    }
}
