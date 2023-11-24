package JOOP_04_2_Interfaces_and_Abstraction_Ex.P06_MilitaryElite;

public class Mission {
    private String codeName;
    private State state;

    public Mission(String codeName, State state) {
        this.setCodeName(codeName);
        this.setState(state);
    }

    public String getCodeName() {
        return codeName;
    }

    private void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public State getState() {
        return state;
    }

    private void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s",
                this.codeName,this.state.toString());
    }
}
