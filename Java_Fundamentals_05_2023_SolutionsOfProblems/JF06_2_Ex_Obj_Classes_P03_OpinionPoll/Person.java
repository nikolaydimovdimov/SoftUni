package JF06_2_Ex_Obj_Classes_P03_OpinionPoll;

public class Person {
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String output(){
        return String.format("%s - %d",this.name,this.age);
    }
}
