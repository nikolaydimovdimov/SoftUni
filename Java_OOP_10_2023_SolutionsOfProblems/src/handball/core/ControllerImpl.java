package handball.core;

import handball.entities.equipment.ElbowPad;
import handball.entities.equipment.Equipment;
import handball.entities.equipment.Kneepad;
import handball.entities.gameplay.Gameplay;
import handball.entities.gameplay.Indoor;
import handball.entities.gameplay.Outdoor;
import handball.entities.team.Bulgaria;
import handball.entities.team.Germany;
import handball.entities.team.Team;
import handball.repositories.EquipmentRepository;
import handball.repositories.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class ControllerImpl implements Controller {
    private Repository equipment;
    private Collection<Gameplay> gameplays;


    public ControllerImpl() {
        this. gameplays = new ArrayList<>();
        this.equipment=new EquipmentRepository();
    }

    @Override
    public String addGameplay(String gameplayType, String gameplayName) {

        Gameplay newGameplay;

        switch (gameplayType) {
            case "Outdoor":
                newGameplay = new Outdoor(gameplayName);
                break;
            case "Indoor":
                newGameplay = new Indoor(gameplayName);
                break;
            default:
                throw new NullPointerException("Invalid gameplay type.");
        }
        this.gameplays.add(newGameplay);
        return String.format("Successfully added %s.", gameplayType);
    }

    @Override
    public String addEquipment(String equipmentType) {

        Equipment newEquipment = makeNewEquipment(equipmentType);

        if (newEquipment == null) {
            throw new IllegalArgumentException("Invalid equipment type.");
        }
        this.equipment.add(newEquipment);
        return String.format("Successfully added %s.", equipmentType);

    }

    private Equipment makeNewEquipment(String equipmentType) {

        Equipment newEquipment;

        switch (equipmentType) {
            case "Kneepad":
                newEquipment = new Kneepad();
                break;
            case "ElbowPad":
                newEquipment = new ElbowPad();
                break;
            default:
                return null;
        }
        return newEquipment;

    }

    @Override
    public String equipmentRequirement(String gameplayName, String equipmentType) {

        String output = "";

        Equipment newEquipment = makeNewEquipment(equipmentType);


        if (newEquipment == null || !equipment.remove(newEquipment)) {
            throw new IllegalArgumentException(String.format("There isn't an equipment of type %s", equipmentType));
        }
        for (Gameplay gameplay : this.gameplays) {
            if (gameplay.getName().equals(gameplayName))
                gameplay.addEquipment(newEquipment);
            output = String.format("Successfully added %s to %s.", equipmentType, gameplayName);
            break;
        }

        return output;
    }

    @Override
    public String addTeam(String gameplayName, String teamType, String teamName, String country, int advantage) {
        Team newTeam;
        String output = "";
        switch (teamType) {
            case "Bulgaria":
                newTeam = new Bulgaria(teamName, country, advantage);
                break;
            case "Germany":
                newTeam = new Germany(teamName, country, advantage);
                break;
            default:
                throw new IllegalArgumentException("Invalid team type.");
        }
        for (Gameplay gameplay : this.gameplays) {
            if (gameplay.getName().equals(gameplayName)) {
                if (gameplay.getClass().getSimpleName().equals("Outdoor") && teamType.equals("Bulgaria") ||
                        gameplay.getClass().getSimpleName().equals("Indoor") && teamType.equals("Germany")) {
                    gameplay.addTeam(newTeam);
                    output = String.format("Successfully added %s to %s.", teamType, gameplayName);
                } else {
                    output = "The coverage of the terrain is not suitable.";
                }
                break;
            }
        }
        return output;
    }

    @Override
    public String playInGameplay(String gameplayName) {
        String output = "";
        for (Gameplay gameplay : this.gameplays) {
            if (gameplay.getName().equals(gameplayName)) {
                gameplay.teamsInGameplay();

                output = String.format("Teams that have played: %d", gameplay.getTeam().size());
            }
        }

        return output;
    }

    @Override
    public String percentAdvantage(String gameplayName) {
        int sum= this.gameplays.stream()
                .filter(gameplay -> gameplay.getName().equals(gameplayName))
                .findFirst()
                .stream()
                .mapToInt(Gameplay::allProtection).sum();
        return String.format("The advantage of Gameplay %s is %d.",gameplayName,sum);
    }

    @Override
    public String getStatistics() {
        StringBuilder output = new StringBuilder();
        for (Gameplay gameplay : gameplays) {
            output.append(gameplay.getName()).append(" ").append(gameplay.getClass().getSimpleName()).append("\n");
            if (gameplay.getTeam().isEmpty()) {
                output.append("none\n");
            } else {
                output.append("Team: ").append(gameplay.getTeam()
                        .stream()
                        .map(Team::getName)
                        .collect(Collectors.joining(" "))).append("\n");
            }
            output.append("Equipment: ").append(gameplay.getEquipments().size());
            output.append(", Protection: ").append(gameplay.allProtection());
        }
        return output.toString();
    }


}
