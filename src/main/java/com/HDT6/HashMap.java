/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Ing. Douglas Barrios
 * @author: Marcelo Detlefsen
 * Creación: 10/03/2025
 * última modificación: 11/03/2025
 * File Name: HashMap.java
 * Descripción: Implementación de la interfaz Map utilizando un HashMap para almacenar objetos de tipo Pokemon.
 * Código comentado con DeepSeek
 */

package com.HDT6;

import java.util.*;

/**
 * Clase que implementa la interfaz Map utilizando un HashMap para almacenar y gestionar objetos de tipo Pokemon.
 * Proporciona métodos para agregar, obtener, mostrar y filtrar Pokemons por tipo y habilidad.
 */
public class HashMap implements Map {
    private java.util.HashMap<String, Pokemon> pokemonMap = new java.util.HashMap<>();

    /**
     * Agrega un Pokemon al HashMap.
     *
     * @param pokemon El objeto Pokemon que se desea agregar.
     */
    @Override
    public void addPokemon(Pokemon pokemon) {
        pokemonMap.put(pokemon.getName(), pokemon);
    }

    /**
     * Obtiene un Pokemon del HashMap por su nombre.
     *
     * @param name El nombre del Pokemon que se desea obtener.
     * @return El objeto Pokemon correspondiente al nombre proporcionado, o null si no se encuentra.
     */
    @Override
    public Pokemon getPokemon(String name) {
        return pokemonMap.get(name);
    }

    /**
     * Muestra todos los Pokemons almacenados en el HashMap.
     */
    @Override
    public void displayAll() {
        pokemonMap.values().forEach(System.out::println);
    }

    /**
     * Obtiene una lista de Pokemons filtrados por tipo.
     *
     * @param type El tipo de Pokemon por el cual se desea filtrar.
     * @return Una lista de Pokemons que coinciden con el tipo especificado.
     */
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

    /**
     * Obtiene una lista de Pokemons filtrados por habilidad.
     *
     * @param ability La habilidad por la cual se desea filtrar.
     * @return Una lista de Pokemons que coinciden con la habilidad especificada.
     */
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

    /**
     * Obtiene una lista con todos los Pokemons almacenados en el HashMap.
     *
     * @return Una lista con todos los Pokemons.
     */
    @Override
    public List<Pokemon> getAllPokemons() {
        return new ArrayList<>(pokemonMap.values());
    }
}