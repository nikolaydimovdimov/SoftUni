package JADV9_4_RegularExam_18_February_2023;

import java.util.Arrays;
import java.util.Scanner;

public class P02_BlindMansBuff {

    private static String[][] playground;
    private static int[] blindManPosition = new int[2];


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();


        playground = new String[input[0]][input[1]];

        for (int i = 0; i < input[0]; i++) {
            playground[i] = scanner.nextLine().split("\\s+");
        }

        int touchedPlayers = 0;
        int movesCounter = 0;

        blindManPosition = getBlindManPosition();

        String command = scanner.nextLine();

        while (!command.equals("Finish") && touchedPlayers < 3) {
            int[] coordinate;
            if (command.equals("left")) {
                coordinate = getLeft();
                if (checkCoordinate(coordinate)) {
                    if ("P".equals(getPartType(coordinate))) {
                        moveLeft();
                        touchedPlayers++;
                        movesCounter++;
                    } else if (checkCoordinateMoveAble(coordinate)) {
                        moveLeft();
                        movesCounter++;
                    }
                }
            } else if (command.equals("right")) {
                coordinate = getRight();
                if (checkCoordinate(coordinate)) {
                    if ("P".equals(getPartType(coordinate))) {
                        moveRight();
                        touchedPlayers++;
                        movesCounter++;
                    } else if (checkCoordinateMoveAble(coordinate)) {
                        moveRight();
                        movesCounter++;
                    }
                }
            } else if (command.equals("up")) {
                coordinate = getUp();
                if (checkCoordinate(coordinate)) {
                    if ("P".equals(getPartType(coordinate))) {
                        moveUp();
                        touchedPlayers++;
                        movesCounter++;
                    } else if (checkCoordinateMoveAble(coordinate)) {
                        moveUp();
                        movesCounter++;
                    }
                }
            } else if (command.equals("down")) {
                coordinate = getDown();
                if (checkCoordinate(coordinate)) {
                    if ("P".equals(getPartType(coordinate))) {
                        moveDown();
                        touchedPlayers++;
                        movesCounter++;
                    } else if (checkCoordinateMoveAble(coordinate)) {
                        moveDown();
                        movesCounter++;
                    }
                }
            }
            command = scanner.nextLine();
        }
        System.out.println("Game over!");
        System.out.printf("Touched opponents: %d Moves made: %d%n", touchedPlayers, movesCounter);


    }

    public static int[] getBlindManPosition() {
        int[] position;
        position = new int[]{-1, -1};
        for (int i = 0; i < playground.length; i++) {
            for (int j = 0; j < playground[i].length; j++) {
                if (playground[i][j].equals("B")) {
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
        for (String[] row : playground) {
            for (String p : row) {
                if (p.equals("h")) {
                    number++;
                }
            }
        }
        return number;
    }

    public static String getPartType(int[] coordinate) {
        if (checkCoordinate(coordinate)) return playground[coordinate[0]][coordinate[1]];
        return null;
    }

    public static void replacePartType(int[] coordinate, String newType) {
        if (checkCoordinate(coordinate)) {
            playground[coordinate[0]][coordinate[1]] = newType;
        }
    }

    public static boolean checkCoordinateMoveAble(int[] coordinate) {
        return "-".equals(getPartType(coordinate));
    }

    public static boolean checkCoordinate(int[] coordinate) {
        return coordinate[0] >= 0 && coordinate[0] < playground.length &&
                coordinate[1] >= 0 && coordinate[1] < playground[0].length;
    }

    public static int[] getLeft() {
        int[] position = new int[2];
        position[0] = blindManPosition[0];
        position[1] = blindManPosition[1] - 1;
        return position;
    }

    public static int[] getRight() {
        int[] position = new int[2];
        position[0] = blindManPosition[0];
        position[1] = blindManPosition[1] + 1;
        return position;
    }

    public static int[] getUp() {
        int[] position = new int[2];
        position[0] = blindManPosition[0] - 1;
        position[1] = blindManPosition[1];
        return position;
    }

    public static int[] getDown() {
        int[] position = new int[2];
        position[0] = blindManPosition[0] + 1;
        position[1] = blindManPosition[1];
        return position;
    }

    public static void moveLeft() {
        replacePartType(blindManPosition, "-");
        blindManPosition[1]--;
        replacePartType(blindManPosition, "B");
    }

    public static void moveRight() {
        replacePartType(blindManPosition, "-");
        blindManPosition[1]++;
        replacePartType(blindManPosition, "B");
    }

    public static void moveUp() {
        replacePartType(blindManPosition, "-");
        blindManPosition[0]--;
        replacePartType(blindManPosition, "B");
    }

    public static void moveDown() {
        replacePartType(blindManPosition, "-");
        blindManPosition[0]++;
        replacePartType(blindManPosition, "B");
    }
}

