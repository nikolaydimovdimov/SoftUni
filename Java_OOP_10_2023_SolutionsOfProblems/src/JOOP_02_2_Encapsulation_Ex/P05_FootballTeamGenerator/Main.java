package JOOP_02_2_Encapsulation_Ex.P05_FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Team> teamsList = new ArrayList<>();

        String[] token = scanner.nextLine().split(";");
        String teamName;

        while (!token[0].equals("END")) {
            teamName = token[1];
            switch (token[0]) {
                case "JOOP_02_2_Encapsulation_Ex.P05_FootballTeamGenerator.Team":
                    try {
                        String finalTeamName1 = teamName;
                        if (teamsList.stream().
                                noneMatch(team -> team.getName().equals(finalTeamName1))) {
                            teamsList.add(new Team(teamName));
                        }
                    } catch (IllegalArgumentException exception) {
                        System.out.println(exception.getMessage());
                    }
                    break;
                case "Add":
                    try {
                        if (isTeamExist(teamsList, teamName)) {
                            for (Team team : teamsList) {
                                if (team.getName().equals(token[1])) {
                                    team.addPlayer(new Player(token[2],
                                            Integer.parseInt(token[3]),
                                            Integer.parseInt(token[4]),
                                            Integer.parseInt(token[5]),
                                            Integer.parseInt(token[6]),
                                            Integer.parseInt(token[7])));
                                }
                                break;
                            }
                        }
                    } catch (IllegalArgumentException exception) {
                        System.out.println(exception.getMessage());
                    }
                    break;
                case "Remove":
                    String finalTeamName = teamName;
                    if (teamsList.stream().
                            anyMatch(team -> team.getName().equals(finalTeamName))) {
                        try {
                            for (Team team : teamsList) {
                                if (team.getName().equals(token[1])) {
                                    team.removePlayer(token[2]);
                                    break;
                                }
                            }
                        } catch (IllegalArgumentException exception) {
                            System.out.println(exception.getMessage());
                        }
                    }
                    break;
                case "Rating":
                    try {
                        if (isTeamExist(teamsList, teamName)) {
                            for (Team team : teamsList) {
                                if (team.getName().equals(token[1])) {
                                    System.out.printf("%s - %.0f%n", team.getName(), team.getRating());
                                    break;
                                }
                            }
                        }
                    } catch (IllegalArgumentException exception) {
                        System.out.println(exception.getMessage());
                    }
                    break;
            }
            token = scanner.nextLine().split(";");
        }


    }


    private static boolean isTeamExist(List<Team> teamsList, String nameTeam) {
        if (teamsList.stream().
                noneMatch(team -> team.getName().equals(nameTeam))) {
            throw new IllegalArgumentException(String.format("JOOP_02_2_Encapsulation_Ex.P05_FootballTeamGenerator.Team %s does not exist.", nameTeam));
        }
        return true;
    }
}
