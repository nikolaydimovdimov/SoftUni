package P01LAB_FirstStepsInCoding;

import java.util.Scanner;

public class P09YardGreening {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double areaScrM=Double.parseDouble(scanner.nextLine());
        double amount=areaScrM*7.61;
        double discount=amount*0.18;
        System.out.printf("The final price is: %.2f lv.%n",amount-discount);
        System.out.printf("The discount is: %.2f lv.%n",discount);
    }
}
