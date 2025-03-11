# Hoja de Trabajo #6

# Compilación y Ejecución
1. Clonar el repositorio:
    ```bash 
    git clone https://github.com/tu-usuario/HDT6.git

2. Navegar a la carpeta del proyecto:
    ```bash 
    cd HDT6

3. Compilar el proyecto:
    ```bash 
    javac -d out src/main/java/com/HDT6/*.java

4. Ejecutar el programa:
    ```bash 
    cd out
    java com.HDT6.Main

# Complejidad de Tiempo de la Operación #4
La operación #4 muestra el nombre y tipo1 de todos los Pokémon, ordenados por tipo1.

**Analísis de su complejidad paso a paso:**
    • **Obtener todos los Pokémon del Map**
        En un LinkedHashMap, obtener todos los valores tiene una complejidad de *O(n)*, donde n es el número de Pokémon en el mapa. Esto se debe a que se deben recorrer todos los elementos del mapa, y su tamaño depende exclusivamente de la cantidad de ellos.
    • **Ordenar los Pokémon por tipo1**
        Ordenar una lista de n elementos tiene una complejidad de *O(n log n)* si se usa un algoritmo eficiente como MergeSort o QuickSort. En Java, el método sort de Collections usa TimSort tiene una complejidad de *O(n log n)* en el de los peor casos.
    • **Mostrar el nombre y tipo1 de cada Pokémon**
        Recorrer la lista ordenada y mostrar los datos tiene una complejidad de *O(n)*.

**Complejidad Total:** La complejidad total de la operación #4 es la suma de las complejidades de cada paso:
    Obtener todos los Pokémon: *O(n)*
    Ordenar los Pokémon: *O(n log n)*
    Mostrar los Pokémon: *O(n)*
    *O(n)* + *O(n log n)* + *O(n)* = **O(n log n)**
