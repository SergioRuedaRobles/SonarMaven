/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package com.mycompany.proyectomavensonar;

import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Sergio
 */

    
public class listas {
        
    private Nodo ini;
    private Nodo fin;
    
    public listas(){
        ini = null;
        fin = null;
    }

    public void introIni(String dato){//introduciomos un dato al principio de la lista
        if(ini == null){
            ini = new Nodo(dato,null,null);
            fin = ini;
        }else{
            Nodo nuevoNodo = new Nodo(dato,ini,null);
            ini.setPrev(nuevoNodo);
            ini = nuevoNodo;
        }
    }
    
    public void introFin(String dato){//Introduciomos un dato al final de la lista
        if(ini == null){
            fin = new Nodo(dato,null,null);
            ini = fin;
        }else{
            Nodo nuevoNodo = new Nodo(dato,null,fin);
            fin.setNext(nuevoNodo);
            fin = nuevoNodo;
        }
    }

    public String deleteIni(){//borramos el nodo del inicio
        String dato = ini.getDato();
        ini = ini.getNext();
        if(ini != null){
            ini.setPrev(null);
        }else{
            fin = null;
        }
        return dato;
    }
    
    public String deleteFin(){//borramos el nodo del final
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