package P04Ex_FOR_Loop;

import java.util.Scanner;

public class P05_Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());
        String webSite = "";
        for (; n > 0; n--) {
            webSite = scanner.nextLine();
            switch (webSite) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }
        }
        if (salary > 0) {
            System.out.printf("%.0f", salary);
        } else {
            System.out.println("You have lost your salary.");
        }
    }
}

