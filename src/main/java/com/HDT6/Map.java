/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Ing. Douglas Barrios
 * @author: Marcelo Detlefsen
 * Creación: 10/03/2025
 * última modificación: 11/03/2025
 * File Name: Map.java
 * Descripción: Interfaz de Map.
 * Código comentado con DeepSeek
 */

package com.HDT6;

import java.util.List;

/**
 * Interfaz que define las operaciones básicas para un Map que maneja objetos de tipo Pokemon.
 * Proporciona métodos para agregar, obtener y mostrar Pokemons, así como para filtrarlos por tipo y habilidad.
 */
public interface Map {

    /**
     * Agrega un Pokemon al Map.
     *
     * @param pokemon El objeto Pokemon que se desea agregar.
     */
    void addPokemon(Pokemon pokemon);

    /**
     * Obtiene un Pokemon del Map por su nombre.
     *
     * @param name El nombre del Pokemon que se desea obtener.
     * @return El objeto Pokemon correspondiente al nombre proporcionado.
     */
    Pokemon getPokemon(String name);

    /**
     * Muestra todos los Pokemons almacenados en el Map.
     */
    void displayAll();

    /**
     * Obtiene una lista de Pokemons filtrados por tipo.
     *
     * @param type El tipo de Pokemon por el cual se desea filtrar.
     * @return Una lista de Pokemons que coinciden con el tipo especificado.
     */
    List<Pokemon> getPokemonsByType(String type);

    /**
     * Obtiene una lista de Pokemons filtrados por habilidad.
     *
     * @param ability La habilidad por la cual se desea filtrar.
     * @return Una lista de Pokemons que coinciden con la habilidad especificada.
     */
    List<Pokemon> getPokemonsByAbility(String ability);

    /**
     * Obtiene una lista con todos los Pokemons almacenados en el Map.
     *
     * @return Una lista con todos los Pokemons.
     */
    List<Pokemon> getAllPokemons();
}