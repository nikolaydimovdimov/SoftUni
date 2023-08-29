package JF06_2_Ex_Obj_Classes_P01_AdvertMssg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberMassages=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <numberMassages ; i++) {
            Advertisement massage=new Advertisement();
            System.out.println(massage.massageGenerate());
        }
    }
}
