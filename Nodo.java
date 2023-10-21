/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
<<<<<<< HEAD

=======
package grafoma;
>>>>>>> e02ad55ea922e062025a1ca3eda2571dcc7175d5

/**
 *
 * @author andre
 */
public class Nodo {
    
    private Object element;
    private Nodo next;
    
    public Nodo(Object element){
        this.element = element;
        this.next = null;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
    
    
}
