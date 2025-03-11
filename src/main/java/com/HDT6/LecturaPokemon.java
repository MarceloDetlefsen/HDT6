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
                String[] data = line.split(",");
                if (data.length < 8) continue;

                String name = data[0];
                String type1 = data[2];
                String type2 = data[3].isEmpty() ? "None" : data[3];
                String abilities = data[7];

                Pokemon pokemon = new Pokemon(name, type1, type2, abilities);
                pokemonMap.addPokemon(pokemon);
            }

            System.out.println("Archivo leído correctamente.\n");
        } catch (IOException | NullPointerException e) {
            System.out.println("Error al leer el archivo.");
        }
    }
}
