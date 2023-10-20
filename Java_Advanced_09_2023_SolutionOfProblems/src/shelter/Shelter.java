package shelter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shelter {

    List<Animal> data;
    int capacity;

    public Shelter(int capacity) {
        this.capacity = capacity;
        this.data=new ArrayList<>();
    }


    public List<Animal> getData() {
        return data;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setData(List<Animal> data) {
        this.data = data;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void add(Animal animal){
        if(this.data.size()<this.capacity){
            this.data.add(animal);
        }
    }

    public boolean remove(String name){
        if(this.data.isEmpty()) return false;
        for (Animal animal : this.data) {
            if(animal.name.equals(name)) {
                this.data.remove(animal);
                return true;
            }
        }
        return false;
    }

    public Animal getAnimal(String name, String caretaker){
        if(this.data.isEmpty()) return null;
        return this.data.stream()
                .filter(animal -> animal.name.equals(name) && animal.caretaker.equals(caretaker))
                .findFirst().orElse(null);
    }

    public Animal getOldestAnimal(){
        if(this.data.isEmpty()) return null;
        return this.data.stream()
                .max(Comparator.comparing(Animal::getAge))
                .orElse(null);
    }

    public int getCount(){
        return this.data.size();
    }

    public String 	getStatistics(){
        StringBuilder report=new StringBuilder();
        report.append("The shelter has the following animals:");
        for (Animal animal : this.data) {
            report.append("\n").append(animal.name).append(" ").append(animal.caretaker);
        }
        return report.toString().trim();
    }
}
