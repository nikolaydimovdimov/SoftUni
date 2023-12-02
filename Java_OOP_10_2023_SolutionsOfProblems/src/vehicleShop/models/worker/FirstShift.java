package vehicleShop.models.worker;

public class FirstShift extends BaseWorker{
    private final static int INITIAL_STRENGTH=100;

    public FirstShift(String name) {
        super(name,INITIAL_STRENGTH);
    }
}
