package vehicleShop.core;

import vehicleShop.models.shop.ShopImpl;
import vehicleShop.models.tool.Tool;
import vehicleShop.models.tool.ToolImpl;
import vehicleShop.models.vehicle.Vehicle;
import vehicleShop.models.vehicle.VehicleImpl;
import vehicleShop.models.worker.FirstShift;
import vehicleShop.models.worker.SecondShift;
import vehicleShop.models.worker.Worker;
import vehicleShop.repositories.VehicleRepository;
import vehicleShop.repositories.WorkerRepository;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import static vehicleShop.common.ConstantMessages.*;
import static vehicleShop.common.ExceptionMessages.NO_WORKER_READY;
import static vehicleShop.common.ExceptionMessages.WORKER_TYPE_DOESNT_EXIST;

public class ControllerImpl implements Controller {
    private WorkerRepository workerRepository;
    private VehicleRepository vehicleRepository;
    private ShopImpl shop;

    public ControllerImpl() {
        this.workerRepository = new WorkerRepository();
        this.vehicleRepository = new VehicleRepository();
        this.shop = new ShopImpl();
    }


    @Override
    public String addWorker(String type, String workerName) {
        Worker newWorker;
        switch (type) {
            case "FirstShift":
                newWorker = new FirstShift(workerName);
                break;
            case "SecondShift":
                newWorker = new SecondShift(workerName);
                break;
            default:
                throw new IllegalArgumentException(WORKER_TYPE_DOESNT_EXIST);
        }
        this.workerRepository.add(newWorker);
        return String.format(ADDED_WORKER, newWorker.getClass().getSimpleName(), newWorker.getName());
    }

    @Override
    public String addVehicle(String vehicleName, int strengthRequired) {
        this.vehicleRepository.add(new VehicleImpl(vehicleName, strengthRequired));
        return String.format(SUCCESSFULLY_ADDED_VEHICLE, vehicleName);
    }

    @Override
    public String addToolToWorker(String workerName, int power) {
        Worker currentWorker = this.workerRepository.findByName(workerName);
        if (currentWorker == null) {
            throw new IllegalArgumentException(WORKER_TYPE_DOESNT_EXIST + "You cannot add a tool.");
        }
        currentWorker.addTool(new ToolImpl(power));
        return String.format(SUCCESSFULLY_ADDED_TOOL_TO_WORKER, power, workerName);
    }

    @Override
    public String makingVehicle(String vehicleName) {
        Worker currentWorker = getWorkerWithStrength();
        if (currentWorker == null) {
            throw new IllegalArgumentException(NO_WORKER_READY);
        }
        Vehicle currentVehicle = this.vehicleRepository.getWorkers().stream()
                .filter(vehicle -> vehicle.getName().equals(vehicleName))
                .findFirst()
                .orElse(null);

        int brokenTools = getNumberOfBrokenTools();

        while (!currentVehicle.reached() && currentWorker != null) {

            shop.make(currentVehicle, currentWorker);

            if (!currentVehicle.reached()) {
                currentWorker = getWorkerWithStrength();
            }
        }
        brokenTools = getNumberOfBrokenTools() - brokenTools;
        String done = "";
        if (currentVehicle.reached()) {
            done = "done";
        } else {
            done = "not done";
        }

        return String.format(VEHICLE_DONE, vehicleName, done) + String.format( COUNT_BROKEN_INSTRUMENTS, brokenTools);


    }

    private Worker getWorkerWithStrength() {

        for (Worker worker : this.workerRepository.getWorkers()) {
            if (worker.getStrength() > 70) return worker;
        }
        return null;

    }

    private int getNumberOfBrokenTools() {

        int sumTools = 0;

        for (Worker worker : this.workerRepository.getWorkers()) {
            for (Tool tool : worker.getTools()) {
                if (tool.isUnfit()) sumTools++;
            }
        }
        return sumTools;
    }



    @Override
    public String statistics() {
        StringBuilder output = new StringBuilder();
        output.append(String.format("%d vehicles are ready!%n", getNumberReachedVehicle()));
        output.append("Info for workers:\n");
        this.workerRepository.getWorkers()
                .forEach(worker -> {
                            output.append(String.format("Name: %s, Strength: %d%n", worker.getName(), worker.getStrength()));
                            output.append(String.format("Tools: %d fit left%n", worker.getTools().stream().filter(tool -> !tool.isUnfit()).count()));
                        }
                );

        return output.toString();
    }

    private int getNumberReachedVehicle() {
        int sumVehicle = 0;
        for (Vehicle vehicle : this.vehicleRepository.getWorkers()) {
            if (vehicle.reached()) sumVehicle++;
        }
        return sumVehicle;
    }
}
