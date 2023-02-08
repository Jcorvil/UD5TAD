package EjerciciosUD5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEjercicio {
    public static void main(String[] args) {
        //1.- Crea un conjunto vacío de cadenas. Declara usando la interfaz.
        Set<String> conjunto = new LinkedHashSet<>();

        //2.- Agrega los nombre de varius alumnos al conjunto. Usa los métodos de la interfaz.
        conjunto.add("Jorge");
        conjunto.add("Daniel");
        conjunto.add("Juanma");
        conjunto.add("Diego");

        //3.-Imprime el conjunto para ver su contenido ¿Imprime referencia o valor?
        System.out.println(conjunto);
        //Imprime los valores.

        //4.-Añade un nombre repetido, ¿permite duplicados?
        conjunto.add("Jorge");
        System.out.println(conjunto);
        //No los permite.

        //5.-Añade un null, ¿permite nulos?
        conjunto.add(null);
        System.out.println(conjunto);
        //Si, los permite.

        //6.-Recorre el conjunto imprimiendo cada uno de sus elementos en orden, del primero que fue
        //insertado al último. Compara con el orden que daría una implementación con hashset.

        Iterator<String> it = conjunto.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println(" ");

        Set<String> conjuntoHashSet = new HashSet<>();
        conjuntoHashSet.add("Jorge");
        conjuntoHashSet.add("Daniel");
        conjuntoHashSet.add("Juanma");
        conjuntoHashSet.add("Diego");
        conjuntoHashSet.add(null);
        System.out.println(conjuntoHashSet);
        //Da un orden distinto, ya que LinkedHashSet va ordenado mientras que Hashset tiene un orden aleatorio.

    }
}