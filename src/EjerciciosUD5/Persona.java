package EjerciciosUD5;

public class Persona {
    String nombre;
    int edad;

    Persona(String nombre, Integer edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    Persona(){}

    @Override
    public String toString() {
        return nombre;
    }

}