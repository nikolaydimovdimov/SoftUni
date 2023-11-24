package JOOP_04_2_Interfaces_and_Abstraction_Ex.P07_Collection_Hierarchy;

import java.util.ArrayList;
import java.util.List;

public abstract class Collection {
    private final int maxSize=100;
    private List<String> items;

    public Collection() {
        this.items = new ArrayList<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public List<String> getItems() {
        return items;
    }

    public abstract int add(String item);
    public abstract String remove();

    @Override
    public String toString() {
        StringBuilder output=new StringBuilder();
        this.items.forEach(it->output.append(it).append(" "));
        return output.toString().trim();
    }
}
