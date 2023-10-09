package JADV6_2_Ex_Defining_Classes_P06_PokemonTrainer;

import java.util.List;

public class Trainer {
    private String name;
    private int badges;
    private List<Pokemon> pokemonsList;

    public Trainer(String name, int badges, List<Pokemon> pokemonsList) {
        this.setName(name);
        this.setBadges(badges);
        this.setPokemonsList(pokemonsList);
    }

    public Trainer() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBadges(int badges) {
        this.badges = badges;
    }

    public void setPokemonsList(List<Pokemon> pokemonsList) {
        this.pokemonsList = pokemonsList;
    }

    public String getName() {
        return name;
    }

    public int getBadges() {
        return badges;
    }

    public List<Pokemon> getPokemonsList() {
        return pokemonsList;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d",this.getName(),this.getBadges(),this.getPokemonsList().size());
    }
}
