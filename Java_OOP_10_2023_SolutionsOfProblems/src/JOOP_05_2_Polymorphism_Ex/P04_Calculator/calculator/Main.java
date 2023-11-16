package JOOP_05_2_Polymorphism_Ex.P04_Calculator.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CalculationEngine engine = new CalculationEngine();
        MemoryStorage memoryStorage=new MemoryStorage();
        InputInterpreter interpreter = Extensions.buildInterpreter(engine,memoryStorage);
        String[] tokens = scanner.nextLine().split("\\s+");
        for (String token : tokens) {
            if(token.equals("end")){
                break;
            }

            interpreter.interpret(token);
        }

        System.out.println(engine.getCurrentResult());
    }
}
