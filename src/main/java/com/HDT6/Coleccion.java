/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Ing. Douglas Barrios
 * @author: Marcelo Detlefsen
 * Creación: 10/03/2025
 * última modificación: 10/03/2025
 * File Name: Coleccion.java
 * Descripción: Clase que se encarga almacenar los datos del usuario sobres sus pokemones, lo cual se realiza
 *              con la colección ArrayList del JCF.
 */

package com.HDT6;

import java.util.*;

public class Coleccion {
    private List<Pokemon> pokemonList = new ArrayList<>();

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

    public Pokemon getPokemon(String name) {
        for (Pokemon p : pokemonList) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public void displayAll() {
        if (pokemonList.isEmpty()) {
            System.out.println("La colección está vacía.");
        } else {
            for (Pokemon p : pokemonList) {
                System.out.println(p);
            }
        }
    }

    public void displayByType() {
        List<Pokemon> sortedList = new ArrayList<>(pokemonList);
        sortedList.sort(Comparator.comparing(Pokemon::getType1));

        for (Pokemon p : sortedList) {
            System.out.println(p.getName() + " - " + p.getType1());
        }
    }

    public static void displayAllSorted(List<Pokemon> allPokemons) {
        allPokemons.sort(Comparator.comparing(Pokemon::getType1));
        for (Pokemon p : allPokemons) {
            System.out.println(p.getName() + " - " + p.getType1());
        }
    }

    public static void displayByAbility(List<Pokemon> allPokemons, String ability) {
        for (Pokemon p : allPokemons) {
            if (p.getAbilities().contains(ability)) {
                System.out.println(p.getName());
            }
        }
    }
}