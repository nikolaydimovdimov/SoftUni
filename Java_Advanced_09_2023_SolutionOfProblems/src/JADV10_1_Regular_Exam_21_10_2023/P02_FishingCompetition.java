package JADV10_1_Regular_Exam_21_10_2023;

import java.util.Scanner;

public class P02_FishingCompetition {
    private static String[][] fishingArea;
    private static int[] shipPosition = new int[2];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dimension = Integer.parseInt(scanner.nextLine());

        fishingArea = new String[dimension][dimension];

        for (int i = 0; i < dimension; i++) {
            fishingArea[i] = scanner.nextLine().split("");
        }

        int fishCatch = 0;
        shipPosition = getShipPosition();
        boolean isfallIntoWhirlpool = false;

        String command = scanner.nextLine();

        while (!(command.equals("collect the nets") || isfallIntoWhirlpool)) {
            int[] coordinate;
            if (command.equals("left")) {
                coordinate = getLeft();
                if (Character.isDigit(getPartType(coordinate).charAt(0))) {
                    fishCatch += Integer.parseInt(getPartType(coordinate));
                } else if ("W".equals(getPartType(coordinate))) {
                    isfallIntoWhirlpool = true;
                }
                moveLeft();

            } else if (command.equals("right")) {
                coordinate = getRight();
                if (Character.isDigit(getPartType(coordinate).charAt(0))) {
                    fishCatch += Integer.parseInt(getPartType(coordinate));
                } else if ("W".equals(getPartType(coordinate))) {
                    isfallIntoWhirlpool = true;
                }
                moveRight();
            } else if (command.equals("up")) {
                coordinate = getUp();
                if (Character.isDigit(getPartType(coordinate).charAt(0))) {
                    fishCatch += Integer.parseInt(getPartType(coordinate));
                } else if ("W".equals(getPartType(coordinate))) {
                    isfallIntoWhirlpool = true;
                }
                moveUp();
            } else if (command.equals("down")) {
                coordinate = getDown();
                if (Character.isDigit(getPartType(coordinate).charAt(0))) {
                    fishCatch += Integer.parseInt(getPartType(coordinate));
                } else if ("W".equals(getPartType(coordinate))) {
                    isfallIntoWhirlpool = true;
                }
                moveDown();
            }
            command = scanner.nextLine();
        }
        if (isfallIntoWhirlpool) {
            System.out.printf("You fell into a whirlpool! The ship sank and you lost the fish you caught. Last coordinates of the ship: [%d,%d]%n",
                    shipPosition[0], shipPosition[1]);
        } else {
            if (fishCatch >= 20) {
                System.out.println("Success! You managed to reach the quota!");
            } else {
                System.out.printf("You didn't catch enough fish and didn't reach the quota! You need %d tons of fish more.%n",
                        20 - fishCatch);
            }
            if (fishCatch > 0) {
                System.out.printf("Amount of fish caught: %d tons.%n", fishCatch);
            }
            for (String[] row : fishingArea) System.out.println(String.join("", row));
        }
    }

    public static int[] getShipPosition() {
        int[] position;
        position = new int[]{-1, -1};
        for (int i = 0; i < fishingArea.length; i++) {
            for (int j = 0; j < fishingArea[i].length; j++) {
                if (fishingArea[i][j].equals("S")) {
                    position[0] = i;
                    position[1] = j;
                    return position;
                }
            }
        }
        return position;
    }


    public static String getPartType(int[] coordinate) {
        if (checkCoordinate(coordinate)) return fishingArea[coordinate[0]][coordinate[1]];
        return null;
    }

    public static void replacePartType(int[] coordinate, String newType) {
        if (checkCoordinate(coordinate)) {
            fishingArea[coordinate[0]][coordinate[1]] = newType;
        }
    }


    public static boolean checkCoordinate(int[] coordinate) {
        return coordinate[0] >= 0 && coordinate[0] < fishingArea.length &&
                coordinate[1] >= 0 && coordinate[1] < fishingArea[0].length;
    }

    public static int[] getLeft() {
        int[] position = new int[2];
        position[0] = shipPosition[0];
        position[1] = shipPosition[1] - 1;
        if (position[1] < 0) position[1] = fishingArea.length - 1;
        return position;
    }

    public static int[] getRight() {
        int[] position = new int[2];
        position[0] = shipPosition[0];
        position[1] = shipPosition[1] + 1;
        if (position[1] == fishingArea.length) position[1] = 0;
        return position;
    }

    public static int[] getUp() {
        int[] position = new int[2];
        position[0] = shipPosition[0] - 1;
        if (position[0] < 0) position[0] = fishingArea.length - 1;
        position[1] = shipPosition[1];
        return position;
    }

    public static int[] getDown() {
        int[] position = new int[2];
        position[0] = shipPosition[0] + 1;
        if (position[0] == fishingArea.length) position[0] = 0;
        position[1] = shipPosition[1];
        return position;
    }

    public static void moveLeft() {
        replacePartType(shipPosition, "-");
        shipPosition[1]--;
        if (shipPosition[1] < 0) shipPosition[1] = fishingArea.length - 1;
        replacePartType(shipPosition, "S");
    }

    public static void moveRight() {
        replacePartType(shipPosition, "-");
        shipPosition[1]++;
        if (shipPosition[1] == fishingArea.length) shipPosition[1] = 0;
        replacePartType(shipPosition, "S");
    }

    public static void moveUp() {
        replacePartType(shipPosition, "-");
        shipPosition[0]--;
        if (shipPosition[0] < 0) shipPosition[0] = fishingArea.length - 1;
        replacePartType(shipPosition, "S");
    }

    public static void moveDown() {
        replacePartType(shipPosition, "-");
        shipPosition[0]++;
        if (shipPosition[0] == fishingArea.length) shipPosition[0] = 0;
        replacePartType(shipPosition, "S");
    }
}
