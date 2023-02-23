package EjerciciosUD5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ejercicio5_3Map {
    public static void main(String[] args) {
        //Dado un array de números enteros, escriba un programa en Java que use un objeto Map para contar
        // el número de veces que cada número aparece en el array. El programa debe imprimir los resultados
        // en orden ascendente según el valor del número.

        Integer[] numeros = {24,4,11,7,11,4,24,24,4,2,9};

        instanciasNumeros(numeros);

    }


    public static void instanciasNumeros(Integer[] numeros){
        Map<Integer, Integer> contadorNumeros = new HashMap<>();
        for (Integer clave : numeros) {
            if (contadorNumeros.containsKey(clave)){
                contadorNumeros.put(clave, contadorNumeros.get(clave) + 1);
            }else contadorNumeros.put(clave, 1);
        }

        Iterator<Integer> itElementos = contadorNumeros.values().iterator();
        while(itElementos.hasNext()){
            System.out.println(itElementos.next());
        }

    }
}