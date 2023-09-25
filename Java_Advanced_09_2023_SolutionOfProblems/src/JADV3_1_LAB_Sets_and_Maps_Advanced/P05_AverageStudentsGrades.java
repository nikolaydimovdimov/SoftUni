package JADV3_1_LAB_Sets_and_Maps_Advanced;

import java.util.*;

public class P05_AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Double>> studentsMap = new TreeMap<>();
        int numberLines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberLines; i++) {
            String[] line = scanner.nextLine().split("\\s+");
            studentsMap.putIfAbsent(line[0], new ArrayList<>());
            studentsMap.get(line[0]).add(Double.parseDouble(line[1]));
        }

        for (Map.Entry<String, List<Double>> student : studentsMap.entrySet()) {
            System.out.print(student.getKey() + " -> ");
            double sum = 0;
            for (Double grade : student.getValue()) {
                sum += grade;
                System.out.printf("%.2f ", grade);
            }
            System.out.printf("(avg: %.2f)%n", sum / student.getValue().size());
        }
    }
}
