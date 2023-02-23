package EjerciciosUD5;

import java.util.*;

public class EjercicioJavaCollections {
    public static void main(String[] args) {
        //1.- Crear un par de colecciones del tipo a elegir

        List<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(4);
        lista1.add(7);
        lista1.add(10);
        lista1.add(15);

        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
        set1.add(1);
        set1.add(4);
        set1.add(7);
        set1.add(10);
        set1.add(15);

        System.out.println("Ejercicio1: ");
        System.out.println(lista1);
        System.out.println(set1);

        //2.- Desordenar las colecciones
        System.out.println("Ejercicio 2:");
        desordenarLista(lista1);
        desordenarSet(set1);

        //3.- Ordenar la lista en orden ascendente según el orden natural de los elementos
        System.out.println("Ejercicio 3:");
        ordenarListaAsc(lista1);
        ordenarSetAsc(set1);

        //4.- Da la vuelta a la lista, poniéndola en orden inverso al que tiene
        System.out.println("Ejercicio 4:");
        ordernarListaDesc(lista1);
        ordernarSetDesc(set1);

        //5.- Realizar la búsqueda de un elemento
        System.out.println("Ejercicio 5:");
        buscarElementoList(lista1, 4);
        buscarElementoSet(set1, 10);

        //6.- Crear un array a partir de una lista
        System.out.println("Ejercicio 6:");
        listaAArray(lista1);

    }

    //Desordenar
    static void desordenarLista(List<Integer> lista){
        Collections.shuffle(lista);
        System.out.println(lista);
    }

    static void desordenarSet(Set<Integer> conjunto){
        List<Integer> l = new ArrayList<>(conjunto);
        Collections.shuffle(l);
        conjunto.addAll(l);
        System.out.println(conjunto);
    }


    //OrdenarAsc
    static void ordenarListaAsc(List<Integer> lista){
        Collections.sort(lista);
        System.out.println(lista);
    }

    static void ordenarSetAsc(Set<Integer> conjunto){
        List<Integer> l = new ArrayList<>(conjunto);
        Collections.sort(l);
        conjunto.addAll(l);
        System.out.println(conjunto);
    }


    //OrdenarDesc
    static void ordernarListaDesc(List<Integer> lista){
        Collections.sort(lista);
        Collections.reverse(lista);
        System.out.println(lista);
    }

    static void ordernarSetDesc(Set<Integer> conjunto){
        List<Integer> l = new ArrayList<>(conjunto);
        Collections.sort(l);
        Collections.reverse(l);
        conjunto.addAll(l);
        System.out.println(conjunto);
    }


    //Busqueda
    static void buscarElementoList(List<Integer> lista, Integer elemento){
        System.out.println(Collections.binarySearch(lista, elemento));
    }

    static void buscarElementoSet(Set<Integer> conjunto, Integer elemento){
        List<Integer> l = new ArrayList<>(conjunto);
        System.out.println(Collections.binarySearch(l, elemento));
    }



    static void listaAArray(List<Integer> lista){
        System.out.println(Arrays.toString(lista.toArray()));

    }

}