package robotService.entities.robot;

public abstract class BaseRobot implements Robot {
    private String name;
    private String kind;
    private int kilograms;
    private double price;

    public BaseRobot(String name, String kind, int kilograms, double price) {
        this.setName(name);
        this.setKind(kind);
        this.setKilograms(kilograms);
        this.setPrice(price);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException("Robot name cannot be null or empty.");
        }
        this.name = name;
    }

    protected void setKilograms(int kilograms){
        this.kilograms=kilograms;
    }

    private void setKind(String kind){
        if (kind == null || kind.trim().isEmpty()) {
            throw new NullPointerException("Robot kind cannot be null or empty.");
        }
        this.kind = kind;
    }

    private void setPrice(double price){
        if(price<=0){
            throw new IllegalArgumentException("Robot price cannot be below or equal to 0.");
        }
        this.price=price;
    }
    @Override
    public int getKilograms() {
        return this.kilograms;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void eating() {

    }
}
