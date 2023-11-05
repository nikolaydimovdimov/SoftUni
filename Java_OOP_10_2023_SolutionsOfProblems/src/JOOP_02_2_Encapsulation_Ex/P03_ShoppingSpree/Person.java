package JOOP_02_2_Encapsulation_Ex.P03_ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        Validation.validate(name);
        this.name = name;
    }

    private void setMoney(double money) {
        Validation.validate(money);
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public void buyProduct(Product product) {
        if (product.getCost() > this.money) {
            System.out.printf("%s can't afford %s%n", this.getName(), product.getName());
        } else {
            this.products.add(product);
            this.setMoney(this.money - product.getCost());
            System.out.printf("%s bought %s%n", this.getName(), product.getName());
        }
    }

    public String toString() {
        String output = this.getName() + " - ";
        if (this.products.isEmpty()) {
            output += "Nothing bought";
        } else {
            output += this.products.stream().map(Product::getName).collect(Collectors.joining(", "));
        }
        return output;
    }

}
