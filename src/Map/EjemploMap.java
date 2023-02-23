package Map;

import Conjunto.Persona;

import java.util.*;

public class EjemploMap {
    public static void main(String[] args) {
        //Los mapas funcionan como diccionarios.
        //Al crear un mapa podemos decir que tipo de valor es la clave y el tipo de valor al que hace referencia.
        // Map<Integer, String> m = new HashMap(); -> Solo podríamos meters cadenas.
        Map<Integer, Object> m = new HashMap<>();
        //En los maps, los valores se introducen con .put en lugar de .add
        //Requieren una clave(key) y un valor al que referencia
        m.put(1, "A");
        m.put(2, 100);
        m.put(3, new Persona());

        //

        Map<Integer, String> letras = new HashMap<>();
        letras.put(1, "A");
        letras.put(2, "B");
        letras.put(3, "C");
        letras.put(4, "D");
        letras.put(5, "E");

        //Con .get obtenemos el valor de la clave que le introducimos
        System.out.println(letras.get(3));

        System.out.println(letras);
        //Podemos sobreescribir un valor con .replace, o haciendo un nuevo .put
        letras.replace(4, "F");
        System.out.println(letras);

        System.out.println("Elemento eliminado: " + letras.remove(4));
        System.out.println(letras);

        //.containsValue busca el valor...
        if(!letras.containsValue("F")){
            System.out.println("La letra no se encuentra en el mapa.");
        }else{
            System.out.println("La letra se encuentra en el mapa.");
        }

        //...y .containsKey busca la clave
        if(!letras.containsKey(1)){
            System.out.println("La clave no se encuentra en el mapa.");
        }else{
            System.out.println("La clave se encuentra en el mapa.");
        }

        //.keySet imprime las claves...
        System.out.println(letras.keySet());
        //... y .values imprime los valores
        System.out.println(letras.values());


        //Podemos imprimir tanto las claves como los elementos con iteraciones
        Iterator it = letras.values().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        it = letras.keySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        //.clear elimina todos los elementos del diccionario
        System.out.println(letras);
        System.out.println(letras.isEmpty());
        letras.clear();
        System.out.println(letras);
        System.out.println(letras.isEmpty());



        //Podemos introducir claves nulas
        letras.put(null, "Z");
        //...pero solo una, ya que las claves se sobreescriben
        letras.put(null, "X");
        letras.put(9, "X");
        System.out.println(letras);

        //5 -> "Suficiente"
        //6 -> "Bien"
        //7 -> "Notable bajo"
        //...

        TreeMap<Integer, String> notas = new TreeMap<>();
        notas.put(5, "Suficiente");
        notas.put(6, "Bien");
        notas.put(7, "Notable bajo");
        notas.put(8, "Notable alto");
        notas.put(9, "Sobresaliente");
        notas.put(10, "Matricula honor");
        System.out.println(notas. values());
        System.out.println(notas.get(notas.firstKey()));
        System.out.println(notas.lowerKey(7));


    }
}