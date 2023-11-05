package JOOP_02_2_Encapsulation_Ex.P03_ShoppingSpree;

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.setName(name);
        this.setCost(cost);
    }

    public void setName(String name) {
        Validation.validate(name);
        this.name = name;
    }

    public void setCost(double cost) {
        Validation.validate(cost);
        this.cost = cost;
    }

    public String getName() {
        return this.name;
    }

    public double getCost() {
        return this.cost;
    }
}
