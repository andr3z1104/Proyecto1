/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafoma;

/**
 *
 * @author andre
 */
public class main {
    public static void main(String[] args){
         
        GrafoMA g = new GrafoMA(6,true);
        
        g.insertVertice(6);
        

        g.insertArista(0, 1);
        g.insertArista(2, 2);
        g.insertArista(1, 5);
        g.insertArista(5, 5);
        
        g.imprimirMatrix();

        g.deleteVertice(3);
        g.imprimirMatrix();

        
        
    }
}
