package JOOP_04_1_Interfaces_and_Abstraction_Lab.P04_SayHelloExtended;

public abstract class BasePerson implements Person{
    private String name;

    protected BasePerson(String name) {
        this.setName(name);
    }

    @Override
    public String getName() {
        return null;
    }

    private void setName(String name) {
        this.name = name;
    }
}
