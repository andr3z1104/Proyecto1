
package grafoma;

/**
 *
 * @author andre
 */
public class GrafoMA implements iGrafo{
    
        private boolean dirigido;
        private int maxNodos;
        private int numVertices;
        private int matrixAdy [] [];
        
        public GrafoMA (boolean d){
            this.maxNodos = numVertices = 0;
            this.dirigido = d;
        }
        
        public GrafoMA(int n, boolean d){
            this.dirigido = d;
            this.maxNodos = n;
            this.numVertices = 0;
            matrixAdy = new int [n] [n];
        }
    
        
    
//    @Override
//    public int existArista(int i, int j) {
//        if (i >= numVertices || j >= numVertices) {
//            return 0; }
//        return matrixAdy[i][j];
//    }
    
    
    @Override
    public void insertVertice(int n) {
        if(n > maxNodos - numVertices){
            System.out.println("Se ha superado el numero de nodos maximo");
        }else{
            for (int i = 0; i < numVertices + n; i++) {
                for (int j = numVertices; j < numVertices + n; j++)
                    matrixAdy [i] [j] = matrixAdy [j] [i] = 0;
                }
            numVertices += n;
            maxNodos += n;
            }
        }

    @Override
    public void deleteVertice(int v) {
        if(v >= 0 && v < numVertices){            
            for (int i = v; i < numVertices - 1; i++) {
                for (int j = 0; j < numVertices; j++) {
                    matrixAdy[i][j] = matrixAdy[i+1][j];
                }
            }
            
            for (int i = v; i < numVertices - 1; i++) {
                for (int j = 0; j < numVertices - 1; j++) {
                     matrixAdy[i][j] = matrixAdy[i][j+1];
                }
            }
            
            numVertices--;
//            
//            while(v < numVertices){
//                for (int i = 0; i < numVertices; i++) {
//                    matrixAdy[i][v] = matrixAdy[i][v+1];
//                }
//                
//                for (int i = 0; i < numVertices; i++) {
//                    matrixAdy[v][i] = matrixAdy[v+1][i];
//                }
//                v++;
//            }
//            numVertices--;
            
        }
        else{
            System.out.println("Indice de vertice fuera de rango");
        }
    }


    @Override
    public void insertArista(int i, int j) {
//        if(i >= numVertices || j >= numVertices){
//            System.out.println("Vertice inexistente, arista no disponible");
//        }
//        else if( i == j){
//            System.out.println("Mismo vertice, arista no disponible");
//        }
//        else{
            matrixAdy [i] [j] = 1;
//        }
        
        if(!dirigido){
            matrixAdy [j] [i] = matrixAdy [i] [j];
        }
    }
    
    
    @Override
    public void deleteArista(int i, int j) {
//        if(i>= numVertices || j >= numVertices){
//            System.out.println("Vertice inexistente, arista no disponible para eliminacion");
//        }
//        else if( i == j){
//            System.out.println("Mismo vertice, arista inexsistente");
//        }
//        else{
            if(matrixAdy[i][j] > 0){
                matrixAdy [i] [j] = 0;}
            else{
                System.out.println("Grafo Vacio");
            }
        
        
        if(!dirigido){
            matrixAdy [j] [i] = 0;}
        }
    


    @Override
    public void putMaxNodos(int n) {
        maxNodos = n;
    }

    @Override
    public void putDirigido(boolean d) {
        dirigido = d;
    }


    @Override
    public boolean isEmpty(GrafoMA g) {
        for (int i = 0; i < matrixAdy.length; i++) {
        for (int j = 0; j < matrixAdy[i].length; j++) {
            if (matrixAdy[i][j] == 1) {
                return false; // El grafo no está vacío
            }
        }
    }
    return true; // El grafo está vacío
    }

    @Override
    public void imprimirMatrix() {
        System.out.println("Vertices"+numVertices);
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(matrixAdy[i][j]+" ");  
            }
            System.out.println(""); 
        }
    }
    
    
}
