/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Ing. Douglas Barrios
 * @author: Marcelo Detlefsen
 * Creación: 11/03/2025
 * última modificación: 11/03/2025
 * File Name: Testeo.java
 * Descripción: Este archivo contiene la clase Testeo que se encarga de realizar pruebas unitarias a las clases del programa.
 * Código comentado con DeepSeek
 */

package com.HDT6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

/**
 * Clase que contiene pruebas unitarias para verificar el correcto funcionamiento de las clases del programa.
 * Se enfoca en probar la funcionalidad de agregar Pokémons a la colección y filtrar Pokémons por tipo.
 */
public class Testeo {

    /**
     * Prueba unitaria para verificar que un Pokémon se agrega correctamente a la colección del usuario.
     */
    @Test
    public void testAgregarPokemonAColeccion() {
        // Crear un mapa y una colección
        Map pokemonMap = new LinkedHashMap();
        Coleccion userCollection = new Coleccion();

        // Crear un Pokémon de prueba
        Pokemon pikachu = new Pokemon("Pikachu", 25, "Electric", "None", "Mouse Pokémon", 0.4, 6.0, "Static, Lightning-rod", 1, false);

        // Agregar el Pokémon al mapa
        pokemonMap.addPokemon(pikachu);

        // Agregar el Pokémon a la colección del usuario
        userCollection.addPokemon(pikachu);

        // Verificar que el Pokémon está en la colección del usuario
        Pokemon pokemonEnColeccion = userCollection.getPokemon("Pikachu");
        assertNotNull(pokemonEnColeccion, "El Pokémon debería estar en la colección del usuario.");
        assertEquals("Pikachu", pokemonEnColeccion.getName(), "El nombre del Pokémon debería ser Pikachu.");
    }

    /**
     * Prueba unitaria para verificar que se pueden obtener correctamente los Pokémons de un tipo específico.
     */
    @Test
    public void testObtenerPokemonsPorTipo() {
        // Crear un mapa
        Map pokemonMap = new LinkedHashMap();

        // Crear algunos Pokémon de prueba
        Pokemon pikachu = new Pokemon("Pikachu", 25, "Electric", "None", "Mouse Pokémon", 0.4, 6.0, "Static, Lightning-rod", 1, false);
        Pokemon bulbasaur = new Pokemon("Bulbasaur", 1, "Grass", "Poison", "Seed Pokémon", 0.7, 6.9, "Overgrow, Chlorophyll", 1, false);
        Pokemon charmander = new Pokemon("Charmander", 4, "Fire", "", "Lizard Pokémon", 0.6, 8.5, "Blaze, Solar-power", 1, false);

        // Agregar los Pokémon al mapa
        pokemonMap.addPokemon(pikachu);
        pokemonMap.addPokemon(bulbasaur);
        pokemonMap.addPokemon(charmander);

        // Obtener los Pokémon de tipo "Grass"
        List<Pokemon> pokemonsGrass = pokemonMap.getPokemonsByType("Grass");

        // Verificar que solo Bulbasaur es de tipo "Grass"
        assertEquals(1, pokemonsGrass.size(), "Debería haber solo un Pokémon de tipo Grass.");
        assertEquals("Bulbasaur", pokemonsGrass.get(0).getName(), "El Pokémon de tipo Grass debería ser Bulbasaur.");
    }
}