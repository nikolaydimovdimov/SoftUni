package JOOP_04_2_Interfaces_and_Abstraction_Ex.P06_MilitaryElite;

import java.util.Collection;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {
    private Collection<Mission> missions;

    public CommandoImpl(int id, String firstName, String lastName,
                        double salary, Corps corps, Collection<Mission> missions) {
        super(id, firstName, lastName, salary, corps);
        this.setMissions(missions);
    }


    public void addMission(Mission mission){
        this.missions.add(mission);
    }

    public Collection<Mission> getMissions() {
        return missions;
    }

    private void setMissions(Collection<Mission> missions) {
        this.missions = missions;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append(super.toString())
                .append(System.lineSeparator())
                .append("Missions:")
                .append(System.lineSeparator());
        this.missions.stream()
                .forEach(ms -> output.append("  ").append(ms.toString()).append(System.lineSeparator()));
        return output.toString().trim();
    }
}
