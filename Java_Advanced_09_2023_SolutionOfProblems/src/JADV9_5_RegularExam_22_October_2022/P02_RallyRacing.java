package JADV9_5_RegularExam_22_October_2022;


import java.util.Scanner;

public class P02_RallyRacing {
    private static String[][] raceRoute;
    private static int[] carPosition = {0, 0};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dimension = Integer.parseInt(scanner.nextLine());

        String carNumber = scanner.nextLine();

        raceRoute = new String[dimension][dimension];

        for (int i = 0; i < dimension; i++) {
            raceRoute[i] = scanner.nextLine().split(" ");
        }

        int distance = 0;

        replacePartType(carPosition, "C");

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            int[] coordinate;

            if (command.equals("left")) {
                coordinate = getLeft();
                if ("F".equals(getPartType(coordinate))) {
                    distance += 10;
                    moveLeft();
                    break;
                } else if ("T".equals(getPartType(coordinate))) {
                    distance += 30;
                    moveLeft();
                    goIntoTunnel();
                } else {
                    distance += 10;
                    moveLeft();
                }
            } else if (command.equals("right")) {
                coordinate = getRight();
                if ("F".equals(getPartType(coordinate))) {
                    distance += 10;
                    moveRight();
                    break;
                } else if ("T".equals(getPartType(coordinate))) {
                    distance += 30;
                    moveRight();
                    goIntoTunnel();
                } else {
                    distance += 10;
                    moveRight();
                }
            } else if (command.equals("up")) {
                coordinate = getUp();
                if ("F".equals(getPartType(coordinate))) {
                    distance += 10;
                    moveUp();
                    break;
                } else if ("T".equals(getPartType(coordinate))) {
                    distance += 30;
                    moveUp();
                    goIntoTunnel();
                } else {
                    distance += 10;
                    moveUp();
                }
            } else if (command.equals("down")) {
                coordinate = getDown();
                if ("F".equals(getPartType(coordinate))) {
                    distance += 10;
                    moveDown();
                    break;
                } else if ("T".equals(getPartType(coordinate))) {
                    distance += 30;
                    moveDown();
                    goIntoTunnel();
                } else {
                    distance += 10;
                    moveDown();
                }
            }
            command = scanner.nextLine();
        }
        if (command.equals("End")) {
            System.out.printf("Racing car %s DNF.%n", carNumber);
        } else {
            System.out.printf("Racing car %s finished the stage!%n", carNumber);
        }
        System.out.printf("Distance covered %d km.%n", distance);
        System.out.println(raceRouteString());
    }

    public static String raceRouteString() {
        StringBuilder output = new StringBuilder();
        for (String[] row : raceRoute) {
            for (String s : row) {
                output.append(s);
            }
            output.append("\n");
        }
        return output.toString();
    }

    public static int[] getCarPosition() {
        int[] position;
        position = new int[]{-1, -1};
        for (int i = 0; i < raceRoute.length; i++) {
            for (int j = 0; j < raceRoute[i].length; j++) {
                if (raceRoute[i][j].equals("C")) {
                    position[0] = i;
                    position[1] = j;
                    return position;
                }
            }
        }
        return position;
    }

    public static void goIntoTunnel() {
        for (int i = 0; i < raceRoute.length; i++) {
            for (int j = 0; j < raceRoute[0].length; j++) {
                if (raceRoute[i][j].equals("T")) {
                    replacePartType(carPosition, ".");
                    carPosition[0] = i;
                    carPosition[1] = j;
                    replacePartType(carPosition, "C");
                    return;
                }
            }
        }
    }

    public static String getPartType(int[] coordinate) {
        if (checkCoordinate(coordinate)) return raceRoute[coordinate[0]][coordinate[1]];
        return null;
    }

    public static void replacePartType(int[] coordinate, String newType) {
        if (checkCoordinate(coordinate)) {
            raceRoute[coordinate[0]][coordinate[1]] = newType;
        }
    }

    public static boolean checkCoordinateMoveAble(int[] coordinate) {
        return ".".equals(getPartType(coordinate));
    }

    public static boolean checkCoordinate(int[] coordinate) {
        return coordinate[0] >= 0 && coordinate[0] < raceRoute.length &&
                coordinate[1] >= 0 && coordinate[1] < raceRoute[0].length;
    }

    public static int[] getLeft() {
        int[] position = new int[2];
        position[0] = carPosition[0];
        position[1] = carPosition[1] - 1;
        return position;
    }

    public static int[] getRight() {
        int[] position = new int[2];
        position[0] = carPosition[0];
        position[1] = carPosition[1] + 1;
        return position;
    }

    public static int[] getUp() {
        int[] position = new int[2];
        position[0] = carPosition[0] - 1;
        position[1] = carPosition[1];
        return position;
    }

    public static int[] getDown() {
        int[] position = new int[2];
        position[0] = carPosition[0] + 1;
        position[1] = carPosition[1];
        return position;
    }

    public static void moveLeft() {
        replacePartType(carPosition, ".");
        carPosition[1]--;
        replacePartType(carPosition, "C");
    }

    public static void moveRight() {
        replacePartType(carPosition, ".");
        carPosition[1]++;
        replacePartType(carPosition, "C");
    }

    public static void moveUp() {
        replacePartType(carPosition, ".");
        carPosition[0]--;
        replacePartType(carPosition, "C");
    }

    public static void moveDown() {
        replacePartType(carPosition, ".");
        carPosition[0]++;
        replacePartType(carPosition, "C");
    }
}
