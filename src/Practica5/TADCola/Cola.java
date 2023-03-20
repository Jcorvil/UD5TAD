package Practica5.TADCola;

import java.util.LinkedList;
import java.util.List;

public class Cola {
    private List cola = new LinkedList();

    public void encolar (Object elemento){
        cola.add(elemento);
    }

    public void desencolar(){
        cola.remove(0);
    }

    public int frente(){
        return (int) cola.get(0);
    }

    public List resto(){
        List<Integer> copia = new LinkedList<>(cola);
        copia.remove(0);
        return copia;
    }

    public void limpiar(){
        cola.removeAll(cola);
    }

    public boolean esVacia(){
        if (cola.isEmpty()){
            return true;
        }else return false;
    }

    public int longitud(){
        return cola.size();
    }

    @Override
    public String toString() {
        return "Cola{" + cola + '}';
    }
}