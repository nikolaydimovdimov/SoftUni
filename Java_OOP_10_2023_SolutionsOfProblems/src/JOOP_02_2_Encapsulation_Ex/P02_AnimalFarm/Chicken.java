package JOOP_02_2_Encapsulation_Ex.P02_AnimalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    private void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    private void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }


    private double calculateProductPerDay() {
        double production = 0.75;
        if (this.age < 6) {
            production = 2;
        } else if (this.age < 12) {
            production = 1;
        }
        return production;
    }

    public double productPerDay() {
        return this.calculateProductPerDay();
    }

    public String toString() {
        return String.format("JOOP_02_2_Encapsulation_Ex.P02_AnimalFarm.Chicken %s (age %d) can produce %.2f eggs per day.",
                this.name, this.age, this.productPerDay());
    }

}
