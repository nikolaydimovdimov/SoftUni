package JADV9_3_Retake_Exam_12_Apri_2023;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class P02_TheSquirrel {
    private static String[][] field;
    private static int[] squirrelPosition = new int[2];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dimension = Integer.parseInt(scanner.nextLine());

        Deque<String> commandQueue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(", ")).forEach(commandQueue::offer);

        field = new String[dimension][dimension];

        for (int i = 0; i < dimension; i++) {
            field[i] = scanner.nextLine().split("");
        }

        int numberOfHazelnuts = 0;
        int allHazelnuts = getNumberOfHazelnuts();
        squirrelPosition = getSquirrelPosition();
        boolean unexpectedBreak = false;

        while (!commandQueue.isEmpty()) {
            String command = commandQueue.poll();
            int[] coordinate;
            if (command.equals("left")) {
                coordinate = getLeft();
                if (checkCoordinate(coordinate)) {
                    if ("h".equals(getPartType(coordinate))) {
                        moveLeft();
                        numberOfHazelnuts++;
                        if (numberOfHazelnuts == allHazelnuts) {
                            System.out.println("Good job! You have collected all hazelnuts!");
                            break;
                        }
                    } else if ("t".equals(getPartType(coordinate))) {
                        moveLeft();
                        System.out.println("Unfortunately, the squirrel stepped on a trap...");
                        unexpectedBreak = true;
                        break;
                    } else if (checkCoordinateMoveAble(coordinate)) {
                        moveLeft();
                    }
                } else {
                    System.out.println("The squirrel is out of the field.");
                    unexpectedBreak = true;
                    break;
                }
            } else if (command.equals("right")) {
                coordinate = getRight();
                if (checkCoordinate(coordinate)) {
                    if ("h".equals(getPartType(coordinate))) {
                        moveRight();
                        numberOfHazelnuts++;
                        if (numberOfHazelnuts == allHazelnuts) {
                            System.out.println("Good job! You have collected all hazelnuts!");
                            break;
                        }
                    } else if ("t".equals(getPartType(coordinate))) {
                        moveRight();
                        System.out.println("Unfortunately, the squirrel stepped on a trap...");
                        unexpectedBreak = true;
                        break;
                    } else if (checkCoordinateMoveAble(coordinate)) {
                        moveRight();
                    }
                } else {
                    System.out.println("The squirrel is out of the field.");
                    unexpectedBreak = true;
                    break;
                }
            } else if (command.equals("up")) {
                coordinate = getUp();
                if (checkCoordinate(coordinate)) {
                    if ("h".equals(getPartType(coordinate))) {
                        moveUp();
                        numberOfHazelnuts++;
                        if (numberOfHazelnuts == allHazelnuts) {
                            System.out.println("Good job! You have collected all hazelnuts!");
                            break;
                        }
                    } else if ("t".equals(getPartType(coordinate))) {
                        moveUp();
                        System.out.println("Unfortunately, the squirrel stepped on a trap...");
                        unexpectedBreak = true;
                        break;
                    } else if (checkCoordinateMoveAble(coordinate)) {
                        moveUp();
                    }
                } else {
                    System.out.println("The squirrel is out of the field.");
                    unexpectedBreak = true;
                    break;
                }
            } else if (command.equals("down")) {
                coordinate = getDown();
                if (checkCoordinate(coordinate)) {
                    if ("h".equals(getPartType(coordinate))) {
                        moveDown();
                        numberOfHazelnuts++;
                        if (numberOfHazelnuts == allHazelnuts) {
                            System.out.println("Good job! You have collected all hazelnuts!");
                            break;
                        }
                    } else if ("t".equals(getPartType(coordinate))) {
                        moveDown();
                        System.out.println("Unfortunately, the squirrel stepped on a trap...");
                        unexpectedBreak = true;
                        break;
                    } else if (checkCoordinateMoveAble(coordinate)) {
                        moveDown();
                    }
                } else {
                    System.out.println("The squirrel is out of the field.");
                    unexpectedBreak = true;
                    break;
                }
            }
        }
        if (!unexpectedBreak && numberOfHazelnuts < allHazelnuts)
            System.out.println("There are more hazelnuts to collect.");

        System.out.printf("Hazelnuts collected: %d%n", numberOfHazelnuts);


    }

    public static int[] getSquirrelPosition() {
        int[] position;
        position = new int[]{-1, -1};
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j].equals("s")) {
                    position[0] = i;
                    position[1] = j;
                    return position;
                }
            }
        }
        return position;
    }

    public static int getNumberOfHazelnuts() {
        int number = 0;
        for (String[] row : field) {
            for (String p : row) {
                if (p.equals("h")) {
                    number++;
                }
            }
        }
        return number;
    }

    public static String getPartType(int[] coordinate) {
        if (checkCoordinate(coordinate)) return field[coordinate[0]][coordinate[1]];
        return null;
    }

    public static void replacePartType(int[] coordinate, String newType) {
        if (checkCoordinate(coordinate)) {
            field[coordinate[0]][coordinate[1]] = newType;
        }
    }

    public static boolean checkCoordinateMoveAble(int[] coordinate) {
        return "*".equals(getPartType(coordinate));
    }

    public static boolean checkCoordinate(int[] coordinate) {
        return coordinate[0] >= 0 && coordinate[0] < field.length &&
                coordinate[1] >= 0 && coordinate[1] < field[0].length;
    }

    public static int[] getLeft() {
        int[] position = new int[2];
        position[0] = squirrelPosition[0];
        position[1] = squirrelPosition[1] - 1;
        return position;
    }

    public static int[] getRight() {
        int[] position = new int[2];
        position[0] = squirrelPosition[0];
        position[1] = squirrelPosition[1] + 1;
        return position;
    }

    public static int[] getUp() {
        int[] position = new int[2];
        position[0] = squirrelPosition[0] - 1;
        position[1] = squirrelPosition[1];
        return position;
    }

    public static int[] getDown() {
        int[] position = new int[2];
        position[0] = squirrelPosition[0] + 1;
        position[1] = squirrelPosition[1];
        return position;
    }

    public static void moveLeft() {
        replacePartType(squirrelPosition, "*");
        squirrelPosition[1]--;
        replacePartType(squirrelPosition, "s");
    }

    public static void moveRight() {
        replacePartType(squirrelPosition, "*");
        squirrelPosition[1]++;
        replacePartType(squirrelPosition, "s");
    }

    public static void moveUp() {
        replacePartType(squirrelPosition, "*");
        squirrelPosition[0]--;
        replacePartType(squirrelPosition, "s");
    }

    public static void moveDown() {
        replacePartType(squirrelPosition, "*");
        squirrelPosition[0]++;
        replacePartType(squirrelPosition, "s");
    }
}
