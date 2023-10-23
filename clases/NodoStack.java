/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
/**
 *
 * @author andre
 */
public class NodoStack {
    
    private int element;
    private NodoStack next;
    
    public NodoStack(int element){
        this.element = element;
        this.next = null;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public NodoStack getNext() {
        return next;
    }

    public void setNext(NodoStack next) {
        this.next = next;
    }
    
}
