package robotService.entities.robot;

public class MaleRobot extends BaseRobot{
    private final static int INITIAL_KILOGRAMS=9;
    private final static int INCREASES_KILOGRAMS=3;


    public MaleRobot(String name, String kind,  double price) {
        super(name, kind, INITIAL_KILOGRAMS, price);
    }

    @Override
    public void eating() {
        this.setKilograms(this.getKilograms()+INCREASES_KILOGRAMS);
    }
}
