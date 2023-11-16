package JOOP_04_1_Interfaces_and_Abstraction_Lab.P05_BorderControl_Extended;

public class Robot extends BaseIdentifiable {
    private String model;

    public Robot(String model, String id) {
        super(id);
        this.model = model;
    }

      public String getModel() {
        return model;
    }
}
