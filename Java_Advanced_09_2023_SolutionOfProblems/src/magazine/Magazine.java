package magazine;

import java.util.ArrayList;
import java.util.List;

public class Magazine {


    private List<Cloth> data;
    private String type;
    private int capacity;

    public Magazine(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void addCloth(Cloth cloth) {
        if (this.data.size() < this.capacity) this.data.add(cloth);
    }

    public boolean removeCloth(String color) {
        if (this.data.isEmpty()) return false;
        for (Cloth d : this.data) {
            if (d.getColor().equals(color)) {
                this.data.remove(d);
                return true;
            }
        }
        return false;
    }

    public Cloth getSmallestCloth(){
        if(this.data.isEmpty()) return null;
        Cloth smallestCloth=this.data.get(0);
        for (Cloth d : this.data) {
            if(d.getSize()<smallestCloth.getSize()) smallestCloth=d;
        }
        return smallestCloth;
    }

    public Cloth getCloth(String color){
        Cloth wantedCloth=null;
        for (Cloth d : this.data) {
            if(d.getColor().equals(color)) wantedCloth=d;
        }
        return wantedCloth;
    }

    public int getCount(){
        return this.data.size();
    }

    public String report(){
        StringBuilder report=new StringBuilder();
        report.append(String.format("%s magazine contains:%n",this.type));
        for (Cloth d : this.data) {
            report.append(d);
            report.append("\n");
        }
        return report.toString().trim();
    }

}
