package JOOP_05_2_Polymorphism_Ex.P04_Calculator.calculator;

public class RecallOperation implements Operation{
    private MemoryStorage memoryStorage;

    public RecallOperation(MemoryStorage memoryStorage) {
        this.memoryStorage = memoryStorage;
    }

    @Override
    public void addOperand(int operand) {
        this.memoryStorage.push(operand);
    }

    @Override
    public int getResult() {
        return memoryStorage.pop();
    }

    @Override
    public boolean isCompleted() {
        return true;
    }
}
