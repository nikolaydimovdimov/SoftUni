package JOOP_04_2_Interfaces_and_Abstraction_Ex.P06_MilitaryElite;

public class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier{
    private Corps corps;

    public SpecialisedSoldierImpl(int id, String firstName, String lastName,
                                  double salary, Corps corps) {
        super(id, firstName, lastName, salary);
        this.setCorps(corps);
    }


    public Corps getCorps() {
        return corps;
    }

    private void setCorps(Corps corps) {
        this.corps = corps;
    }

    @Override
    public String toString() {
        return super.toString()
                +System.lineSeparator()
                +String.format("Corps: %s",this.corps.toString());
    }
}
