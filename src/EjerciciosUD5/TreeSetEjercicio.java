package EjerciciosUD5;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEjercicio {
    public static void main(String[] args) {
        //1.-Crea un conjunto implementando un arbol binario.
        Set<Integer> conjunto = new TreeSet<>();
        //2.-Añade tres numeros enteros.
        conjunto.add(5);
        conjunto.add(8);
        conjunto.add(3);

        //3.-Recorrelo e imprime su contenido ordenado de menor a mayor.
        Iterator<Integer> it = conjunto.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println(" ");

        //4.-Haz lo mismo utilizando nombres de alumnos.
        Set<String> conjuntoAlumnos = new TreeSet<>();
        conjuntoAlumnos.add("Jorge");
        conjuntoAlumnos.add("Daniel");
        conjuntoAlumnos.add("Diego");

        Iterator<String> itAlumnos = conjuntoAlumnos.iterator();
        while (itAlumnos.hasNext()){
            System.out.print(itAlumnos.next() + " ");
        }
        System.out.println(" ");

        //5.-Haz lo mismo utilizando objetos de la clase Persona.
        //Una persona tiene nombre y edad. Además se ordenarán por nombre.
        TreeSet<Persona> treeSetPersona = new TreeSet<>();
        Persona jorge = new Persona("Jorge", 25);
        Persona daniel = new Persona("Daniel", 21);
        Persona diego = new Persona("Diego", 20);
        treeSetPersona.add(jorge);
        treeSetPersona.add(daniel);
        treeSetPersona.add(diego);

        for (Persona e : treeSetPersona) {
            System.out.println(e);
        }

        System.out.println(jorge.equals(daniel));
    }
}