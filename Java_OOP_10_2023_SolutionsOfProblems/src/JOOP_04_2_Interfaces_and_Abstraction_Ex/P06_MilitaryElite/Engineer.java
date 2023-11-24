package JOOP_04_2_Interfaces_and_Abstraction_Ex.P06_MilitaryElite;

import java.util.Collection;

public interface Engineer {
    Collection<Repair> getRepairs();

    void addRepair(Repair repair);
}
