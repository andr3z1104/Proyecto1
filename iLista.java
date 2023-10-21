
<<<<<<< HEAD

=======
package grafoma;
>>>>>>> e02ad55ea922e062025a1ca3eda2571dcc7175d5

/**
 *
 * @author andre
 */
public interface iLista {
    
    public void insertBegin(Object element);
    public void insertFinale(Object element);
    public void insertAtIndex(Object element, int index);
    
    public Object deleteBegin();
    public Object deleteFinale();
    public Object deleteAtIndex(int index);
    
    public boolean isEmpty();
    
}
