package JOOP_04_2_Interfaces_and_Abstraction_Ex.P06_MilitaryElite;

public class SpyImpl extends SoldierImpl implements Spy {
    private String codeNumber;

    public SpyImpl(int id, String firstName, String lastName, String codeNumber) {
        super(id, firstName, lastName);
        this.setCodeNumber(codeNumber);
    }


    public String getCodeNumber() {
        return codeNumber;
    }

    private void setCodeNumber(String codeNumber) {
        this.codeNumber = codeNumber;
    }

    public String toString() {
        return super.toString() +
                System.lineSeparator() +
                String.format("Code Number: %s", this.codeNumber);
    }
}
