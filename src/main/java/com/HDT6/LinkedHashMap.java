/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Ing. Douglas Barrios
 * @author: Marcelo Detlefsen
 * Creación: 10/03/2025
 * última modificación: 10/03/2025
 * File Name: LinkedHashMap.java
 * Descripción: Implementación de LinkedHashMap.
 */

package com.HDT6;

import java.util.*;

public class LinkedHashMap implements Map {
    private java.util.LinkedHashMap<String, Pokemon> pokemonMap = new java.util.LinkedHashMap<>();

    @Override
    public void addPokemon(Pokemon pokemon) {
        pokemonMap.put(pokemon.getName(), pokemon);
    }

    @Override
    public Pokemon getPokemon(String name) {
        return pokemonMap.get(name);
    }

    @Override
    public void displayAll() {
        pokemonMap.values().forEach(System.out::println);
    }

    @Override
    public List<Pokemon> getPokemonsByType(String type) {
        List<Pokemon> result = new ArrayList<>();
        for (Pokemon p : pokemonMap.values()) {
            if (p.getType1().equalsIgnoreCase(type) || p.getType2().equalsIgnoreCase(type)) {
                result.add(p);
            }
        }
        return result;
    }

    @Override
    public List<Pokemon> getPokemonsByAbility(String ability) {
        List<Pokemon> result = new ArrayList<>();
        for (Pokemon p : pokemonMap.values()) {
            if (p.getAbilities().contains(ability)) {
                result.add(p);
            }
        }
        return result;
    }

    @Override
    public List<Pokemon> getAllPokemons() {
        return new ArrayList<>(pokemonMap.values());
    }
}
