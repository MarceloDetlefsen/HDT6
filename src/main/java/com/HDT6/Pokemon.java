/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Ing. Douglas Barrios
 * @author: Marcelo Detlefsen
 * Creación: 10/03/2025
 * última modificación: 10/03/2025
 * File Name: Pokemon.java
 * Descripción: Clase que define la estructura y atributos de un Pokemon.
 * Código comentado con DeepSeek
 */

package com.HDT6;

/**
 * Clase que representa un Pokemon con sus atributos principales.
 * Proporciona métodos para acceder a los datos del Pokemon y una representación en formato de cadena.
 */
public class Pokemon {
    private String name; // Nombre del Pokemon
    private int pokedexNumber; // Número en la Pokédex
    private String type1; // Tipo primario del Pokemon
    private String type2; // Tipo secundario del Pokemon (puede ser nulo)
    private String classification; // Clasificación del Pokemon
    private double height; // Altura del Pokemon
    private double weight; // Peso del Pokemon
    private String abilities; // Habilidades del Pokemon
    private int generation; // Generación a la que pertenece el Pokemon
    private boolean isLegendary; // Indica si el Pokemon es legendario

    /**
     * Constructor para crear un objeto Pokemon con todos sus atributos.
     *
     * @param name           Nombre del Pokemon.
     * @param pokedexNumber  Número en la Pokédex.
     * @param type1          Tipo primario del Pokemon.
     * @param type2          Tipo secundario del Pokemon.
     * @param classification Clasificación del Pokemon.
     * @param height         Altura del Pokemon.
     * @param weight         Peso del Pokemon.
     * @param abilities      Habilidades del Pokemon.
     * @param generation     Generación a la que pertenece el Pokemon.
     * @param isLegendary    Indica si el Pokemon es legendario.
     */
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

    /**
     * Obtiene el nombre del Pokemon.
     *
     * @return El nombre del Pokemon.
     */
    public String getName() {
        return name;
    }

    /**
     * Obtiene el número en la Pokédex del Pokemon.
     *
     * @return El número en la Pokédex.
     */
    public int getPokedexNumber() {
        return pokedexNumber;
    }

    /**
     * Obtiene el tipo primario del Pokemon.
     *
     * @return El tipo primario del Pokemon.
     */
    public String getType1() {
        return type1;
    }

    /**
     * Obtiene el tipo secundario del Pokemon.
     *
     * @return El tipo secundario del Pokemon.
     */
    public String getType2() {
        return type2;
    }

    /**
     * Obtiene la clasificación del Pokemon.
     *
     * @return La clasificación del Pokemon.
     */
    public String getClassification() {
        return classification;
    }

    /**
     * Obtiene la altura del Pokemon.
     *
     * @return La altura del Pokemon.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Obtiene el peso del Pokemon.
     *
     * @return El peso del Pokemon.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Obtiene las habilidades del Pokemon.
     *
     * @return Las habilidades del Pokemon.
     */
    public String getAbilities() {
        return abilities;
    }

    /**
     * Obtiene la generación a la que pertenece el Pokemon.
     *
     * @return La generación del Pokemon.
     */
    public int getGeneration() {
        return generation;
    }

    /**
     * Indica si el Pokemon es legendario.
     *
     * @return true si el Pokemon es legendario, false en caso contrario.
     */
    public boolean isLegendary() {
        return isLegendary;
    }

    /**
     * Devuelve una representación en cadena del objeto Pokemon.
     *
     * @return Una cadena que representa los atributos del Pokemon.
     */
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