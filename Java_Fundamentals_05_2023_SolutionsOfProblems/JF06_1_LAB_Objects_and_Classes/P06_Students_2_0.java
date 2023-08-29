package JF06_1_LAB_Objects_and_Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06_Students_2_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<P055_Students_class.Student> studentsList = new ArrayList<>();

        String lineStr = scanner.nextLine();

        while (!lineStr.equals("end")) {
            String[] lineData = lineStr.split(" ");

            P055_Students_class.Student nextStudent = studentsList
                    .stream()
                    .filter(st -> st.getFirstName().equals(lineData[0]) && st.getLastName().equals(lineData[1]))
                    .findFirst()
                    .orElse(null);

            if (nextStudent == null) {
                P055_Students_class.Student newStudent = new P055_Students_class.Student(lineData[0], lineData[1], lineData[2], lineData[3]);
                studentsList.add(newStudent);
            } else {
                nextStudent.setAge(lineData[2]);
                nextStudent.setHomeTown(lineData[3]);
            }
            lineStr = scanner.nextLine();
        }
        lineStr = scanner.nextLine();

        for (P055_Students_class.Student student : studentsList) {
            if (lineStr.equals(student.getHomeTown())) {
                System.out.printf("%s %s is %s years old%n", student.getFirstName(),
                        student.getLastName(), student.getAge());
            }
        }
    }
}
