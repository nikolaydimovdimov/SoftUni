public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        this.weight = weight;
    }

    public double calculateCalories (){
        return 2*this.weight*ToppingsModifiers.valueOf(this.toppingType).getValue();
    }
}
