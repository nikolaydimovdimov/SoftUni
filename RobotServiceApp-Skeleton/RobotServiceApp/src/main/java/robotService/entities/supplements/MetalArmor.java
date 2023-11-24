package robotService.entities.supplements;

public class MetalArmor extends BaseSupplement{
    private final static int METAL_HARDNESS=5;
    private final static double METAL_PRICE=15;

    public MetalArmor() {
        super(METAL_HARDNESS,METAL_PRICE);
    }
}
