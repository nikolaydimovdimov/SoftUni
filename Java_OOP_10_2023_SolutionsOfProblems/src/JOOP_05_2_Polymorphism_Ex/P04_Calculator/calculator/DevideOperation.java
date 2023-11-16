package JOOP_05_2_Polymorphism_Ex.P04_Calculator.calculator;

import java.util.ArrayList;
import java.util.List;

public class DevideOperation implements Operation{
    private List<Integer> operands;
    private int result;

    public DevideOperation() {
        this.operands = new ArrayList<>();
    }

    public void addOperand(int operand) {
        this.operands.add(operand);

        if (this.isCompleted()) {
            this.result = this.operands.get(0) / this.operands.get(1);
        }
    }

    public boolean isCompleted() {
        return this.operands.size() == 2;
    }

    @Override
    public int getResult() {
        return this.result;
    }


}
