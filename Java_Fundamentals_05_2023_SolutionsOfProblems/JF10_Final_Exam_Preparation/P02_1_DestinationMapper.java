package JF10_Final_Exam_Preparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_1_DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rgxDest = "([=\\/])(?<destination>[A-Z][A-Za-z]{2,})\\1";
        Pattern patternDest = Pattern.compile(rgxDest);
        Matcher matcherDest = patternDest.matcher(scanner.nextLine());
        List<String> destinationsList = new ArrayList<>();
        AtomicInteger travelPoints = new AtomicInteger();
        while (matcherDest.find()) {
            destinationsList.add(matcherDest.group("destination"));
        }
        System.out.print("Destinations: ");
        System.out.println(String.join(", ", destinationsList));
        destinationsList.forEach(el -> travelPoints.addAndGet(el.length()));
        System.out.println("Travel Points: " + travelPoints);
    }
}
