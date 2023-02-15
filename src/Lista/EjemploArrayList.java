package Lista;

import java.util.ArrayList;
import java.util.ListIterator;

public class EjemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        //Cambiar BMW por Renault
        cars.set(1, "Renault");
        //Eliminar Mazda
        cars.remove("Mazda");
        //Añadir Opel entre BMW y Ford
        cars.add(2, "Opel");

        System.out.println(cars);
        //Vaciar la lista
        cars.removeAll(cars);
        //Imprime el tamaño de la lista
        System.out.println(cars.size());

        //Crea una nueva lista con Mitsubishi y Toyota
        ArrayList<String> cars2 = new ArrayList<String>();
        cars2.add("Mitsubishi");
        cars2.add("Toyota");
        //Añade la nueva lista a la anterior
        cars.addAll(cars2);
        System.out.println(cars);

        //[···························]//
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        ListIterator it = cars.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("////");
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
    }
}