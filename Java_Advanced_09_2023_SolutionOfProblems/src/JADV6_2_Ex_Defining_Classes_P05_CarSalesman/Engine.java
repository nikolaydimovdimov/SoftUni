package JADV6_2_Ex_Defining_Classes_P05_CarSalesman;

public class Engine {

    String model;
    int power;
    int displacement;
    String efficiency;

    public Engine(String model, int power, int displacement, String efficiency) {
        this.setModel(model);
        this.setPower(power);
        this.setDisplacement(displacement);
        this.setEfficiency(efficiency);
    }
public Engine(String model, int power, int displacement) {
        this.setModel(model);
        this.setPower(power);
        this.setDisplacement(displacement);
        this.setEfficiency("n/a");
    }
public Engine(String model, int power,  String efficiency) {
        this.setModel(model);
        this.setPower(power);
        this.setDisplacement(-1);
        this.setEfficiency(efficiency);
    }
public Engine(String model, int power) {
        this.setModel(model);
        this.setPower(power);
        this.setDisplacement(-1);
        this.setEfficiency("n/a");
    }
public Engine() {
    }


    public void setModel(String model) {
        this.model = model;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public int getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }

    @Override
    public String toString() {
        String outStr;
        if(this.getDisplacement()==-1) {
            outStr="n/a";
        }else{
            outStr=String.valueOf(this.getDisplacement());
        }
        return String.format("%s:%nPower: %d%nDisplacement: %s%nEfficiency: %s",
                this.getModel(),this.getPower(),outStr,this.getEfficiency());
    }
}
