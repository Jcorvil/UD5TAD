package Practica5.TADPila;

import java.util.Stack;

public class Pila {

    private Stack<Object> torre = new Stack<>();
    public void apilar (Object elemento){
        torre.push(elemento);
    }

    public void desapilar(){
        torre.pop();
    }

    public Object cima(){
        return torre.peek();
    }

    public void limpiar(){
        while (torre.size() > 0){
            torre.pop();
        }
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