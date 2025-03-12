/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Ing. Douglas Barrios
 * @author: Marcelo Detlefsen
 * Creación: 10/03/2025
 * última modificación: 10/03/2025
 * File Name: Coleccion.java
 * Descripción: Clase que se encarga de almacenar los datos del usuario sobre sus Pokemons, utilizando la colección ArrayList del JCF.
 * Código comentado con DeepSeek
 */

package com.HDT6;

import java.util.*;

/**
 * Clase que gestiona una colección de Pokemons utilizando un ArrayList.
 * Proporciona métodos para agregar, obtener, mostrar y filtrar Pokemons por tipo y habilidad.
 */
public class Coleccion {
    private List<Pokemon> pokemonList = new ArrayList<>(); // Lista para almacenar los Pokemons

    /**
     * Agrega un Pokemon a la colección si no está ya presente.
     *
     * @param pokemon El Pokemon que se desea agregar.
     */
    public void addPokemon(Pokemon pokemon) {
        for (Pokemon p : pokemonList) {
            if (p.getName().equalsIgnoreCase(pokemon.getName())) {
                System.out.println("El Pokémon ya está en la colección.");
                return;
            }
        }
        pokemonList.add(pokemon);
        System.out.println("Pokémon agregado con éxito.");
    }

    /**
     * Obtiene un Pokemon de la colección por su nombre.
     *
     * @param name El nombre del Pokemon que se desea obtener.
     * @return El Pokemon correspondiente al nombre proporcionado, o null si no se encuentra.
     */
    public Pokemon getPokemon(String name) {
        for (Pokemon p : pokemonList) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    /**
     * Muestra todos los Pokemons en la colección.
     */
    public void displayAll() {
        if (pokemonList.isEmpty()) {
            System.out.println("La colección está vacía.");
        } else {
            for (Pokemon p : pokemonList) {
                System.out.println(p);
            }
        }
    }

    /**
     * Muestra los Pokemons en la colección ordenados por su tipo primario.
     */
    public void displayByType() {
        List<Pokemon> sortedList = new ArrayList<>(pokemonList);
        sortedList.sort(Comparator.comparing(Pokemon::getType1)); // Ordenar por tipo primario

        for (Pokemon p : sortedList) {
            System.out.println(p.getName() + " - " + p.getType1());
        }
    }

    /**
     * Muestra todos los Pokemons de una lista proporcionada, ordenados por su tipo primario.
     *
     * @param allPokemons La lista de Pokemons que se desea mostrar.
     */
    public static void displayAllSorted(List<Pokemon> allPokemons) {
        allPokemons.sort(Comparator.comparing(Pokemon::getType1)); // Ordenar por tipo primario
        for (Pokemon p : allPokemons) {
            System.out.println(p.getName() + " - " + p.getType1());
        }
    }

    /**
     * Muestra los Pokemons de una lista proporcionada que tienen una habilidad específica.
     *
     * @param allPokemons La lista de Pokemons que se desea filtrar.
     * @param ability     La habilidad por la cual se desea filtrar.
     */
    public static void displayByAbility(List<Pokemon> allPokemons, String ability) {
        for (Pokemon p : allPokemons) {
            if (p.getAbilities().contains(ability)) {
                System.out.println(p.getName());
            }
        }
    }
}