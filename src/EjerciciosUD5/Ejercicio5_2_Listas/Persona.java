package EjerciciosUD5.Ejercicio5_2_Listas;

import java.util.Objects;

public class Persona implements Comparable {
    String nombre;
    int edad;

    Persona(String nombre, Integer edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    Persona(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    Persona(String nombre){
        this.nombre = nombre;

    }

    @Override
    public String toString(){
        return "Persona{" + nombre + ", " + edad + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public int compareTo(Object other) {
        Persona otherPersona = (Persona) other;
        //Para ordenar por nombre.
        return this.nombre.compareTo(otherPersona.nombre);

    }

    @Override
    public boolean equals(Object o) {
        Persona persona = (Persona) o;
        return this.nombre.equals(persona.nombre);
    }


}