package EjerciciosUD5;

import java.util.Comparator;

//Comparable -> Crear clases que comparen por defecto. Por ejemplo, el comparador por defecto de 'nombre' es por orden
//              alfabético.
//Comparator -> Crear clases que comparen como queramos.
public class ComparadorEdadPersona implements Comparator<Persona> {

    @Override
    public int compare (Persona o1, Persona o2) {

    if (o1.edad == o2.edad) {
        return 0;
    }
    if (o1.edad > o2.edad) {
        return 1;
    }
    return -1;
    }

}