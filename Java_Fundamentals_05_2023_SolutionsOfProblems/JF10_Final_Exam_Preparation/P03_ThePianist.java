package JF10_Final_Exam_Preparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03_ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String[]> piecesMap = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] inputs = scanner.nextLine().split("\\|");
            piecesMap.putIfAbsent(inputs[0], new String[2]);
            piecesMap.get(inputs[0])[0] = inputs[1];
            piecesMap.get(inputs[0])[1] = inputs[2];
        }
        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            String[] commandItems = command.split("\\|");
            String piece = commandItems[1];
            String composer;
            String key;

            switch (commandItems[0]) {
                case "Add":
                    if (piecesMap.containsKey(piece)) {
                        System.out.printf("%s is already in the collection!%n", piece);
                    } else {
                        composer = commandItems[2];
                        key = commandItems[3];
                        piecesMap.put(piece, new String[2]);
                        piecesMap.get(piece)[0] = composer;
                        piecesMap.get(piece)[1] = key;
                        System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                    }
                    break;
                case "Remove":
                    if (piecesMap.containsKey(piece)) {
                        piecesMap.remove(piece);
                        System.out.printf("Successfully removed %s!%n", piece);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
                case "ChangeKey":
                    if (piecesMap.containsKey(piece)) {
                        key = commandItems[2];
                        piecesMap.get(piece)[1] = key;
                        System.out.printf("Changed the key of %s to %s!%n", piece, key);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, String[]> piece : piecesMap.entrySet()) {
            System.out.printf("%s -> Composer: %s, Key: %s%n",
                    piece.getKey(), piece.getValue()[0], piece.getValue()[1]);
        }
    }
}
