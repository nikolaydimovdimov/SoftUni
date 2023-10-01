package JADV3_1_LAB_Sets_and_Maps_Advanced;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P08_AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        Map<String, Double> studentsMap = new TreeMap<>();

        for (int i = 0; i < number; i++) {
            String studentName = scanner.nextLine();
            studentsMap.putIfAbsent(studentName, 0.0);
            double[] scores = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble)
                    .toArray();
            double sum = 0;
            for (double score : scores) {
                sum += score;
            }
            studentsMap.put(studentName, sum / (scores.length));
        }
        DecimalFormat nf = new DecimalFormat("#.0######");
        for (Map.Entry<String, Double> student : studentsMap.entrySet()) {
            System.out.printf("%s is graduated with %s%n", student.getKey(), nf.format(student.getValue()));
        }
    }
}
