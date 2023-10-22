/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andre
 */
public class GRAFO {
    
//    private int numVertices;
    private int [][] matrixAdy;

    public GRAFO(int n) {
//        this.numVertices = n;
        matrixAdy = new int [n][n];
    }

    public int[][] getMatrixAdy() {
        return matrixAdy;
    }

    public void setMatrixAdy(int[][] matrixAdy) {
        this.matrixAdy = matrixAdy;
    }
    
//    public int getNumvertices(){
//        return numVertices;
//    }
//    
//    public void setNumvertices(int numVertices){
//        this.numVertices = numVertices;
//    }
    
    
    public boolean isEmpty(){
        return getMatrixAdy().length == 0;
    }
    
    public boolean existArista(int i, int j){
        return matrixAdy[i][j] != 0;
    } 
    
    public void insertArista(int i, int j){
        matrixAdy[i][j] = 1;
    }
    
    public void deleteArista(int i, int j){
        if(isEmpty()){
            System.out.println("Grafo vacio");
        }else if(i >= getMatrixAdy().length ||  j >= getMatrixAdy().length || !existArista(i, j)){
            System.out.println("No existen los vertices");
        }else{
            matrixAdy[i][j] = 0;
        }
    }
    
    
     public void insertVertice(int n){
        int[][] newMatriz = new int [n + getMatrixAdy().length] [n + getMatrixAdy().length];
            for (int x = 0; x < getMatrixAdy().length; x++) {
                for (int y = 0; y < getMatrixAdy().length; y++)
                        newMatriz [x] [y] = matrixAdy [x] [y];
                }
           
//           numVertices += n;
           setMatrixAdy(newMatriz);
     }
    
    
    public void deleteVertice(int v){
        
        if(isEmpty()){
            System.out.println("Grafo Vacio");
            
        }else if( v > getMatrixAdy().length){
            
            System.out.println("Indice de vertice fuera de rango");
            
        }else{
            
            int [] [] deleteMatriz = new int [getMatrixAdy().length-1] [getMatrixAdy().length-1];
            
            for (int i = 0; i < getMatrixAdy().length-1; i++) {
                if(i != v)
                    for (int j = 0; j < getMatrixAdy().length-1; j++) {
                        if(j != v){
                            deleteMatriz[i][j] = matrixAdy[i][j];
                        }
                    }
            }
            setMatrixAdy(deleteMatriz);
//            numVertices--;
        }
        
        
    }
    
    public void DFS(int v) {
        boolean[] visitado = new boolean[getMatrixAdy().length];
        Stack pila = new Stack();

        pila.push(v);

        while (!pila.isEmpty()) {
            int vertice = pila.pop();

            if (!visitado[vertice]) {
                visitado[vertice] = true;
                System.out.print(vertice + " ");

                for (int i = 0; i < getMatrixAdy().length; i++) {
                    if (matrixAdy[vertice][i] != 0 && !visitado[i]) {
                        pila.push(i);
                    }
                }
            }
        }
    } 
    
    public void print(){
        System.out.println("Vertices: " + getMatrixAdy().length );
        for (int i = 0; i < getMatrixAdy().length; i++) {
            for (int j = 0; j < getMatrixAdy().length; j++) {
                System.out.print(matrixAdy[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
