package JF07_Exercise_Associative_Arrays;

import java.util.*;

public class P09_ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> forceBookMap = new LinkedHashMap<>();


        String lineText = scanner.nextLine();

        while (!lineText.equals("Lumpawaroo")) {
            String forceSide, name;

            if (lineText.contains("|")) {

                forceSide = lineText.split("\\|")[0].trim();
                name = lineText.split("\\|")[1].trim();

                if (!whereNameExist(name, forceBookMap).equals("")) {
                    lineText = scanner.nextLine();
                    continue;
                }
                forceBookMap.putIfAbsent(forceSide, new ArrayList<>());
                forceBookMap.get(forceSide).add(name);

            } else {
                name = lineText.split("->")[0].trim();
                forceSide = lineText.split("->")[1].trim();

                String oldSide = whereNameExist(name, forceBookMap);

                if (!oldSide.equals("")) {
                    forceBookMap.get(oldSide).remove(name);
                }

                forceBookMap.putIfAbsent(forceSide, new ArrayList<>());
                forceBookMap.get(forceSide).add(name);
                System.out.printf("%s joins the %s side!%n", name, forceSide);
            }
            lineText = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> side : forceBookMap.entrySet()) {
            if (side.getValue().size() == 0) continue;

            System.out.printf("Side: %s, Members: %d%n", side.getKey(), side.getValue().size());

            for (String name : side.getValue()) {
                System.out.printf("! %s%n", name);
            }
        }
    }

    public static String whereNameExist(String name, Map<String, List<String>> mapMap) {
        for (Map.Entry<String, List<String>> m : mapMap.entrySet()) {
            if (m.getValue().contains(name)) return m.getKey();
        }
        return "";
    }

}


