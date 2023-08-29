package JF09_Exercise_Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01_WinningTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rgxWin = "[^@#$^]*(?<winComb1>[@#$^]{6,10})[^@#$^]*[^@#$^]*(?<winComb2>[@#$^]{6,10})[^@#$^]*";
        String rgxTicket = ".{20}";
        Pattern patternTicket = Pattern.compile(rgxTicket);
        Pattern patternWin = Pattern.compile(rgxWin);
        String[] tickets = scanner.nextLine().split(",\\s+");
        for (String ticket : tickets) {
            Matcher matcherTicket = patternTicket.matcher(ticket);
            if (matcherTicket.find()) {
                Boolean isWin = false;
                String validTicket = matcherTicket.group();
                Matcher matcherWin = patternWin.matcher(validTicket);
                if (matcherWin.find()) {
                    String winComb1 = matcherWin.group("winComb1");
                    String winComb2 = matcherWin.group("winComb2");
                    String symbol = winComb1.charAt(0) + "";
                    if (winComb1.equals(winComb2) &&
                            ticket.substring(0, 10).contains(winComb1) &&
                            ticket.substring(10).contains(winComb2)) {
                        isWin = true;
                        if (winComb1.length() < 10) {
                            System.out.printf("ticket \"%s\" - %d%s%n", validTicket, winComb1.length(), symbol);
                        } else {
                            System.out.printf("ticket \"%s\" - %d%s Jackpot!%n", validTicket, winComb1.length(), symbol);
                        }
                    }
                }
                if (!isWin) System.out.printf("ticket \"%s\" - no match%n", validTicket);
            } else {
                System.out.println("invalid ticket");
            }
        }
    }
}
