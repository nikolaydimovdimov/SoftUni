package JOOP_04_2_Interfaces_and_Abstraction_Ex.P04_Food_Shortage;

public class Robot implements Identifiable{

    private String model;
    private String id;

    public Robot(String id, String model) {
        this.model = model;
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }
}
