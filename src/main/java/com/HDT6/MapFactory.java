/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Ing. Douglas Barrios
 * @author: Marcelo Detlefsen
 * Creación: 10/03/2025
 * última modificación: 10/03/2025
 * File Name: MapFactory.java
 * Descripción: Factory de las implementaciones de la interfaz Map.
 */

package com.HDT6;

public class MapFactory {
    public static Map createMap(int choice) {
        switch (choice) {
            case 1: return new HashMap();
            case 2: return new TreeMap();
            case 3: return new LinkedHashMap();
            default: throw new IllegalArgumentException("Opción inválida");
        }
    }
}
