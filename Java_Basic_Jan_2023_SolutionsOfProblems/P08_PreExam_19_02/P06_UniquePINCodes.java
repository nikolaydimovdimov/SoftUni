package P08_PreExam_19_02;

import java.util.Scanner;

public class P06_UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max1 = Integer.parseInt(scanner.nextLine());
        int max2 = Integer.parseInt(scanner.nextLine());
        int max3 = Integer.parseInt(scanner.nextLine());

        for (int n1 = 2; n1 <= max1; n1++) {
            if (n1 % 2 != 0) {
                continue;
            }
            for (int n2 = 2; n2 <= max2; n2++) {
                boolean primeFlag = true;
                if (n2 > 3) {
                    for (int i = 2; i <= n2 / 2; i++) {
                        if (n2 % i == 0) {
                            primeFlag = false;
                            break;
                        }
                    }
                }
                if (!primeFlag) {
                    continue;
                }
                for (int n3 = 2; n3 <= max3; n3++) {
                    if (n3 % 2 != 0) {
                        continue;
                    }
                    System.out.print(n1 + " ");
                    System.out.print(n2 + " ");
                    System.out.println(n3);
                }
            }
        }
    }
}

