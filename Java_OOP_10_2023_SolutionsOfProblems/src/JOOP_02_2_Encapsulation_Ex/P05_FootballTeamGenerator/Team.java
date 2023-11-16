package JOOP_02_2_Encapsulation_Ex.P05_FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.setName(name);
        players = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player) {
        for (Player pl : this.players) {
            if(pl.getName().equals(player.getName())){
                pl=player;
                return;
            }
        }
        this.players.add(player);
    }

    public void removePlayer(String namePlayer) {
        if (!this.players.isEmpty()) {
            for (Player player : this.players) {
                if (player.getName().equals(namePlayer)) {
                    this.players.remove(player);
                    return;
                }
            }
        }
        throw new IllegalArgumentException(String.format("JOOP_02_2_Encapsulation_Ex.P05_FootballTeamGenerator.Player %s is not in %s team.",
                namePlayer, this.getName()));
    }

    public double getRating() {
        if (this.players.isEmpty()) return 0;
        double rating = 0;
        int counter = 0;
        for (Player player : this.players) {
            rating += player.overallSkillLevel();
            counter++;
        }
        return rating / counter;
    }

}
