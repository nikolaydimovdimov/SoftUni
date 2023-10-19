package JADV8_1_Generics_BOX;

public class BoxC<T extends Comparable<T>> implements Comparable<BoxC<T>> {


    private T data;

    public BoxC() {
    }

    public BoxC(T data) {
        this.data = data;
    }

    @Override
    public int compareTo(BoxC<T> o) {
        return this.data.compareTo(o.data);
    }

    @Override
    public String toString() {
        return String.format("%s: %s", this.data.getClass().getName(), this.data);
    }

}


