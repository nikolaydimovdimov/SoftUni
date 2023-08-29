package JF10_Final_Exam_Preparation;

import java.util.Scanner;


public class P01_2_WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder travelStops = new StringBuilder();

        travelStops.append(scanner.nextLine());
        String command = scanner.nextLine().trim();

        while (!command.equals("Travel")) {
            String[] commandItems = command.split(":");
            int index1, index2;
            String stop1, stop2;

            switch (commandItems[0]) {
                case "Add Stop":
                    index1 = Integer.parseInt(commandItems[1]);
                    if (index1 < travelStops.length() - 1 && index1 > 0) {
                        stop1 = commandItems[2];
                        travelStops.insert(index1, stop1);
                    }
                    System.out.println(travelStops);
                    break;
                case "Remove Stop":
                    index1 = Integer.parseInt(commandItems[1]);
                    index2 = Integer.parseInt(commandItems[2]) + 1;
                    if (index1 < travelStops.length() - 1 && index2 < travelStops.length() - 1 && index1 > 0 && index2 > 0) {
                        travelStops.delete(index1, index2);
                    }
                    System.out.println(travelStops);
                    break;
                case "Switch":
                    stop1 = commandItems[1];
                    if (!stop1.equals("")) {
                        stop2 = commandItems[2];
                        index1 = travelStops.indexOf(stop1);
                        while (index1 != -1) {
                            index2 = index1 + stop1.length();
                            travelStops.replace(index1, index2, stop2);
                            index1 = travelStops.indexOf(stop1);
                        }
                    }
                    System.out.println(travelStops);
                    break;
            }
            command = scanner.nextLine().trim();
        }
        System.out.printf("Ready for world tour! Planned stops: %s%n", travelStops);
    }
}
