package JF07_Exercise_Associative_Arrays;

import java.util.*;

public class P05_Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> coursesMap = new LinkedHashMap<>();
        String[] lineText = scanner.nextLine().split(" : ");

        while ((!lineText[0].equals("end"))) {
            String courseName = lineText[0];
            String studentName = lineText[1];
            coursesMap.putIfAbsent(courseName, new ArrayList<>());
            coursesMap.get(courseName).add(studentName);
            lineText = scanner.nextLine().split(" : ");
        }
        for (Map.Entry<String, List<String>> mapItem : coursesMap.entrySet()) {
            System.out.printf("%s: %d%n", mapItem.getKey(), mapItem.getValue().size());
            for (String student : mapItem.getValue()) {
                System.out.printf("-- %s%n", student);
            }
        }
    }
}
