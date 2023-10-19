package vendingSystem;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private int buttonCapacity;
    private List<Drink> drinks;


    public VendingMachine(int buttonCapacity) {
        this.buttonCapacity = buttonCapacity;
        this.drinks =new ArrayList<>();
    }

    public int getCount(){
        return this.drinks.size();
    }

    public void addDrink(Drink drink){
        if(getCount()<this.buttonCapacity) this.drinks.add(drink);
    }

    public boolean removeDrink(String name){
        if (this.drinks.isEmpty()) return false;
        for (Drink drink : this.drinks) {
            if(drink.getName().equals(name)) {
                this.drinks.remove(drink);
                return true;
            }
        }
        return false;
    }

    public Drink getLongest(){
        Drink longest=this.drinks.get(0);
        for (Drink drink : this.drinks) {
            if(drink.getVolume()> longest.getVolume()) longest=drink;
        }
        return longest;
    }

    public Drink getCheapest(){
        Drink cheapest=this.drinks.get(0);
        for (Drink drink : this.drinks) {
            if(cheapest.getPrice().compareTo(drink.getPrice())==-1) cheapest=drink;
        }
        return cheapest;
    }

    public String buyDrink(String name){
        Drink namedDrink=new Drink("",new BigDecimal("0"),0);
        for (Drink drink : this.drinks) {
            if(drink.getName().equals(name)) {
                namedDrink=drink;
            }
        }
        return namedDrink.toString();
    }

    public String report(){
        StringBuilder print=new StringBuilder();
        print.append("Drinks available:\n");
        for (Drink drink : this.drinks) {
            print.append(drink.toString());
            print.append("\n");
        }
        return print.toString();
    }
}
