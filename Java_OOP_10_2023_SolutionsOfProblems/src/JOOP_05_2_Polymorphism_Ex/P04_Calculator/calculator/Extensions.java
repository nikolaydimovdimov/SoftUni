package JOOP_05_2_Polymorphism_Ex.P04_Calculator.calculator;

public class Extensions {


    public static InputInterpreter buildInterpreter(CalculationEngine engine,MemoryStorage memoryStorage){
        return new InputInterpreterExtensions(engine,memoryStorage);
    }
}
