package JOOP_04_2_Interfaces_and_Abstraction_Ex.P06_MilitaryElite;

import java.util.Collection;

public interface Commando {
    void addMission(Mission mission);
    Collection<Mission> getMissions();
}
