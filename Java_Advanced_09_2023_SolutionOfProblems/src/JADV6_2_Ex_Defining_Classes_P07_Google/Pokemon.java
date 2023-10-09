package JADV6_2_Ex_Defining_Classes_P07_Google;

public class Pokemon {
    //    •	"{Name} pokemon {pokemonName} {pokemonType}"
    private String pokemonName;
    private String pokemonType;

    public Pokemon(String pokemonName, String pokemonType) {
        this.setPokemonName(pokemonName);
        this.setPokemonType(pokemonType);
    }

    public Pokemon() {
    }


    public void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    public void setPokemonType(String pokemonType) {
        this.pokemonType = pokemonType;
    }

    public String getPokemonName() {
        return pokemonName;
    }

    public String getPokemonType() {
        return pokemonType;
    }

    @Override
    public String toString() {
        if(this.getPokemonName()==null) return "";
        return String.format("%s %s%n", this.pokemonName, pokemonType);
    }
}
