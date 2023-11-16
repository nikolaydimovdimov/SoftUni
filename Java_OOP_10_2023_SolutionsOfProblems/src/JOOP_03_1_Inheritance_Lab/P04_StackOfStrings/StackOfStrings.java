package JOOP_03_1_Inheritance_Lab.P04_StackOfStrings;

import java.util.ArrayList;

public class StackOfStrings {
    private ArrayList<String> data=new ArrayList<>();

    public void push(String item){
        this.data.add(item);
    }
    public String pop(){
        return this.data.remove(this.data.size()-1);
    }

    public String peek(){
        return this.data.get(this.data.size()-1);
    }

    public boolean isEmpty(){
        return this.data.isEmpty();
    }

}
