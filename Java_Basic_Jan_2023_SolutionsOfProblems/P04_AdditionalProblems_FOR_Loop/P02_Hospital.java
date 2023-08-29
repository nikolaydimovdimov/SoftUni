package P04_AdditionalProblems_FOR_Loop;

import java.util.Scanner;

public class P02_Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int patientsToday = 0, treatedPatients = 0, untreatedPatients = 0;
        int doctors = 7;
        for (int count = 1; count <= days; count++) {
            if (count % 3 == 0 && untreatedPatients > treatedPatients) {
                doctors++;
            }
            patientsToday = Integer.parseInt(scanner.nextLine());
            if (doctors >= patientsToday) {
                treatedPatients += patientsToday;
            } else {
                treatedPatients += doctors;
                untreatedPatients += patientsToday - doctors;
            }
        }
        System.out.printf("Treated patients: %d.%n", treatedPatients);
        System.out.printf("Untreated patients: %d.", untreatedPatients);
    }
}
