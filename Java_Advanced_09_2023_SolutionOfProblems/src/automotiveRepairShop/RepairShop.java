package automotiveRepairShop;

import java.util.ArrayList;
import java.util.List;

public class RepairShop {



        private int capacity;
        private List<Vehicle> vehicles;


    public RepairShop(int capacity) {
        this.capacity = capacity;
        this.vehicles=new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        if(this.vehicles.size()<this.capacity) this.vehicles.add(vehicle);
    }

    public boolean removeVehicle(String vin){
        if(this.vehicles.isEmpty()) return false;
        for (Vehicle v : this.vehicles) {
            if(v.getVIN().equals(vin)) {
                this.vehicles.remove(v);
                return true;
            }
        }
        return false;
    }

    public int getCount(){
        return this.vehicles.size();
    }

    public Vehicle getLowestMileage(){
        Vehicle lowestMileageVehicle=this.vehicles.get(0);
        for (Vehicle vehicle : this.vehicles) {
            if(vehicle.getMileage()<lowestMileageVehicle.getMileage()) lowestMileageVehicle=vehicle;
        }
        return lowestMileageVehicle;
    }

    public String report(){
        StringBuilder report=new StringBuilder();
        report.append("Vehicles in the preparatory:\n");
        for (Vehicle vehicle : this.vehicles) {
            report.append(vehicle);
            report.append("\n");
        }
        return report.toString();
    }

}
