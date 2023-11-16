package JOOP_05_1_Polymorphism_Lab.P03_Animal;

public class Animal {
    private String name;
    private String favoriteFood;

    protected Animal(String name, String favoriteFood) {
        this.name=name;
        this.favoriteFood=favoriteFood;
    }

    protected String explainSelf() {
        return String.format("I am %s and my favourite food is %s",
               this.getName() , this.getFavoriteFood());
    }



    public String getFavoriteFood() {
        return favoriteFood;
    }

    public String getName(){
        return name;
    }


}
