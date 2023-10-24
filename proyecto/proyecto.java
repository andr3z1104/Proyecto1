package proyecto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import clases.*;
/**
 *
 * @author andre
 */
public class proyecto {

    public static void main(String[] args) {
       //Txt t = new Txt();
       //t.ListaUsuarios().print();
       
       GRAFO g = new GRAFO(5);
       g.print();
       g.insertArista(0, 1);
       g.insertArista(2, 4);
       g.insertArista(3, 1);
       g.insertArista(2, 3);
       g.insertArista(4, 3);
       g.print();
       g.deleteVertice(1);
       g.print();
       
       
    }
    
}
