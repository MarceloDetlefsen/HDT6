/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Ing. Douglas Barrios
 * @author: Marcelo Detlefsen
 * Creación: 10/03/2025
 * última modificación: 10/03/2025
 * File Name: MapFactory.java
 * Descripción: Factory de las implementaciones de la interfaz Map.
 * Código comentado con DeepSeek
 */

package com.HDT6;

/**
 * Clase que actúa como una fábrica para crear instancias de las diferentes implementaciones de la interfaz Map.
 * Proporciona un método estático para seleccionar y crear la implementación deseada de Map.
 */
public class MapFactory {

    /**
     * Crea y devuelve una instancia de la implementación de Map según la elección del usuario.
     *
     * @param choice Entero que representa la elección del usuario:
     *               1 para HashMap,
     *               2 para TreeMap,
     *               3 para LinkedHashMap.
     * @return Una instancia de la implementación de Map seleccionada.
     * @throws IllegalArgumentException Si se proporciona una opción inválida.
     */
    public static Map createMap(int choice) {
        switch (choice) {
            case 1:
                return new HashMap(); // Retorna una instancia de HashMap
            case 2:
                return new TreeMap(); // Retorna una instancia de TreeMap
            case 3:
                return new LinkedHashMap(); // Retorna una instancia de LinkedHashMap
            default:
                throw new IllegalArgumentException("Opción inválida"); // Lanza una excepción si la opción no es válida
        }
    }
}