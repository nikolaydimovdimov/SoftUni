package JF07_Exercise_Associative_Arrays;

import java.util.*;

public class P06_StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> studentsMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            studentsMap.putIfAbsent(name, new ArrayList<>());
            studentsMap.get(name).add(grade);
        }

        Map<String, Double> bestStudentsMap = new LinkedHashMap<>();


        for (Map.Entry<String, List<Double>> student : studentsMap.entrySet()) {
            double totalGrade = 0;
            for (Double grade : student.getValue()) {
                totalGrade += grade;
            }
            totalGrade /= student.getValue().size();
            if (totalGrade >= 4.5) {
                bestStudentsMap.put(student.getKey(), totalGrade);
            }
        }
        bestStudentsMap.entrySet().forEach(student -> System.out.printf("%s -> %.2f%n", student.getKey(), student.getValue()));
//        bestStudentsMap.forEach((key, value) -> System.out.printf("%s -> %.2f%n", key, value));
    }
}
