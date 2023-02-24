package EjerciciosUD5;

import java.util.Iterator;
import java.util.TreeSet;

//Queremos crear un grupo de Personas donde no se puedan repetir personas ni introducir personas nulas. Además queremos
// que en el grupo, cada vez que se introduzca una nueva persona, se mantenga ordenado por nombre, sin tener en cuenta
// minúsculas ni mayúsculas, de la z a la a y en caso de existir dos personas con el mismo nombre que se tenga en
// cuenta la edad de manera ascendente.
//Imprime todas las personas del grupo para probar los resultados. Además, cuenta cuantas personas hay que tengan
// la misma edad

public class Ejercicio5_1_Conjuntos {
    public static void main(String[] args) {
        ComparadorEdadPersona comparador1 = new ComparadorEdadPersona();
        TreeSet<Persona> comparadorPersona = new TreeSet<>(new ComparadorEdadPersona());
        //Al introducir dos personas que se llamen igual, pero de edad distinta, ordena primero por nombre y luego
        //por edad, del mas joven al mas viejo.
        Persona jorge = new Persona("Jorge", 25);
        Persona jorge1 = new Persona("Jorge", 35);
        //Si introducimos dos personas iguales (como Daniel en este caso), solo acepta uno de los dos, por lo que no
        // se pueden repetir personas.
        Persona daniel = new Persona("Daniel", 21);
        Persona daniel1 = new Persona("Daniel", 21);
        Persona diego = new Persona("Diego", 20);
        comparadorPersona.add(jorge);
        comparadorPersona.add(jorge1);
        comparadorPersona.add(daniel);
        comparadorPersona.add(daniel1);
        comparadorPersona.add(diego);
        //no permite introducir una persona nula
        //comparadorPersona.add(null);

        System.out.println(comparadorPersona);

    }
}