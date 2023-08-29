package groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
    private List<Pet> data;
    private int capacity;

    public GroomingSalon(int capacity) {
        this.data = new ArrayList<>();
        this.capacity = capacity;
    }
    public void add(Pet pet){
        if(this.data.size()<this.capacity){
            data.add(pet);
        }
    }
    public boolean remove(String name){
        for (Pet pet : this.data) {
            if(pet.getName().equals(name)){
                this.data.remove(pet);
                return true;
            }
        }
            return false;
    }
    public Pet getPet(String name,String owner){
        for (int i = 0; i < this.data.size(); i++) {
            if(this.data.get(i).getName().equals(name)&&this.data.get(i).getOwner().equals(owner)){
                return this.data.get(i);
            }
        }
        return null;
    }
    public int getCount(){
        return this.data.size();
    }
    public String getStatistics(){
        String output="The grooming salon has the following clients:\n";
        for (Pet pet : this.data) {
            output+=String.format("%s %s%n",pet.getName(),pet.getOwner());
        }
        return output;
    }
}
