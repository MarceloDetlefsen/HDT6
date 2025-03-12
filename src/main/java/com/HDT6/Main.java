/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Ing. Douglas Barrios
 * @author: Marcelo Detlefsen
 * Creación: 10/03/2025
 * última modificación: 10/03/2025
 * File Name: Main.java
 * Descripción: Este archivo contiene la clase Main que se encarga de manejar la interacción con el usuario.
 * Código comentado con DeepSeek
 */

package com.HDT6;

import java.util.*;

/**
 * Clase principal que maneja la interacción con el usuario y ejecuta el programa.
 * Permite al usuario seleccionar un tipo de Map, cargar datos de Pokemons desde un archivo CSV,
 * y realizar diversas operaciones como agregar Pokemons a una colección, mostrar datos, filtrar por tipo y habilidad, etc.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menú para seleccionar el tipo de Map
        System.out.println("Seleccione el tipo de Map:");
        System.out.println("1. HashMap");
        System.out.println("2. TreeMap");
        System.out.println("3. LinkedHashMap");
        System.out.print("Ingrese su opción: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        // Crear el Map seleccionado utilizando la fábrica
        Map pokemonMap = MapFactory.createMap(choice);
        System.out.println("Mapa seleccionado exitosamente.\n");

        // Cargar datos de Pokemons desde el archivo CSV
        String filePath = "pokemon_data_pokeapi.csv";
        LecturaPokemon.cargarDatos(pokemonMap, filePath);
        System.out.println("Datos cargados correctamente.\n");

        // Crear una colección para el usuario
        Coleccion userCollection = new Coleccion();

        // Menú principal del programa
        while (true) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Agregar un Pokémon a la colección del usuario");
            System.out.println("2. Mostrar los datos de un Pokémon");
            System.out.println("3. Mostrar los Pokémon en la colección ordenados por tipo");
            System.out.println("4. Mostrar todos los Pokémon existentes ordenados por tipo");
            System.out.println("5. Mostrar Pokémon con una habilidad específica");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    // Agregar un Pokémon a la colección del usuario
                    System.out.print("Ingrese el nombre del Pokémon a agregar: ");
                    String name = scanner.nextLine();
                    Pokemon foundPokemon = pokemonMap.getPokemon(name);
                    if (foundPokemon != null) {
                        userCollection.addPokemon(foundPokemon);
                    } else {
                        System.out.println("Error: El Pokémon no se encuentra en la base de datos.");
                    }
                    break;

                case 2:
                    // Mostrar los datos de un Pokémon específico
                    System.out.print("Ingrese el nombre del Pokémon: ");
                    String searchName = scanner.nextLine();
                    Pokemon searchedPokemon = pokemonMap.getPokemon(searchName);
                    if (searchedPokemon != null) {
                        System.out.println("\nDatos del Pokémon:");
                        System.out.println("Nombre: " + searchedPokemon.getName());
                        System.out.println("Número en la Pokédex: " + searchedPokemon.getPokedexNumber());
                        System.out.println("Tipo 1: " + searchedPokemon.getType1());
                        System.out.println("Tipo 2: " + searchedPokemon.getType2());
                        System.out.println("Clasificación: " + searchedPokemon.getClassification());
                        System.out.println("Altura (m): " + searchedPokemon.getHeight());
                        System.out.println("Peso (kg): " + searchedPokemon.getWeight());
                        System.out.println("Habilidades: " + searchedPokemon.getAbilities());
                        System.out.println("Generación: " + searchedPokemon.getGeneration());
                        System.out.println("¿Es legendario? " + (searchedPokemon.isLegendary() ? "Sí" : "No"));
                    } else {
                        System.out.println("Error: El Pokémon no está en la colección.");
                    }
                    break;

                case 3:
                    // Mostrar los Pokémons en la colección del usuario ordenados por tipo
                    System.out.println("Pokémon en la colección del usuario ordenados por tipo:");
                    userCollection.displayByType();
                    break;

                case 4:
                    // Mostrar todos los Pokémons existentes ordenados por tipo
                    System.out.println("Todos los Pokémon ordenados por tipo:");
                    List<Pokemon> allPokemons = new ArrayList<>(pokemonMap.getAllPokemons());
                    allPokemons.sort(Comparator.comparing(Pokemon::getType1));
                    for (Pokemon p : allPokemons) {
                        System.out.println(p.getName() + " - " + p.getType1());
                    }
                    break;

                case 5:
                    // Mostrar Pokémons con una habilidad específica
                    System.out.print("Ingrese la habilidad a buscar: ");
                    String ability = scanner.nextLine();
                    List<Pokemon> pokemonsWithAbility = pokemonMap.getPokemonsByAbility(ability);
                    if (pokemonsWithAbility.isEmpty()) {
                        System.out.println("No hay Pokémon con esa habilidad.");
                    } else {
                        for (Pokemon p : pokemonsWithAbility) {
                            System.out.println(p.getName());
                        }
                    }
                    break;

                case 6:
                    // Salir del programa
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;

                default:
                    // Opción inválida
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        }
    }
}