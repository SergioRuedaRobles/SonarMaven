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
public class EjeLista {

    /**
     * @param args the command line arguments
     */
    private EjeLista(){
        
    }
    
    public static void main(String[] args) {
        Listas l1 = new Listas();
        l1.introIni("a");
        l1.introIni("b");
        l1.introFin("d");
        l1.mostrarAdelante();
        l1.mostrarAtras();
        System.out.println(l1.buscarAtras("d"));
    }
    
}
