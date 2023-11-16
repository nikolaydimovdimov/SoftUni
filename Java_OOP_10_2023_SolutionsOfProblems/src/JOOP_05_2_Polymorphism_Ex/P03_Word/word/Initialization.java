package JOOP_05_2_Polymorphism_Ex.P03_Word.word;

public class Initialization {
    public static CommandInterface buildCommandInterface(StringBuilder text){
        return new CommandImplExtended(text);
    }
}
