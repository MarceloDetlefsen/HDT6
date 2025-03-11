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
    private String type1;
    private String type2;
    private String abilities;

    public Pokemon(String name, String type1, String type2, String abilities) {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.abilities = abilities;
    }

    public String getName() {
        return name;
    }

    public String getType1() {
        return type1;
    }

    public String getType2() {
        return type2;
    }

    public String getAbilities() {
        return abilities;
    }

    @Override
    public String toString() {
        return "Pokemon{name='" + name + "', type1='" + type1 + "', type2='" + type2 + "', abilities='" + abilities + "'}";
    }
}
