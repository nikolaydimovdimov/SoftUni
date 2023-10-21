package halloween;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class House {

    private int capacity;
    List<Kid> data;


    public House(int capacity) {
        this.capacity = capacity;
        this.data=new ArrayList<>();
    }

    public void addKid(Kid kid){
        if(this.data.size()<capacity) this.data.add(kid);
    }

    public boolean removeKid(String name){
        if (this.data.isEmpty()) return false;
        for (Kid k : this.data) {
            if(k.getName().equals(name)) {
                this.data.remove(k);
                return true;
            }
        }
        return false;
    }

    public Kid getKid(String street){
        return this.data.stream().filter(kid -> Objects.equals(kid.getStreet(), street))
                .findFirst().orElse(null);
    }

    public int getAllKids(){
        return this.data.size();
    }

    public String getStatistics(){
        StringBuilder statistics=new StringBuilder();
        statistics.append("Children who visited a house for candy:");
        for (Kid kid : this.data) {
            statistics.append("\n").append(String.format("%s from %s street",
                    kid.getName(), kid.getStreet()));
        }
        return statistics.toString().trim();
    }
}
