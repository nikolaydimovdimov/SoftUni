package JOOP_04_1_Interfaces_and_Abstraction_Lab.P03_SayHello;

public class European implements Person{
    private String name;

    public European(String name) {
        this.name = name;
    }


    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
