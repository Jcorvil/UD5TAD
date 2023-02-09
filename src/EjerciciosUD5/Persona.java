package EjerciciosUD5;

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
        //return this.nombre.compareTo(otherPersona.nombre);
        //Para ordenar por edad.
        if (this.edad == otherPersona.edad) {
            return 0;
        }
        if (this.edad > otherPersona.edad) {
            return 1;
        }
        return -1;
    }

    @Override
    public boolean equals(Object o) {
        Persona persona = (Persona) o;
        return this.nombre.equals(persona.nombre);
    }


}