package barracksWars.core;

import barracksWars.interfaces.Repository;
import barracksWars.interfaces.Runnable;
import barracksWars.interfaces.Unit;
import barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;

public class NewEngine implements Runnable {

    private Repository repository;
    private UnitFactory unitFactory;

    public NewEngine(Repository repository, UnitFactory unitFactory) {
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    @Override
    public void run() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        while (true) {
            try {
                String input = reader.readLine();
                String[] data = input.split("\\s+");
                String commandName = data[0];
                String result = interpretCommand(data, commandName);
                if (result.equals("fight")) {
                    break;
                }
                System.out.println(result);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            } catch (IOException | ExecutionControl.NotImplementedException e) {
                e.printStackTrace();
            }
        }
    }


    private String interpretCommand(String[] data, String commandName) throws ExecutionControl.NotImplementedException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        String result;
        switch (commandName) {
            case "add":
                result = this.addUnitCommand(data);
                break;
            case "report":
                result = this.reportCommand(data);
                break;
            case "fight":
                result = this.fightCommand(data);
                break;
            case "retire":
                result=this.retireCommand(data);
                break;
            default:
                throw new RuntimeException("Invalid command!");
        }
        return result;
    }

    private String reportCommand(String[] data) {
        String output = this.repository.getStatistics();
        return output;
    }

    private String addUnitCommand(String[] data) throws ExecutionControl.NotImplementedException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        String unitType = data[1];
        Unit unitToAdd = this.unitFactory.createUnit(unitType);
        this.repository.addUnit(unitToAdd);
        String output = unitType + " added!";
        return output;
    }

    private String fightCommand(String[] data) {
        return "fight";
    }

    private String retireCommand(String[] data) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        String unitType = data[1];
//        Unit unitToRetire = this.unitFactory.createUnit(unitType);
        try {
            this.repository.removeUnit(unitType);
        } catch (ExecutionControl.NotImplementedException e) {
            return "No such units in repository.";
        }
        return String.format("%s retired!", unitType);

    }
}
