package JOOP_04_2_Interfaces_and_Abstraction_Ex.P06_MilitaryElite;

import java.util.Collection;


public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {
    private Collection<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName,
                        double salary, Corps corps, Collection<Repair> repairs) {
        super(id, firstName, lastName, salary, corps);
        this.setRepairs(repairs);
    }


    private void setRepairs(Collection<Repair> repairs) {
        this.repairs = repairs;
    }

    public Collection<Repair> getRepairs() {
        return repairs;
    }

    public void addRepair(Repair repair) {
        this.repairs.add(repair);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append(super.toString())
                .append(System.lineSeparator())
                .append("Repairs:")
                .append(System.lineSeparator());
        this.repairs.stream()
                .forEach(pr -> output.append("  ").append(pr.toString()).append(System.lineSeparator()));
        return output.toString().trim();
    }
}
