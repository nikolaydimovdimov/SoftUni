package robotService.entities.robot;

public class FemaleRobot extends BaseRobot{
    private final static int INITIAL_KILOGRAMS=7;
    private final static int INCREASES_KILOGRAMS=3;


    public FemaleRobot(String name, String kind,  double price) {
        super(name, kind, INITIAL_KILOGRAMS, price);
    }

    @Override
    public void eating() {
        this.setKilograms(this.getKilograms()+INCREASES_KILOGRAMS);
    }
}
