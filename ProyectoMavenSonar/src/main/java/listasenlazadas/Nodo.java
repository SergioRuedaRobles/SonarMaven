package listasenlazadas;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Sergio
 */
public class Nodo {
    
    private Nodo next;
    private Nodo prev;
    private String dato;
    
    public Nodo(String dato, Nodo next, Nodo prev){
            this.next = next;
            this.prev = prev;
            this.dato = dato;
    }
    
    public Nodo getNext(){
        return next;
    }
    
    public void setNext(Nodo next){
        this.next = next;
    }
    
    public Nodo getPrev(){
        return prev;
    }
    
    public void setPrev(Nodo prev){
        this.prev = prev;
    }
    
    public String getDato(){
        return dato;
    }
    
    public void setDato(String dato){
        this.dato = dato;
    }
}
