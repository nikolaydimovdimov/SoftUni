package JOOP_04_1_Interfaces_and_Abstraction_Lab.P04_SayHelloExtended;

public class European extends BasePerson {
    public European(String name) {
        super(name);
    }
    @Override
    public String sayHello() {
        return "Hello";
    }
}
