/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Ing. Douglas Barrios
 * @author: Marcelo Detlefsen
 * Creación: 10/03/2025
 * última modificación: 10/03/2025
 * File Name: Map.java
 * Descripción: Interfaz de Map.
 */

package com.HDT6;

import java.util.List;

public interface Map {
    void addPokemon(Pokemon pokemon);
    Pokemon getPokemon(String name);
    void displayAll();
    List<Pokemon> getPokemonsByType(String type);
    List<Pokemon> getPokemonsByAbility(String ability);
    List<Pokemon> getAllPokemons();
}

