package Practica5;

import java.util.LinkedList;
import java.util.List;

public class TADCola {
    public static void main(String[] args) {
        //LinkedList añade los elementos por orden de inserción. Es decir, el primer elemento que se introduce es
        //el primer elemento que se imprime.
        List<Integer> cola = new LinkedList<>();
        cola.add(1);
        cola.add(3);
        cola.add(2);
        cola.add(4);
        cola.add(8);
        cola.add(7);
        cola.add(5);
        cola.add(6);
        cola.add(10);
        cola.add(9);
        System.out.println("Primera cola:");
        System.out.println(cola);
        System.out.println("/-/-/-/-/-/-/-/-/-/");

        //Método encolar. Introduce un elemento en la cola.
        encolar(cola, 25);
        System.out.println("Cola tras introducir un elemento nuevo:");
        System.out.println(cola);
        System.out.println("/-/-/-/-/-/-/-/-/-/");
        //Método desencolar. Elimina un elemento de la cola.
        desencolar(cola, 3);
        System.out.println("Cola tras eliminar un elemento:");
        System.out.println(cola);
        System.out.println("/-/-/-/-/-/-/-/-/-/");
        //Método frente. Devuelve el primer elemento de la cola.
        System.out.println("Primer elemento de la cola:");
        frente(cola);
        System.out.println("/-/-/-/-/-/-/-/-/-/");
        //Método resto. Devuelve todos los elementos de la lista menos el primero.
        System.out.println("Elementos de la lista sin contar el primero:");
        resto(cola);
        System.out.println("/-/-/-/-/-/-/-/-/-/");
        //Método limpiar. Elimina todos los elementos de la lista.
        System.out.println("Lista limpia:");
        limpiar(cola);
        System.out.println(cola);
        System.out.println("/-/-/-/-/-/-/-/-/-/");
        //Método esVacía. Dice si la lista está vacía o no.
        System.out.println("¿Está la lista vacía?");
        esVacia(cola);
        System.out.println("/-/-/-/-/-/-/-/-/-/");
        //Método longitud. Imprime la longitud de la lista.
        System.out.println("Longitud de la lista:");
        longitud(cola);


    }

    public static void encolar (List<Integer> cola, Integer elemento){
        cola.add(elemento);
    }

    public static void desencolar(List<Integer> cola, Integer elemento){
        cola.remove(elemento);
    }

    public static void frente(List<Integer> cola){
        System.out.println(cola.get(0));
    }

    public static void resto(List<Integer> cola){
        List<Integer> copia = new LinkedList<>(cola);
        copia.remove(0);
        System.out.println(copia);
    }

    public static void limpiar(List<Integer> cola){
        cola.removeAll(cola);
    }

    public static void esVacia(List<Integer> cola){
        if (cola.isEmpty()){
            System.out.println("Si, la lista está vacía.");
        }else System.out.println("No, la lista contiene elementos.");
    }

    public static void longitud(List<Integer> cola){
        System.out.println(cola.size());
    }

}