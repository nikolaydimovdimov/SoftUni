package JOOP_05_2_Polymorphism_Ex.P03_Word.word;

import java.util.List;

public class CommandImplExtended extends CommandImpl {

    private String saver;

    class CutTransform implements TextTransform {
        @Override
        public void invokeOn(StringBuilder text, int startIndex, int endIndex) {
            saver = text.substring(startIndex, endIndex);
            text.delete(startIndex, endIndex);
        }
    }

    class PasteTransform implements TextTransform {
        @Override
        public void invokeOn(StringBuilder text, int startIndex, int endIndex) {
            if (startIndex != endIndex) {
                text.replace(startIndex, endIndex, saver);
            } else {
                text.insert(startIndex, saver);
            }
        }
    }

    public CommandImplExtended(StringBuilder text) {
        super(text);
        super.init();
        saver="";
    }

    @Override
    protected List<Command> initCommands() {
        List<Command> commands = super.initCommands();
        commands.add(new Command("cut", new CutTransform()));
        commands.add(new Command("paste", new PasteTransform()));
        return commands;
    }
}
