package JOOP_04_1_Interfaces_and_Abstraction_Lab.P05_BorderControl_Extended;

public abstract class BaseIdentifiable implements Identifiable {

    private String id;

    protected BaseIdentifiable(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

}
