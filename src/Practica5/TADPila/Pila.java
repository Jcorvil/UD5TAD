package Practica5.TADPila;

import java.util.LinkedList;
import java.util.List;

public class Pila {

    private List<Object> torre = new LinkedList<>();
    public void apilar (Object elemento){
        torre.add(elemento);
    }

    public void desapilar(){
        torre.remove(torre.size() - 1);
    }

    public void cima(){
        System.out.println(torre.get(torre.size() - 1));
    }

    public void limpiar(){
        torre.clear();
    }

    public boolean esVacia(){
        if (torre.isEmpty()){
            return true;
        }else return false;
    }

    public int longitud(){
        return torre.size();
    }

    @Override
    public String toString() {
        return "Pila{" +
                "torre=" + torre +
                '}';
    }
}