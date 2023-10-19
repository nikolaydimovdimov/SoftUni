package JADV9_1_Retake_Exam_Tr_9_8_2023.P02_DeliveryBoy;

import java.util.Scanner;

public class Main {

    private static String[][] neighborhood;
    private static int[] boyPosition = new int[2];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int columns = Integer.parseInt(input[1]);
        neighborhood = new String[rows][columns];

        for (int i = 0; i < rows; i++) {
            neighborhood[i] = scanner.nextLine().split("");
        }

        int[] startPosition = getBoyPosition();
        String startString = "B";
        boyPosition = getBoyPosition();
        replacePartType(startPosition, ".");


        boolean pizzaTaken = false;
        while (true) {
            int[] coordinate;
            String command = scanner.nextLine();
            if (command.equals("left")) {
                coordinate = getLeft();
                if (checkCoordinate(coordinate)) {
                    if ("P".equals(getPartType(coordinate))) {
                        pizzaTaken = true;
                        pizzaCollected(coordinate);
                    } else if ("A".equals(getPartType(coordinate)) && pizzaTaken) {
                        pizzaDelivered(coordinate);
                        break;
                    } else if (checkCoordinateMoveAble(coordinate)) {
                        replacePartType(coordinate, ".");
                        moveLeft();
                    }
                } else {
                    System.out.println("The delivery is late. Order is canceled.");
                    startString = " ";
                    break;
                }
            } else if (command.equals("right")) {
                coordinate = getRight();
                if (checkCoordinate(coordinate)) {
                    if ("P".equals(getPartType(coordinate))) {
                        pizzaTaken = true;
                        pizzaCollected(coordinate);
                    } else if ("A".equals(getPartType(coordinate)) && pizzaTaken) {
                        pizzaDelivered(coordinate);
                        break;
                    } else if (checkCoordinateMoveAble(coordinate)) {
                        replacePartType(coordinate, ".");
                        moveRight();
                    }
                } else {
                    System.out.println("The delivery is late. Order is canceled.");
                    startString = " ";
                    break;
                }
            } else if (command.equals("up")) {
                coordinate = getUp();
                if (checkCoordinate(coordinate)) {
                    if ("P".equals(getPartType(coordinate))) {
                        pizzaTaken = true;
                        pizzaCollected(coordinate);
                    } else if ("A".equals(getPartType(coordinate)) && pizzaTaken) {
                        pizzaDelivered(coordinate);
                        break;
                    } else if (checkCoordinateMoveAble(coordinate)) {
                        replacePartType(coordinate, ".");
                        moveUp();
                    }
                } else {
                    System.out.println("The delivery is late. Order is canceled.");
                    startString = " ";
                    break;
                }
            } else if (command.equals("down")) {
                coordinate = getDown();
                if (checkCoordinate(coordinate)) {
                    if ("P".equals(getPartType(coordinate))) {
                        pizzaTaken = true;
                        pizzaCollected(coordinate);
                    } else if ("A".equals(getPartType(coordinate)) && pizzaTaken) {
                        pizzaDelivered(coordinate);
                        break;
                    } else if (checkCoordinateMoveAble(coordinate)) {
                        replacePartType(coordinate, ".");
                        moveDown();
                    }
                } else {
                    System.out.println("The delivery is late. Order is canceled.");
                    startString = " ";
                    break;
                }
            }
        }

        replacePartType(startPosition, startString);

        neighborhoodPrint();


    }

    private static void pizzaDelivered(int[] coordinate) {
        replacePartType(coordinate, "P");
        System.out.println("Pizza is delivered on time! Next order...");
    }

    private static void pizzaCollected(int[] coordinate) {
        setBoyPosition(coordinate);
        replacePartType(coordinate, "R");
        System.out.println("Pizza is collected. 10 minutes for delivery.");
    }

    public static int[] getBoyPosition() {
        int[] position;
        position = new int[]{-1, -1};
        for (int i = 0; i < neighborhood.length; i++) {
            for (int j = 0; j < neighborhood[i].length; j++) {
                if (neighborhood[i][j].equals("B")) {
                    position[0] = i;
                    position[1] = j;
                    return position;
                }
            }
        }
        return position;
    }

    public static String getPartType(int[] coordinate) {
        if (checkCoordinate(coordinate)) return neighborhood[coordinate[0]][coordinate[1]];
        return null;
    }

    public static void replacePartType(int[] coordinate, String newType) {
        if (checkCoordinate(coordinate)) {
            neighborhood[coordinate[0]][coordinate[1]] = newType;
        }
    }

    public static boolean checkCoordinateMoveAble(int[] coordinate) {
        return "-".equals(getPartType(coordinate)) || ".".equals(getPartType(coordinate));
    }

    public static boolean checkCoordinate(int[] coordinate) {
        return coordinate[0] >= 0 && coordinate[0] < neighborhood.length &&
                coordinate[1] >= 0 && coordinate[1] < neighborhood[0].length;
    }

    public static void neighborhoodPrint() {
        for (String[] row : neighborhood) {
            for (String s : row) {
                System.out.print(s);
            }
            System.out.println();
        }
    }


    public static void setBoyPosition(int[] coordinate) {
        boyPosition = coordinate;
    }

    public static int[] getLeft() {
        int[] position = new int[2];
        position[0] = boyPosition[0];
        position[1] = boyPosition[1] - 1;
        return position;
    }

    public static int[] getRight() {
        int[] position = new int[2];
        position[0] = boyPosition[0];
        position[1] = boyPosition[1] + 1;
        return position;
    }

    public static int[] getUp() {
        int[] position = new int[2];
        position[0] = boyPosition[0] - 1;
        position[1] = boyPosition[1];
        return position;
    }

    public static int[] getDown() {
        int[] position = new int[2];
        position[0] = boyPosition[0] + 1;
        position[1] = boyPosition[1];
        return position;
    }

    public static void moveLeft() {
        boyPosition[1]--;
    }

    public static void moveRight() {
        boyPosition[1]++;
    }

    public static void moveUp() {
        boyPosition[0]--;
    }

    public static void moveDown() {
        boyPosition[0]++;
    }
}
