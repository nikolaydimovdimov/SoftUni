package JOOP_03_2_Inheritance_Ex.restaurant;

import java.math.BigDecimal;

public class MainDish extends Food{

    public MainDish(String name, BigDecimal price, double grams) {
        super(name, price, grams);
    }
}
