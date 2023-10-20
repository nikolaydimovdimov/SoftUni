package kindergarten;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Kindergarten {

    String name;
    int capacity;
    List<Child> registry;


    public Kindergarten(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.registry=new ArrayList<>();
    }

    public boolean addChild(Child child){
        if(this.registry.size()<this.capacity){
            this.registry.add(child);
            return true;
        }
        return false;
    }

    public boolean removeChild(String firstName){
        if(this.registry.isEmpty()) return false;
        for (Child child : this.registry) {
            if(child.getFirstName().equals(firstName)){
                this.registry.remove(child);
                return true;
            }
        }
        return false;
    }

    public int getChildrenCount(){
        return this.registry.size();
    }

    public Child getChild(String firstName){
        if(this.registry.isEmpty()) return null;
        for (Child child : this.registry) {
            if(child.getFirstName().equals(firstName)) return child;
        }
        return null;
    }

    public String registryReport(){
        StringBuilder report=new StringBuilder();
        report.append("Registered children in ");
        report.append(this.name);
        report.append(":");

        this.registry.stream().sorted(orderingChild).forEach(ch -> {report.append("\n--\n");
                                                                    report.append(ch);});
        return report.toString().trim();
    }

    Comparator<Child> orderingChild = (a, b) -> {
        if(a.getAge()==b.getAge()) {
            if (a.getFirstName().compareTo(b.getFirstName()) == 0) {
                return a.getLastName().compareTo(b.getLastName());
            }
            return a.getFirstName().compareTo(b.getFirstName());
        }
        return Integer.compare(a.getAge(), b.getAge());
    };

}
