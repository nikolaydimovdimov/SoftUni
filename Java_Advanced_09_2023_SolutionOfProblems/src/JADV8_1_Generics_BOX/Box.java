package JADV8_1_Generics_BOX;

public class Box<T> {

    private T data;

    public Box() {
    }

    public Box(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", this.data.getClass().getName(), this.data);
    }
}
