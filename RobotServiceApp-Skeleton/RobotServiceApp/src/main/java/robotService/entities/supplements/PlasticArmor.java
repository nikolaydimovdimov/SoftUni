package robotService.entities.supplements;

public class PlasticArmor extends BaseSupplement {
    private final static int PLASTIC_HARDNESS=1;
    private final static double PLASTIC_PRICE=10;


    public PlasticArmor() {
        super(PLASTIC_HARDNESS, PLASTIC_PRICE);
    }
}
