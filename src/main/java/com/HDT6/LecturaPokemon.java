/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Ing. Douglas Barrios
 * @author: Marcelo Detlefsen
 * Creación: 10/03/2025
 * última modificación: 10/03/2025
 * File Name: LecturaPokemon.java
 * Descripción: Clase que se encarga de leer el archivo .CSV que contiene la información de los pokemones.
 * Código comentado con DeepSeek
 */

package com.HDT6;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Clase que proporciona métodos para leer y cargar datos de un archivo CSV que contiene información de Pokemons.
 * Los datos leídos se almacenan en una estructura que implementa la interfaz Map.
 */
public class LecturaPokemon {

    /**
     * Carga los datos de un archivo CSV en la estructura Map proporcionada.
     *
     * @param pokemonMap La estructura Map donde se almacenarán los Pokemons.
     * @param filePath   La ruta del archivo CSV dentro del proyecto.
     */
    public static void cargarDatos(Map pokemonMap, String filePath) {
        try (InputStream inputStream = LecturaPokemon.class.getClassLoader().getResourceAsStream(filePath);
             InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(streamReader)) {

            String line;
            br.readLine(); // Saltar la primera línea (encabezado del CSV)
            while ((line = br.readLine()) != null) {
                // Usa split con una expresión regular para manejar comillas correctamente
                String[] data = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);

                // Si la línea no tiene suficientes datos, se omite
                if (data.length < 10) continue;

                // Extraer y procesar los datos de cada línea
                String name = data[0].trim();
                int pokedexNumber = Integer.parseInt(data[1].trim()); // Convertir a entero
                String type1 = data[2].trim();
                String type2 = data[3].isEmpty() ? "None" : data[3].trim(); // Si no hay tipo secundario, se asigna "None"
                String classification = data[4].trim();
                double height = Double.parseDouble(data[5].trim()); // Convertir a double
                double weight = Double.parseDouble(data[6].trim()); // Convertir a double
                String abilities = data[7].replaceAll("\"", "").trim(); // Eliminar comillas en habilidades
                int generation = Integer.parseInt(data[8].trim()); // Convertir a entero
                boolean isLegendary = data[9].trim().equalsIgnoreCase("Yes"); // Convertir a booleano

                // Crear un objeto Pokemon con los datos extraídos
                Pokemon pokemon = new Pokemon(name, pokedexNumber, type1, type2, classification, height, weight, abilities, generation, isLegendary);
                pokemonMap.addPokemon(pokemon); // Agregar el Pokemon al Map
            }

            System.out.println("Archivo leído correctamente.\n");
        } catch (IOException | NullPointerException e) {
            System.out.println("Error al leer el archivo.");
        } catch (NumberFormatException e) {
            System.out.println("Error de formato en el archivo CSV. Verifique que los datos sean correctos.");
            e.printStackTrace();
        }
    }
}