package JADV7_1_Workshop_Custom_Data_Structures_P01_SmartArray;

import java.util.function.Consumer;

public class SmartArray {
    private static final int INITIAL_CAPACITY = 4;
    private int[] data;
    private int size;
    private int capacity;

    public SmartArray() {
        this.setData(new int[INITIAL_CAPACITY]);
        this.setSize(0);
        this.setCapacity(INITIAL_CAPACITY);
    }


    private void setData(int[] data) {
        this.data = data;
    }

    private void setSize(int size) {
        this.size = size;
    }

    private void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int get(int index) {
        checkIndexIsValid(index);
        return this.data[index];
    }

    public void add(int value) {
        this.setSize(++this.size);
        if(size>capacity) this.resize();
        this.data[this.size-1] = value;

    }

    public void add(int index, int value){
        checkIndexIsValid(index);
        int copyLastValue=this.data[index];
        this.shiftRight(index);
        this.data[index]=value;
        this.add(copyLastValue);

    }

    public boolean contains(int value){
        for (int i = 0; i < this.size; i++) {
            if(this.data[i]==value) return true;
        }
        return false;
    }

    public int remove(int index){
        checkIndexIsValid(index);
        int value=this.data[index];
        this.shiftLeft(index);
        setSize(--this.size);
        if (this.size<this.capacity/4) this.shrink();
        return value;
    }

    public void forEach(Consumer<Integer> consumer){
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.data[i]);
        }
    }

    private void shiftLeft(int index){
        for (int i = index; i <this.size-1 ; i++) {
            this.data[i]=this.data[i+1];
        }
    }

    private void shiftRight(int index){
        for (int i = index; i <this.size-1 ; i++) {
            this.data[i+1]=this.data[i];
        }
    }

    private void resize() {
        this.setCapacity(this.capacity*2);
        int[] newData = new int[this.capacity];
        if (this.size >= 0) System.arraycopy(this.data, 0, newData, 0, this.size-1);
        this.setData(newData);
    }

    private void shrink(){
        if(capacity<=INITIAL_CAPACITY) return;
        this.setCapacity(this.capacity/2);
        int[] newData=new int[this.capacity];
        if (this.size >= 0) System.arraycopy(this.data, 0, newData, 0, this.size);
        this.setData(newData);
    }

    private void checkIndexIsValid(int index) {
        if (index < 0 || index >= this.size) {
            System.out.println("Invalid INDEX!!!");
            throw new IndexOutOfBoundsException();
        }
    }

}
