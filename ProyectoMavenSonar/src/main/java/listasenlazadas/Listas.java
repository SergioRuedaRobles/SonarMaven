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

    
public class Listas {
        
    private Nodo ini;
    private Nodo fin;
    
    public Listas(){
        ini = null;
        fin = null;
    }

    //introduciomos un dato al principio de la lista
    public void introIni(String dato){
        if(ini == null){
            ini = new Nodo(dato,null,null);
            fin = ini;
        }else{
            Nodo nuevoNodo = new Nodo(dato,ini,null);
            ini.setPrev(nuevoNodo);
            ini = nuevoNodo;
        }
    }
    
    //Introduciomos un dato al final de la lista
    public void introFin(String dato){
        if(ini == null){
            fin = new Nodo(dato,null,null);
            ini = fin;
        }else{
            Nodo nuevoNodo = new Nodo(dato,null,fin);
            fin.setNext(nuevoNodo);
            fin = nuevoNodo;
        }
    }

    //borramos el nodo del inicio
    public String deleteIni(){
        String dato = ini.getDato();
        ini = ini.getNext();
        if(ini != null){
            ini.setPrev(null);
        }else{
            fin = null;
        }
        return dato;
    }
    
    //borramos el nodo del final
    public String deleteFin(){
        String dato = fin.getDato();
        fin = fin.getPrev();
        if(fin != null){
            fin.setNext(null);
        }else{
            ini = null;
        }
        return dato;
    }
    
    public void mostrarAdelante(){
        Nodo temp = ini;
        while(temp != null){
            System.out.println(temp.getDato());
            temp = temp.getNext();
        }
    }
    
    public void mostrarAtras(){
        Nodo temp = fin;
        while(temp!=null){
            System.out.println(temp.getDato());
            temp = temp.getPrev();
        }
    }
    
    public boolean buscarAtras(String dato){
        Nodo temp = fin;
        while(temp!=null){
            if(temp.getDato().equals(dato)){
                return true;
            }
            temp = temp.getPrev();
        }
        return false;
    }

}