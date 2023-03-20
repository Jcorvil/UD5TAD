package Practica5.TADPila;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //Stack (traducido como pila) añade los elementos en orden de inserción, pero a la hora de trabajar con ellos
        //siempre va a tratarlos de la forma inversa.
        Stack<Integer> torre = new Stack<>();
        torre.push(1);
        torre.push(2);
        torre.push(8);
        torre.push(12);
        torre.push(18);
        torre.push(25);
        torre.push(3);
        torre.push(9);
        torre.push(7);
        torre.push(10);

        System.out.println("Primera pila:");
        System.out.println(torre);
        System.out.println("/-/-/-/-/-/-/-/-/-/");
        //Método apilar. Introduce un elemento nuevo a la pila
        apilar(torre, 30);
        System.out.println("Pila tras introducir un elemento nuevo");
        System.out.println(torre);
        System.out.println("/-/-/-/-/-/-/-/-/-/");
        //Método desapilar. Elimina un elemento de la pila
        desapilar(torre);
        System.out.println("Pila tras desapilar un elemento");
        System.out.println(torre);
        System.out.println("/-/-/-/-/-/-/-/-/-/");
        //Método cima. Muestra el último elemento de la pila
        System.out.println("Último elemento de la pila");
        cima(torre);
        System.out.println("/-/-/-/-/-/-/-/-/-/");
        //Método limpiar. Deja la pila vacía
        limpiar(torre);
        System.out.println("Pila vacía:");
        System.out.println(torre);
        System.out.println("/-/-/-/-/-/-/-/-/-/");
        //Método esVacia. Dice si la pila está vacia o no
        System.out.println("¿Está la pila vacía?");
        esVacia(torre);
        System.out.println("/-/-/-/-/-/-/-/-/-/");
        //Método longitud. Dice el tamaño de la pila.
        System.out.println("Tamaño de la pila: ");
        longitud(torre);



    }

    public static void apilar (Stack<Integer> torre, Integer elemento){
        torre.push(elemento);
    }

    public static void desapilar(Stack<Integer> torre){
        torre.pop();
    }

    public static void cima(Stack<Integer> torre){
        System.out.println(torre.peek());
    }

    public static void limpiar(Stack<Integer> torre){
        while (torre.size() > 0){
            torre.pop();
        }
    }

    public static void esVacia(Stack<Integer> torre){
        if (torre.isEmpty()){
            System.out.println("La pila no contiene elementos.");
        }else System.out.println("La pila contiene elementos.");
    }

    public static void longitud(Stack<Integer> torre){
        System.out.println(torre.size());
    }

}