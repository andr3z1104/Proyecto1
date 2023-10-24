<<<<<<< HEAD
package clases;

=======
>>>>>>> 76d984ca949025ec6ff6ac4e786f66b40b020e70
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
<<<<<<< HEAD

=======
package clases;
>>>>>>> 76d984ca949025ec6ff6ac4e786f66b40b020e70
/**
 *
 * @author andre
 */
public class StackKosa implements iStack{
    
    private NodoStack peak;
    private int length;

    public StackKosa() {
        this.peak = null;
        this.length = 0;
    }

    public NodoStack getPeak() {
        return peak;
    }

    public void setPeak(NodoStack peak) {
        this.peak = peak;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    @Override
    public NodoStack pop() {
        if (isEmpty()) {
            System.out.println("La lista se encuentra vacia");
            return null;
        } else {
            NodoStack pointer = getPeak();
            setPeak(pointer.getNext());
            pointer.setNext(null);
            length--;
            return pointer;
        }
    }

    @Override
    public boolean isEmpty() {
        return getPeak() == null;
    }
    
    public void print(){
        NodoStack pointer = getPeak();
        while (pointer != null) {
            System.out.println("[ " + pointer.getElement() + " ]");
            pointer = pointer.getNext();
        } 
    }

    @Override
    public void push(int element) {
        NodoStack nodo = new NodoStack(element);
        if (isEmpty()) {
            setPeak(nodo);
        } else {
            nodo.setNext(getPeak());
            setPeak(nodo);
        }
        length++;
    }
    
    
}
