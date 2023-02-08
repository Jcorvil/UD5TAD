package Conjunto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EjemploConjunto {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();

        //Da true, ya que está vacío
        System.out.println(conjunto.isEmpty());

        String s1 = "s1";
        conjunto.add(s1);
        //Da false, ya que hemos metido la cadena "hola"
        System.out.println(conjunto.isEmpty());

        System.out.println(conjunto);
        String s2 = "s2";
        String s3 = "s3";
        String s4 = "s4";
        String s5 = "s5";
        conjunto.add(s2);
        conjunto.add(s3);
        conjunto.add(s4);
        conjunto.add(s5);
        //Los imprime de forma aleatoria.
        //'s3' solo lo imprime una vez, ya que hashSet no acepta repetidos, simplemente lo sobreescribe.
        System.out.println(conjunto);
        //Añade un valor nulo, ya que hashSet los acepta
        conjunto.add(null);
        System.out.println(conjunto);

        //Iterator sirve para recorrer el conjunto. .hashnext se encarga de recorrer los elementos del conjunto
        //siempre y cuando haya elementos. De esta forma, cuando llega al último elemento del conjunto, da 'false'
        //y sale del bucle.
        String e;
        Iterator<String> it = conjunto.iterator();
        while(it.hasNext()){
            e = it.next();
            System.out.print(e + " ");
        }
        System.out.println(" ");

        //.remove(Objeto) nos permite eliminar un elemento concreto del conjunto.
        conjunto.remove("s3");
        System.out.println(conjunto);

        //
        Set<String> conjunto2 = new HashSet<>();
        conjunto2.add("s2");
        conjunto2.add("s3");
        conjunto2.add("s4");
        conjunto.retainAll(conjunto2);
        System.out.println(conjunto);


        //
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("Hashset1: " + numbers);

        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("Hashset2: " + primeNumbers);

        System.out.println("¿Contiene 'numbers' los numeros primos? " + numbers.containsAll(primeNumbers));


        //

    }
}