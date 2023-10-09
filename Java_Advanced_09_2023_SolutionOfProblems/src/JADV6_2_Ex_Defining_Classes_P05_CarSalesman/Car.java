package JADV6_2_Ex_Defining_Classes_P05_CarSalesman;

public class Car {

    private String model;

    private Engine engine;
    int weight;
    String color;

    public Car(String model, Engine engine, int weight, String color) {
        this.setModel(model);
        this.setEngine(engine);
        this.setWeight(weight);
        this.setColor(color);
    }
public Car(String model, Engine engine, int weight) {
        this.setModel(model);
        this.setEngine(engine);
        this.setWeight(weight);
        this.setColor("n/a");
    }
public Car(String model, Engine engine, String color) {
        this.setModel(model);
        this.setEngine(engine);
        this.setWeight(-1);
        this.setColor(color);
    }
public Car(String model, Engine engine) {
        this.setModel(model);
        this.setEngine(engine);
        this.setWeight(-1);
        this.setColor("n/a");
    }


    public Car() {
    }


    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        String outStr;
        if(this.getWeight()==-1) {
            outStr="n/a";
        }else{
            outStr=String.valueOf(this.getWeight());
        }
        return String.format("%s:%n%s%nWeight: %s%nColor: %s",
                this.getModel(),engine.toString(),outStr,this.getColor());
    }
}
