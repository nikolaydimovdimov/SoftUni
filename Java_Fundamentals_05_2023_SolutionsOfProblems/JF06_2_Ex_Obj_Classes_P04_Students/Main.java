package JF06_2_Ex_Obj_Classes_P04_Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfStudents = Integer.parseInt(scanner.nextLine());

        List<Student> studentsList = new ArrayList<>();

        for (int i = 0; i < countOfStudents; i++) {
            String line = scanner.nextLine();
            Student newStudent = new Student(line.split(" ")[0],
                    line.split(" ")[1], Double.parseDouble(line.split(" ")[2]));
            studentsList.add(newStudent);
        }

        studentsList.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student : studentsList) {
            System.out.println(student.print());
        }
    }

}
