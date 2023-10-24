<<<<<<< HEAD
package clases;



=======

package clases;
>>>>>>> 76d984ca949025ec6ff6ac4e786f66b40b020e70
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
