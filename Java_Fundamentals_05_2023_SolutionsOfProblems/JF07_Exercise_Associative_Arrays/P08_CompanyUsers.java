package JF07_Exercise_Associative_Arrays;

import java.util.*;

public class P08_CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> companiesMap = new LinkedHashMap<>();
        String[] lineText = scanner.nextLine().split(" -> ");
        while (!lineText[0].equals("End")) {
            String companyName = lineText[0];
            String iD = lineText[1];
            companiesMap.putIfAbsent(companyName, new ArrayList<>());
            if (!companiesMap.get(companyName).contains(iD)) {
                companiesMap.get(companyName).add(iD);
            }
            lineText = scanner.nextLine().split(" -> ");
        }

        for (Map.Entry<String, List<String>> company : companiesMap.entrySet()) {
            System.out.printf("%s%n", company.getKey());
            company.getValue().forEach(i -> System.out.printf("-- %s%n", i));
//            for (String i : company.getValue()) {
//                System.out.printf("-- %s%n", i);
//            }
        }
    }
}
