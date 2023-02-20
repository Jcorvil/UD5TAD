package Lista;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjemploLinkedList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(15);
        numbers.add(23);
        numbers.add(21);

        List<Integer> linkedList = new LinkedList<>(numbers);
        linkedList.add(7);
        linkedList.add(2);
        linkedList.add(10);

        System.out.println("ArrayList: " + numbers);
        System.out.println("LinkedList: " + linkedList);

        ListIterator<Integer> listIterator = linkedList.listIterator(linkedList.size());
        Integer b;
        while (listIterator.hasPrevious()) {
            b = listIterator.previous();
            if (b == 23) {
                listIterator.add(11);
            }
            if (b == 15){
                listIterator.remove();
            }
            System.out.println(b);
        }
        System.out.println("LinkedList: " + linkedList);


        //.get accede a una posicion concreta de la lista
        System.out.println(linkedList.get(2));
        //.set nos permite establecer un valor en una posición concreta
        //Cambia el 23 por un 22
        linkedList.set(4, 22);
        //.contains dice si el elemento dado está en a lista o no
        System.out.println(linkedList.contains(22));
        //.indexOf dice en qué posición se encuentra el elemento dado
        System.out.println(linkedList.indexOf(22));
        //.remove elimina el elemento de la posición que se le da.
        //Si hacemos casting, en lugar de borrar la posición 22 borra el elemento 22
        linkedList.remove((Integer)22);
        linkedList.add(9);
        System.out.println(linkedList);

    }
}