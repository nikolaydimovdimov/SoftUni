package JF07_Exercise_Associative_Arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P07_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> legendaryItemsMap = new LinkedHashMap<>();
        Map<String, Integer> materialsMap = new LinkedHashMap<>();

        String[] keyMaterialsArr = {
                "shards",
                "fragments",
                "motes"
        };
        String[] awards={
                "Shadowmourne",
                "Valanyr",
                "Dragonwrath"
        };


        for (int i = 0; i < keyMaterialsArr.length; i++) {
            legendaryItemsMap.put(keyMaterialsArr[i],awards[i]);
            materialsMap.put(keyMaterialsArr[i], 0);
        }

        boolean isWin = false;


        while (!isWin) {

            String[] lineText = scanner.nextLine().split(" ");

            for (int i = 0; i < lineText.length; i += 2) {
                int quantity = Integer.parseInt(lineText[i]);
                String material = lineText[i + 1].toLowerCase();
                materialsMap.putIfAbsent(material, 0);
                quantity = materialsMap.get(material) + quantity;
                materialsMap.put(material, quantity);

                if (quantity >= 250) {

                    for (String kMat : keyMaterialsArr) {

                        if (kMat.equals(material)) {
                            quantity -= 250;
                            materialsMap.put(material, quantity);
                            System.out.printf("%s obtained!%n", legendaryItemsMap.get(material));
                            isWin = true;
                            break;
                        }
                    }
                }
                if (isWin) break;
            }
        }
        materialsMap.forEach((m, q) -> System.out.printf("%s: %d%n", m, q));
    }
}
