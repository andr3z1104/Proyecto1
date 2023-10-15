
package grafoma;

/**
 *
 * @author andre
 */
public interface iGrafo {
    
    public boolean isEmpty(GrafoMA g);
    public boolean existArista(int i, int j);
    
    public void insertVertice(int n);
    public void deleteVertice(int v);
    
    public void insertArista(int i, int j);
    public void deleteArista(int i, int j);
//    
//    public int gradoIn(int j);
//    public int gradoOut(int i);
//    public int incidencia(int i);
//    public int tamano();
//    
//    public boolean isDirigido(GrafoMA g);
    public void putMaxNodos(int n);
    public void putDirigido(boolean d);
    
    public void imprimirMatrix();
}
