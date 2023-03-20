package Practica5.TADCola;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //LinkedList añade los elementos por orden de inserción. Es decir, el primer elemento que se introduce es
        //el primer elemento que se imprime.
        Cola cola = new Cola();
        cola.encolar(1);
        cola.encolar(2);
        cola.encolar(5);
        cola.encolar(10);
        cola.encolar(9);
        cola.encolar(25);
        cola.encolar(18);

        System.out.println("Primera cola:");
        System.out.println(cola);
        System.out.println("/-/-/-/-/-/-/-/-/-/");

        //Método encolar. Introduce un elemento en la cola.
        cola.encolar(21);
        System.out.println("Cola tras introducir un elemento nuevo:");
        System.out.println(cola);
        System.out.println("/-/-/-/-/-/-/-/-/-/");
        //Método desencolar. Elimina un elemento de la cola.
        cola.desencolar();
        System.out.println("Cola tras eliminar un elemento:");
        System.out.println(cola);
        System.out.println("/-/-/-/-/-/-/-/-/-/");
        //Método frente. Devuelve el primer elemento de la cola.
        System.out.println("Primer elemento de la cola:");
        System.out.println(cola.frente());
        System.out.println("/-/-/-/-/-/-/-/-/-/");
        //Método resto. Devuelve todos los elementos de la lista menos el primero.
        System.out.println("Elementos de la lista sin contar el primero:");
        System.out.println(cola.resto());
        System.out.println("/-/-/-/-/-/-/-/-/-/");
        //Método limpiar. Elimina todos los elementos de la lista.
        System.out.println("Lista limpia:");
        cola.limpiar();
        System.out.println(cola);
        System.out.println("/-/-/-/-/-/-/-/-/-/");
        //Método esVacía. Dice si la lista está vacía o no.
        System.out.println("¿Está la lista vacía?");
        System.out.println(cola.esVacia());;
        System.out.println("/-/-/-/-/-/-/-/-/-/");
        //Método longitud. Imprime la longitud de la lista.
        System.out.println("Longitud de la lista:");
        System.out.println(cola.longitud());;

    }

}