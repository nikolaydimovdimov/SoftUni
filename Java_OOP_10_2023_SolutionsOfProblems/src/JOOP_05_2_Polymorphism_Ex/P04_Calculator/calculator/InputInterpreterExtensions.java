package JOOP_05_2_Polymorphism_Ex.P04_Calculator.calculator;

public class InputInterpreterExtensions extends InputInterpreter{

    private MemoryStorage memoryStorage;

    public InputInterpreterExtensions(CalculationEngine engine,MemoryStorage memoryStorage) {
        super(engine);
        this.memoryStorage=memoryStorage;
    }

    @Override
    public Operation getOperation(String operation) {

        if (operation.equals("*")) {
            return super.getOperation(operation);
        } else if (operation.equals("/")) {
            return new DevideOperation();
        } else if (operation.equals("mr")) {
            return new RecallOperation(memoryStorage);
        } else if (operation.equals("ms")) {
            return new StoreOperation(memoryStorage);
        }
        return null;
    }

}
