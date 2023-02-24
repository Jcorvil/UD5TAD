package EjerciciosUD5.Ejercicio5_2_Listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> listaTareasArray = new ArrayList<>();
        List<String> listaTareasLinked = new LinkedList<>();

        //Añadir ArrayList
        TaskList.addTaskArray(listaTareasArray, "Ejercicio Programación");
        TaskList.addTaskArray(listaTareasArray, "Ejercicio BBDD");
        TaskList.addTaskArray(listaTareasArray, "Ejercicio SIINF");
        TaskList.addTaskArray(listaTareasArray, "Ejercicio LMGSI");

        //Añadir LinkedList
        TaskList.addTaskList(listaTareasLinked, "Ejercicio Programación");
        TaskList.addTaskList(listaTareasLinked, "Ejercicio BBDD");
        TaskList.addTaskList(listaTareasLinked, "Ejercicio SIINF");
        TaskList.addTaskList(listaTareasLinked, "Ejercicio LMGSI");


        //Eliminar ArraList
        TaskList.removeTaskArray(listaTareasArray, "Ejercicio Programación");

        //Eliminar LinkedList
        TaskList.removeTaskList(listaTareasLinked, "Ejercicio Programación");


        //Devolver arreglo LinkedList
        TaskList.mostrarTaskList(listaTareasLinked);
        System.out.println("");
        //Devolver arreglo ArrayList
        TaskList.mostrarTaskArray(listaTareasArray);

    }
}