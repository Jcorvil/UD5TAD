package Practica5.TADPila;

public class Main {
    public static void main(String[] args) {
        //Stack (traducido como pila) añade los elementos en orden de inserción, pero a la hora de trabajar con ellos
        //siempre va a tratarlos de la forma inversa.

        Pila torre = new Pila();
        torre.apilar(5);
        torre.apilar(8);
        torre.apilar(10);
        torre.apilar(2);
        torre.apilar(21);

        System.out.println("Primera pila:");
        System.out.println(torre);
        System.out.println("/-/-/-/-/-/-/-/-/-/");
        //Método apilar. Introduce un elemento nuevo a la pila
        torre.apilar(30);
        System.out.println("Pila tras introducir un elemento nuevo");
        System.out.println(torre);
        System.out.println("/-/-/-/-/-/-/-/-/-/");
        //Método desapilar. Elimina un elemento de la pila
        torre.desapilar();
        System.out.println("Pila tras desapilar un elemento");
        System.out.println(torre);
        System.out.println("/-/-/-/-/-/-/-/-/-/");
        //Método cima. Muestra el último elemento de la pila
        System.out.println("Último elemento de la pila");
        torre.cima();
        System.out.println("/-/-/-/-/-/-/-/-/-/");
        //Método limpiar. Deja la pila vacía
        torre.limpiar();
        System.out.println("Pila vacía:");
        System.out.println(torre);
        System.out.println("/-/-/-/-/-/-/-/-/-/");
        //Método esVacia. Dice si la pila está vacia o no
        System.out.println("¿Está la pila vacía?");
        System.out.println(torre.esVacia());
        System.out.println("/-/-/-/-/-/-/-/-/-/");
        //Método longitud. Dice el tamaño de la pila.
        System.out.println("Tamaño de la pila: ");
        System.out.println(torre.longitud());



    }

}