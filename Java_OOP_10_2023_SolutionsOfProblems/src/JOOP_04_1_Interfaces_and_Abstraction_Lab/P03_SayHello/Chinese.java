package JOOP_04_1_Interfaces_and_Abstraction_Lab.P03_SayHello;

public class Chinese implements Person{

    private String name;

    public Chinese(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
