package EjerciciosUD5.Ejercicio5_2_Listas;

import java.util.List;

public class TaskList {

    public static void addTaskArray (List<String> taskArray, String tarea){

        System.out.println("Introduzca una tarea.");
        taskArray.add(tarea);

        System.out.println("Lista de tareas: " + taskArray);

    }

    public static void addTaskList (List<String> taskList, String tarea){

        System.out.println("Introduzca una tarea.");
        taskList.add(tarea);

        System.out.println("Lista de tareas: " + taskList);

    }


    public static void removeTaskArray (List<String> taskArray, String tarea){

        System.out.println("Introduzca una tarea para eliminar.");
        taskArray.remove(tarea);

        System.out.println("Lista de tareas: " + taskArray);

    }


    public static void removeTaskList (List<String> taskList, String tarea){

        System.out.println("Introduzca una tarea para eliminar.");
        taskList.remove(tarea);

        System.out.println("Lista de tareas: " + taskList);

    }

}