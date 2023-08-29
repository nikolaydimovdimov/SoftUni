package P06Ex_Nested_Loops;

import java.util.Scanner;

public class P06_CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String film = scanner.nextLine();
        int studentTickets = 0, standardTickets = 0, kidTickets = 0;
        while (!film.equals("Finish")) {
            int freePlaces = Integer.parseInt(scanner.nextLine());
            if (freePlaces > 0) {
                String ticketType = scanner.nextLine();
                int soldTickets = 0;
                while (!ticketType.equals("End") && !ticketType.equals("Finish")) {
                    soldTickets++;
                    switch (ticketType) {
                        case "student":
                            studentTickets++;
                            break;
                        case "standard":
                            standardTickets++;
                            break;
                        case "kid":
                            kidTickets++;
                            break;
                    }
                    if (soldTickets >= freePlaces) {
                        break;
                    }
                    ticketType = scanner.nextLine();
                }
                System.out.printf("%s - %.2f%% full.%n", film, soldTickets * 100.0 / freePlaces);
                if (ticketType.equals("Finish")) {
                    break;
                }
            }
            film = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", studentTickets + standardTickets + kidTickets);
        System.out.printf("%.2f%% student tickets.%n",
                studentTickets * 100.0 / (studentTickets + standardTickets + kidTickets));
        System.out.printf("%.2f%% standard tickets.%n",
                standardTickets * 100.0 / (studentTickets + standardTickets + kidTickets));
        System.out.printf("%.2f%% kids tickets.%n",
                kidTickets * 100.0 / (studentTickets + standardTickets + kidTickets));
    }
}
