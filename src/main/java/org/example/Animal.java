package org.example;

class Animal {
    private String species;

    public void setSpecies(String species) {
        this.species = species;
    }

    public Animal(String species) {
        this.species = species;
    }

    public void eat() {
        System.out.println(species + "在吃東西");
    }

    public String getSpecies() {
        return species;
    }

}