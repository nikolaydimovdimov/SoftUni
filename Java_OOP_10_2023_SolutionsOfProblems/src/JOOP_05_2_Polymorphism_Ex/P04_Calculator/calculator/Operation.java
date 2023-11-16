package JOOP_05_2_Polymorphism_Ex.P04_Calculator.calculator;

public interface Operation {
    void addOperand(int operand);
    int getResult();
    boolean isCompleted();
}
