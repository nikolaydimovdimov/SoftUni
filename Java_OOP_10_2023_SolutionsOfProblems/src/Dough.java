public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;


    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }


    private void setFlourType(String flourType) {
        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        this.bakingTechnique = bakingTechnique;
    }

    private void setWeight(double weight) {
        this.weight = weight;
    }

    public double calculateCalories() {
        return 2 * this.weight * DoughModifiers.valueOf(this.flourType).getValue()
                * DoughModifiers.valueOf(this.bakingTechnique).getValue();
    }
}
