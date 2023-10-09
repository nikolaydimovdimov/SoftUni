package JADV6_2_Ex_Defining_Classes_P07_Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    String namePerson;
    Company companyPerson;
    Car carPerson;
    List<Parent> parentsPerson;
    List<Child> childrenPerson;
    List<Pokemon> pokemonPerson;

    public Person(String namePerson, Company companyPerson, Car carPerson,
                  List<Parent> parentsPerson, List<Child> childrenPerson,
                  List<Pokemon> pokemonPerson) {
        this.setNamePerson(namePerson);
        this.setCompanyPerson(companyPerson);
        this.setCarPerson(carPerson);
        this.setParentsPerson(parentsPerson);
        this.setChildrenPerson(childrenPerson);
        this.setPokemonPerson(pokemonPerson);
    }

    public Person() {
        this(null,new Company(),new Car(),new ArrayList<>(),
                new ArrayList<>(),new ArrayList<>());
    }
    public Person(String name){
        this(name,new Company(),new Car(),new ArrayList<>(),
                new ArrayList<>(),new ArrayList<>());
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public void setCompanyPerson(Company companyPerson) {
        this.companyPerson = companyPerson;
    }

    public void setCarPerson(Car carPerson) {
        this.carPerson = carPerson;
    }

    public void setParentsPerson(List<Parent> parentsPerson) {
        this.parentsPerson = parentsPerson;
    }

    public void setChildrenPerson(List<Child> childrenPerson) {
        this.childrenPerson = childrenPerson;
    }

    public void setPokemonPerson(List<Pokemon> pokemonPerson) {
        this.pokemonPerson = pokemonPerson;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public Company getCompanyPerson() {
        return companyPerson;
    }

    public Car getCarPerson() {
        return carPerson;
    }

    public List<Parent> getParentsPerson() {
        return parentsPerson;
    }

    public List<Child> getChildrenPerson() {
        return childrenPerson;
    }

    public List<Pokemon> getPokemonPerson() {
        return pokemonPerson;
    }

    @Override
    public String toString() {
        String parentsString = "";
        if (!this.getParentsPerson().isEmpty()) {
            for (Parent parent : this.getParentsPerson()) {
                parentsString += String.format("%s", parent.toString());
            }
        }

        String childrenString = "";
        if (!this.getChildrenPerson().isEmpty()) {
            for (Child child : this.getChildrenPerson()) {
                childrenString += String.format("%s", child.toString());
            }
        }

        String pokemonString = "";
        if (!this.getPokemonPerson().isEmpty()) {
            for (Pokemon pokemon : this.getPokemonPerson()) {
                pokemonString += String.format("%s", pokemon.toString());
            }
        }

        return String.format("%s%nCompany:%n%sCar:%n%sPokemon:%n%sParents:%n%sChildren:%n%s",
                this.getNamePerson(), this.getCompanyPerson().toString(), this.getCarPerson().toString(),
                pokemonString, parentsString, childrenString);
    }
}
