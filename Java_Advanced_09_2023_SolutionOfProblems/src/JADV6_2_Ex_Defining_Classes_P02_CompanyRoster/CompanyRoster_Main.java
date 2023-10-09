package JADV6_2_Ex_Defining_Classes_P02_CompanyRoster;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CompanyRoster_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Department> departmentsSet = new HashMap<>();


        int numberOfEmployers = Integer.parseInt(scanner.nextLine());

        while (numberOfEmployers-- > 0) {
            Employee newPerson = new Employee();
            newPerson = getNewEmployer(scanner.nextLine());
            departmentsSet.putIfAbsent(newPerson.getDepartment(),
                    new Department());
            if (departmentsSet.get(newPerson.getDepartment()).getPersons() == null)
                departmentsSet.get(newPerson.getDepartment()).setPersons(new ArrayList<>());
            departmentsSet.get(newPerson.getDepartment()).getPersons().add(newPerson);
        }
        String maxSalaryDepartment = "";
        double maxSalary = 0;
        for (Map.Entry<String, Department> department : departmentsSet.entrySet()) {
            double currentSalary = department.getValue().getAverageSalary();
            if (currentSalary > maxSalary) {
                maxSalaryDepartment = department.getKey();
                maxSalary = currentSalary;
            }
        }
        System.out.printf("Highest Average Salary: %s%n", maxSalaryDepartment);
        departmentsSet.get(maxSalaryDepartment).getPersons()
                .sort((a, b) -> Double.compare(b.getSalary(), a.getSalary()));
        departmentsSet.get(maxSalaryDepartment).getPersons().forEach(empl -> System.out.printf("%s %.2f %s %d%n",
                empl.getName(), empl.getSalary(), empl.getEmail(), empl.getAge()));

    }


    private static int getAgeFromString(String personsInfo) {

        String regex = "\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(personsInfo);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group());
        } else {
            return -1;
        }
    }

    private static String getEmailFromString(String personsInfo) {

        String regex = "\\w+\\@\\w+\\.\\w+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(personsInfo);
        if (matcher.find()) {
            return personsInfo;
        } else {
            return "n/a";
        }
    }

    private static Employee getNewEmployer(String inputInfo) {
        String[] personsInfo = inputInfo.split("\\s+");
        String name = personsInfo[0];
        double salary = Double.parseDouble(personsInfo[1]);
        String position = personsInfo[2];
        String department = personsInfo[3];
        String email = "n/a";
        int age = -1;
        for (int i = 4; i < personsInfo.length; i++) {
            if (email.equals("n/a")) email = getEmailFromString(personsInfo[i]);
            if (age == -1) age = getAgeFromString(personsInfo[i]);
        }
        Employee newEmployer = new Employee(name, salary, position, department, email, age);
        return newEmployer;
    }

}
