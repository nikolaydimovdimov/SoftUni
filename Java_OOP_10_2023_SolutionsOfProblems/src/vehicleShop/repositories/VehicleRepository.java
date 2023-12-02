package vehicleShop.repositories;

import vehicleShop.models.vehicle.Vehicle;
import vehicleShop.models.worker.Worker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class VehicleRepository implements Repository<Vehicle> {
    private Collection<Vehicle> vehicles;

    public VehicleRepository() {
        this.vehicles=new ArrayList<>();
    }
    public Collection<Vehicle> getWorkers() {
        return Collections.unmodifiableCollection(this.vehicles);
    }

    @Override
    public void add(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    @Override
    public boolean remove(Vehicle vehicle) {
        return this.vehicles.remove(vehicle);
    }

    @Override
    public Vehicle findByName(String name) {
        return this.vehicles.stream()
                .filter(vehicle -> vehicle.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
}
