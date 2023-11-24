package robotService.core;

import robotService.entities.robot.FemaleRobot;
import robotService.entities.robot.MaleRobot;
import robotService.entities.robot.Robot;
import robotService.entities.services.MainService;
import robotService.entities.services.SecondaryService;
import robotService.entities.services.Service;
import robotService.entities.supplements.MetalArmor;
import robotService.entities.supplements.PlasticArmor;
import robotService.entities.supplements.Supplement;
import robotService.repositories.SupplementRepository;

import java.util.ArrayList;
import java.util.Collection;

public class ControllerImpl implements Controller {
    private SupplementRepository supplements;

    private Collection<Service> services;

    public ControllerImpl() {
        this.supplements = new SupplementRepository();
        this.services = new ArrayList<>();
    }


    @Override
    public String addService(String type, String name) {

        Service service;
        switch (type) {
            case "MainService":
                service = new MainService(name);
                break;
            case "SecondaryService":
                service = new SecondaryService(name);
                break;
            default:
                throw new NullPointerException("Invalid service type.");
        }
        services.add(service);
        return String.format("%s is successfully added.", type);
    }

    @Override
    public String addSupplement(String type) {
        Supplement supplement;
        switch (type) {
            case "PlasticArmor":
                supplement = new PlasticArmor();
                break;
            case "MetalArmor":
                supplement = new MetalArmor();
                break;
            default:
                throw new IllegalArgumentException("Invalid supplement type.");
        }
        supplements.addSupplement(supplement);
        return String.format("%s is successfully added.", type);
    }

    @Override
    public String supplementForService(String serviceName, String supplementType) {
        Supplement neededSupplement = this.supplements.findFirst(supplementType);
        if (neededSupplement == null) {
            throw new IllegalArgumentException(String.format("Supplement of type %s is missing.", supplementType));
        }
        Service neededService = getServiceByName(serviceName);
        neededService.addSupplement(neededSupplement);
        this.supplements.removeSupplement(neededSupplement);
        return String.format("Successfully added %s to %s.", supplementType, serviceName);
    }

    @Override
    public String addRobot(String serviceName, String robotType, String robotName, String robotKind, double price) {
        Robot newRobot;
        String returnText = "";
        switch (robotType) {
            case "MaleRobot":
                newRobot = new MaleRobot(robotName, robotKind, price);
                break;
            case "FemaleRobot":
                newRobot = new FemaleRobot(robotName, robotKind, price);
                break;
            default:
                throw new IllegalArgumentException("Invalid robot type.");
        }
        Service neededService = getServiceByName(serviceName);
        if (neededService.getClass().getSimpleName().equals("MainService") &&
                robotType.equals("MaleRobot") ||
                neededService.getClass().getSimpleName().equals("SecondaryService") &&
                        robotType.equals("FemaleRobot")) {
            neededService.addRobot(newRobot);
            returnText = String.format("Successfully added %s to %s.", robotType, serviceName);
        } else {
            returnText = "Unsuitable service.";
        }
        return returnText;
    }

    @Override
    public String feedingRobot(String serviceName) {
        getServiceByName(serviceName).feeding();

        return String.format("Robots fed: %d", getServiceByName(serviceName).getRobots().size());
    }

    @Override
    public String sumOfAll(String serviceName) {
        double sumRobots = getServiceByName(serviceName)
                .getRobots()
                .stream()
                .mapToDouble(Robot::getPrice)
                .sum();

        double sumPrice = getServiceByName(serviceName)
                .getSupplements()
                .stream()
                .mapToDouble(Supplement::getPrice)
                .sum();
        return String.format("The value of service %s is %.2f.", serviceName, sumRobots + sumPrice);
    }

    @Override
    public String getStatistics() {
        StringBuilder output = new StringBuilder();
        for (Service service : services) {
            output.append(service.getStatistics()).append(System.lineSeparator());
        }

        return output.toString();
    }

    private Service getServiceByName(String name) {
        return this.services.stream()
                .filter(service -> service.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
}
