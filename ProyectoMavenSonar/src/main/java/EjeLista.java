/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package com.mycompany.proyectomavensonar;

/**
 *
 * @author Sergio
 */
public class EjeLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        listas l1 = new listas();
        l1.introIni("a");
        l1.introIni("b");
        l1.introFin("d");
        //l1.introFin("c");
        l1.mostrarAdelante();
        l1.mostrarAtras();
        System.out.println(l1.buscarAtras("d"));
    }
    
}
