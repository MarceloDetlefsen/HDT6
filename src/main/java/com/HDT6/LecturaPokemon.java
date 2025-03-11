/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Ing. Douglas Barrios
 * @author: Marcelo Detlefsen
 * Creación: 10/03/2025
 * última modificación: 10/03/2025
 * File Name: LecturaPokemon.java
 * Descripción: Clase que se encarga de leer el archivo .CSV que contiene la información de los pokemones.
 */

package com.HDT6;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class LecturaPokemon {
    public static void cargarDatos(Map pokemonMap, String filePath) {
        try (InputStream inputStream = LecturaPokemon.class.getClassLoader().getResourceAsStream(filePath);
             InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(streamReader)) {

            String line;
            br.readLine(); // Saltar encabezado
            while ((line = br.readLine()) != null) {
                // Usa split con una expresión regular para manejar comillas correctamente
                String[] data = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);

                if (data.length < 10) continue;

                String name = data[0].trim();
                int pokedexNumber = Integer.parseInt(data[1].trim()); // Convertir a entero
                String type1 = data[2].trim();
                String type2 = data[3].isEmpty() ? "None" : data[3].trim();
                String classification = data[4].trim();
                double height = Double.parseDouble(data[5].trim()); // Convertir a double
                double weight = Double.parseDouble(data[6].trim()); // Convertir a double
                String abilities = data[7].replaceAll("\"", "").trim(); // Eliminar comillas en habilidades
                int generation = Integer.parseInt(data[8].trim()); // Convertir a entero
                boolean isLegendary = data[9].trim().equalsIgnoreCase("Yes");

                Pokemon pokemon = new Pokemon(name, pokedexNumber, type1, type2, classification, height, weight, abilities, generation, isLegendary);
                pokemonMap.addPokemon(pokemon);
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

