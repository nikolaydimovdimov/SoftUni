package JOOP_05_2_Polymorphism_Ex.P04_Calculator.calculator;

import java.util.ArrayDeque;
import java.util.Deque;

public class MemoryStorage {
    private Deque<Integer> operands;

    public MemoryStorage() {
        this.operands = new ArrayDeque<>();
    }

    public void push(int operand) {
       this.operands.push(operand);
    }

    public int pop() {
        return this.operands.pop();
    }
    public boolean isCompleted() {
        return true;
    }
}
