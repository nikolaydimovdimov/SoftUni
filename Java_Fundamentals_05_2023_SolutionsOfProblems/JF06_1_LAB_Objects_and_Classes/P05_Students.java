package JF06_1_LAB_Objects_and_Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05_Students {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<P055_Students_class.Student> studentsList = new ArrayList<>();
        String lineStr = scanner.nextLine();

        while (!lineStr.equals("end")) {
            String[] lineData = lineStr.split(" ");
            P055_Students_class.Student next = new P055_Students_class.Student(lineData[0], lineData[1], lineData[2], lineData[3]);

            int index = findExistingStudent(studentsList, next.getFirstName(), next.getLastName());

            if (index == -1) {
                studentsList.add(next);
            } else {
                studentsList.set(index, next);
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

    public static int findExistingStudent(List<P055_Students_class.Student> peapleList, String fName, String lName) {
        for (int i = 0; i < peapleList.size(); i++) {
            if (fName.equals(peapleList.get(i).getFirstName()) &&
                    lName.equals(peapleList.get(i).getLastName())) {
                return i;
            }
        }
        return -1;
    }
}
