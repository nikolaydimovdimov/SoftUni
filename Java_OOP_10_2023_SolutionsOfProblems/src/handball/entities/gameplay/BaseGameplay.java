package handball.entities.gameplay;

import handball.entities.equipment.Equipment;
import handball.entities.team.Team;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public abstract class BaseGameplay implements Gameplay {
    private String name;
    private int capacity;
    private Collection<Equipment> equipments;
    private Collection<Team> teams;

    @Override
    public Collection<Equipment> getEquipments() {
        return this.equipments;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public BaseGameplay(String name, int capacity) {
        this.setName(name);
        this.capacity = capacity;
        this.equipments = new ArrayList<>();
        this.teams = new ArrayList<>();
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException("Team name cannot be null or empty.");
        }
        this.name = name;
    }

    public int allProtection() {
        return this.equipments.stream().mapToInt(Equipment::getProtection).sum();
    }

    public void addTeam(Team team) {
        this.teams.add(team);
    }

    public void removeTeam(Team team) {
        this.teams.remove(team);
    }

    public void addEquipment(Equipment equipment) {
        this.equipments.add(equipment);
    }

    public void teamsInGameplay() {
        this.teams.forEach(Team::play);
    }

    public String toString() {
        return String.format("%s %s%n", this.getName(), this.getClass().getSimpleName()) +
                String.format("Team: %s%n", this.teams.stream().map(Team::getName).collect(Collectors.joining(" "))) +
                String.format("Equipment: %d, Protection: %d", this.equipments.size(), this.allProtection());
    }

    public Collection<Team> getTeam() {
        return this.teams;
    }
}
