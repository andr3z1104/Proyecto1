/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author andre
 */
public class Main {

    public static void main(String[] args) {
       GRAFO g = new GRAFO(5);
       
       g.print();
       
       g.insertArista(0, 0);
       g.insertArista(4, 4);
       g.insertArista(2, 3);
       
       g.print();
       
       g.insertVertice(1);
       
       
       g.print();
       
       g.deleteVertice(0);
       
       g.print();
    }
    
}
