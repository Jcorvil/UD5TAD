package Lista;

import java.util.ArrayList;
import java.util.List;

public class EjemploLista {
    public static void main(String[] args) {
        //List ordena por orden de inserción, no por oden alfabético.
        List<String> vocales = new ArrayList<>();
        vocales.add("A");
        vocales.add("E");
        vocales.add("I");
        vocales.add("O");
        vocales.add("U");

        System.out.println(vocales);
        //La lista al estar implementada como array, para obtener la vocal de la posición 3, debemos introducir el 2.
        //.get imprime el elemento en la posición dada
        System.out.println(vocales.get(2));
        //.remove elimina el elemento en la posición dada. Si lo metemos en un sout, muestra el elemento
        //que está eliminando
        System.out.println(vocales.remove(0));
        System.out.println(vocales);
        //.set cambia el elemento de la posición introducida por el elemento dado.
        System.out.println(vocales.set(1, "Z"));
        System.out.println(vocales);
    }
}