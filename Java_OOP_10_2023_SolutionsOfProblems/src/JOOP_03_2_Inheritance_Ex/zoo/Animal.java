package JOOP_03_2_Inheritance_Ex.zoo;

public class Animal {
    private String name;

    public Animal(String name){
        this.setName(name);
    }

    private void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }
}
