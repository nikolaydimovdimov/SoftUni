package P01LAB_FirstStepsInCoding;

import java.util.Scanner;

public class P07_ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        int numberOfProjects=Integer.parseInt(scanner.nextLine());
        System.out.printf("The architect %s will need %d hours " +
                "to complete %d project/s.%n",name,numberOfProjects*3,numberOfProjects);
    }
}
