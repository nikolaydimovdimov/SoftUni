package vehicleShop.models.shop;

import vehicleShop.models.tool.Tool;
import vehicleShop.models.vehicle.Vehicle;
import vehicleShop.models.worker.Worker;

public class ShopImpl implements Shop {
    public ShopImpl() {
    }

    @Override
    public void make(Vehicle vehicle, Worker worker) {
        Tool currentTool = getNextFitTool(worker);

        while (!vehicle.reached() && worker.canWork() && currentTool != null) {
            vehicle.making();
            worker.working();
            currentTool.decreasesPower();
            if (currentTool.isUnfit()) {
                currentTool = getNextFitTool(worker);
            }
        }
        return;
    }

    private Tool getNextFitTool(Worker worker) {
        return worker.getTools().stream().filter(tool -> !tool.isUnfit()).findFirst().orElse(null);
    }
}
