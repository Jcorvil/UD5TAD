package EjerciciosUD5.Ejercicio5_2_Listas;

import java.util.List;

public class TaskList {

    public static void addTaskArray (List<String> taskArray, String tarea){

        taskArray.add(tarea);

    }

    public static void addTaskList (List<String> taskList, String tarea){

        taskList.add(tarea);

    }


    public static void removeTaskArray (List<String> taskArray, String tarea){

        taskArray.remove(tarea);

    }


    public static void removeTaskList (List<String> taskList, String tarea){

        taskList.remove(tarea);

    }

    public static void mostrarTaskArray (List<String> taskArray){
        System.out.print("[ ");
        for(int i = 0; i < taskArray.size(); i++) {
            System.out.print(taskArray.get(i));
            System.out.print(", ");
        }
        System.out.print(" ]");
    }

    public static void mostrarTaskList (List<String> taskList){
        System.out.print("[ ");
        for(int i = 0; i < taskList.size(); i++) {
            System.out.print(taskList.get(i));
            System.out.print(", ");
        }
        System.out.print(" ]");
    }

}