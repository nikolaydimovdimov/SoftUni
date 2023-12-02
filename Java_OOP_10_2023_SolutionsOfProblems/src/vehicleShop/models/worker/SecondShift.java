package vehicleShop.models.worker;

public class SecondShift extends BaseWorker{
    private final static int INITIAL_STRENGTH=70;

    public SecondShift(String name) {
        super(name, INITIAL_STRENGTH);
    }

    @Override
    public void working() {
        super.setStrength(super.getStrength()-5);
        super.working();
    }
}
