/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Ing. Douglas Barrios
 * @author: Marcelo Detlefsen
 * Creación: 10/03/2025
 * última modificación: 10/03/2025
 * File Name: Pokemon.java
 * Descripción: Clase que da el formato a como filtrar los datos de los pokemones, para que se puedan almacenar.
 */

package com.HDT6;

public class Pokemon {
    private String name;
    private int pokedexNumber;
    private String type1;
    private String type2;
    private String classification;
    private double height;
    private double weight;
    private String abilities;
    private int generation;
    private boolean isLegendary;

    public Pokemon(String name, int pokedexNumber, String type1, String type2, String classification, double height, double weight, String abilities, int generation, boolean isLegendary) {
        this.name = name;
        this.pokedexNumber = pokedexNumber;
        this.type1 = type1;
        this.type2 = type2;
        this.classification = classification;
        this.height = height;
        this.weight = weight;
        this.abilities = abilities;
        this.generation = generation;
        this.isLegendary = isLegendary;
    }

    public String getName() {
        return name;
    }

    public int getPokedexNumber() {
        return pokedexNumber;
    }

    public String getType1() {
        return type1;
    }

    public String getType2() {
        return type2;
    }

    public String getClassification() {
        return classification;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getAbilities() {
        return abilities;
    }

    public int getGeneration() {
        return generation;
    }

    public boolean isLegendary() {
        return isLegendary;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", pokedexNumber=" + pokedexNumber +
                ", type1='" + type1 + '\'' +
                ", type2='" + type2 + '\'' +
                ", classification='" + classification + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", abilities='" + abilities + '\'' +
                ", generation=" + generation +
                ", isLegendary=" + isLegendary +
                '}';
    }
}