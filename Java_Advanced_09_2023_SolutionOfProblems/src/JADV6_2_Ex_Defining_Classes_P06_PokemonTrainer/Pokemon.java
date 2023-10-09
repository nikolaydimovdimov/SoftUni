package JADV6_2_Ex_Defining_Classes_P06_PokemonTrainer;

public class Pokemon {
    private String name;
    private String element;
    private int health;

    public Pokemon(String name, String element, int health) {
        this.setName(name);
        this.setElement(element);
        this.setHealth(health);
    }

    public Pokemon() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public String getElement() {
        return element;
    }

    public int getHealth() {
        return health;
    }
}
