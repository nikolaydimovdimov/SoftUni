package JADV9_2_Exam_Tr_17_June_2023;

import java.util.Scanner;

public class P02_MouseInTheKitchen {

    private static String[][] kitchen;
    private static int[] mousePosition = new int[2];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(",");
        int rows = Integer.parseInt(input[0]);
        int columns = Integer.parseInt(input[1]);

        kitchen = new String[rows][columns];

        for (int i = 0; i < rows; i++) {
            kitchen[i] = scanner.nextLine().split("");
        }

        int numberOfCheese = getNumberOfCheese();
        mousePosition = getMousePosition();
        replacePartType(mousePosition, "*");


        String command = scanner.nextLine();
        while (!"danger".equals(command)) {
            int[] coordinate;
            if (command.equals("left")) {
                coordinate = getLeft();
                if (checkCoordinate(coordinate)) {
                    if ("C".equals(getPartType(coordinate))) {
                        replacePartType(coordinate, "*");
                        moveLeft();
                        numberOfCheese--;
                        if (numberOfCheese == 0) {
                            System.out.println("Happy mouse! All the cheese is eaten, good night!");
                            break;
                        }
                    } else if ("T".equals(getPartType(coordinate))) {
                        System.out.println("Mouse is trapped!");
                        break;
                    } else if (checkCoordinateMoveAble(coordinate)) {
                        moveLeft();
                    }
                } else {
                    System.out.println("No more cheese for tonight!");
                    break;
                }
            } else if (command.equals("right")) {
                coordinate = getRight();
                if (checkCoordinate(coordinate)) {
                    if ("C".equals(getPartType(coordinate))) {
                        replacePartType(coordinate, "*");
                        moveRight();
                        numberOfCheese--;
                        if (numberOfCheese == 0) {
                            System.out.println("Happy mouse! All the cheese is eaten, good night!");
                            break;
                        }
                    } else if ("T".equals(getPartType(coordinate))) {
                        System.out.println("Mouse is trapped!");
                        break;
                    } else if (checkCoordinateMoveAble(coordinate)) {
                        moveRight();
                    }
                } else {
                    System.out.println("No more cheese for tonight!");
                    break;
                }
            } else if (command.equals("up")) {
                coordinate = getUp();
                if (checkCoordinate(coordinate)) {
                    if ("C".equals(getPartType(coordinate))) {
                        replacePartType(coordinate, "*");
                        moveUp();
                        numberOfCheese--;
                        if (numberOfCheese == 0) {
                            System.out.println("Happy mouse! All the cheese is eaten, good night!");
                            break;
                        }
                    } else if ("T".equals(getPartType(coordinate))) {
                        System.out.println("Mouse is trapped!");
                        break;
                    } else if (checkCoordinateMoveAble(coordinate)) {
                        moveUp();
                    }
                } else {
                    System.out.println("No more cheese for tonight!");
                    break;
                }
            } else if (command.equals("down")) {
                coordinate = getDown();
                if (checkCoordinate(coordinate)) {
                    if ("C".equals(getPartType(coordinate))) {
                        replacePartType(coordinate, "*");
                        moveDown();
                        numberOfCheese--;
                        if (numberOfCheese == 0) {
                            setMousePosition(coordinate);
                            System.out.println("Happy mouse! All the cheese is eaten, good night!");
                            break;
                        }
                    } else if ("T".equals(getPartType(coordinate))) {
                        setMousePosition(coordinate);
                        System.out.println("Mouse is trapped!");
                        break;
                    } else if (checkCoordinateMoveAble(coordinate)) {
                        moveDown();
                    }
                } else {
                    System.out.println("No more cheese for tonight!");
                    break;
                }
            }
            command = scanner.nextLine();
        }

        if (command.equals("danger")) System.out.println("Mouse will come back later!");

        replacePartType(mousePosition, "M");

        System.out.println(kitchenString());


    }


    public static int[] getMousePosition() {
        int[] position;
        position = new int[]{-1, -1};
        for (int i = 0; i < kitchen.length; i++) {
            for (int j = 0; j < kitchen[i].length; j++) {
                if (kitchen[i][j].equals("M")) {
                    position[0] = i;
                    position[1] = j;
                    return position;
                }
            }
        }
        return position;
    }

    public static int getNumberOfCheese() {
        int number = 0;
        for (String[] row : kitchen) {
            for (String p : row) {
                if (p.equals("C")) {
                    number++;
                }
            }
        }
        return number;
    }

    public static String getPartType(int[] coordinate) {
        if (checkCoordinate(coordinate)) return kitchen[coordinate[0]][coordinate[1]];
        return null;
    }

    public static void replacePartType(int[] coordinate, String newType) {
        if (checkCoordinate(coordinate)) {
            kitchen[coordinate[0]][coordinate[1]] = newType;
        }
    }

    public static boolean checkCoordinateMoveAble(int[] coordinate) {
        return "*".equals(getPartType(coordinate));
    }

    public static boolean checkCoordinate(int[] coordinate) {
        return coordinate[0] >= 0 && coordinate[0] < kitchen.length &&
                coordinate[1] >= 0 && coordinate[1] < kitchen[0].length;
    }

    public static String kitchenString() {
        StringBuilder output = new StringBuilder();
        for (String[] row : kitchen) {
            for (String s : row) {
                output.append(s);
            }
            output.append("\n");
        }
        return output.toString();
    }


    public static void setMousePosition(int[] coordinate) {
        mousePosition = coordinate;
    }

    public static int[] getLeft() {
        int[] position = new int[2];
        position[0] = mousePosition[0];
        position[1] = mousePosition[1] - 1;
        return position;
    }

    public static int[] getRight() {
        int[] position = new int[2];
        position[0] = mousePosition[0];
        position[1] = mousePosition[1] + 1;
        return position;
    }

    public static int[] getUp() {
        int[] position = new int[2];
        position[0] = mousePosition[0] - 1;
        position[1] = mousePosition[1];
        return position;
    }

    public static int[] getDown() {
        int[] position = new int[2];
        position[0] = mousePosition[0] + 1;
        position[1] = mousePosition[1];
        return position;
    }

    public static void moveLeft() {
        mousePosition[1]--;
    }

    public static void moveRight() {
        mousePosition[1]++;
    }

    public static void moveUp() {
        mousePosition[0]--;
    }

    public static void moveDown() {
        mousePosition[0]++;
    }
}

    
    
    

