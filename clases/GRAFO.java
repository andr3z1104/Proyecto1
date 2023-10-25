



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package clases;



/**
 *
 * @author andre
 *
 * 
 */
public class GRAFO {
    
    private boolean[] visitado;
    private int [][] matrixAdy;

    public GRAFO(int n) {
        matrixAdy = new int [n][n];
    }

    public int[][] getMatrixAdy() {
        return matrixAdy;
    }

    public void setMatrixAdy(int[][] matrixAdy) {
        this.matrixAdy = matrixAdy;
    }
    
    public boolean[] getVisitado(){
        return visitado;
    }

    
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
           setMatrixAdy(newMatriz);
     }
    
    
    public void deleteVertice(int v){
        
        if(isEmpty()){
            System.out.println("Grafo Vacio");
            
        }else if( v > getMatrixAdy().length){
            
            System.out.println("Indice de vertice fuera de rango");
            
        }else{
            
            int [] [] deleteMatriz = new int [getMatrixAdy().length-1] [getMatrixAdy().length-1];

//            
//            for (int i = 0; i < getMatrixAdy().length-1; i++) {
//                if(i != v)
//                    for (int j = 0; j < getMatrixAdy().length-1; j++) {
//                        if(j != v){
//                            deleteMatriz[i][j] = matrixAdy[i][j];
//                        }
//                    }
//            }

            
            for (int i = 0; i < getMatrixAdy().length; i++) {
                for (int j = 0; j < getMatrixAdy().length; j++) {
                    if(i<v && j<v){
                        deleteMatriz[i][j] = getMatrixAdy()[i][j];
                    }
                    else if (i<v && j>v) {
                        deleteMatriz[i][j-1] = getMatrixAdy()[i][j];
                    }
                    else if(i>v && j<v){
                        deleteMatriz[i-1][j] = getMatrixAdy()[i][j];
                        
                    }else if(i>v && j>v){
                        deleteMatriz[i-1][j-1] = getMatrixAdy()[i][j];
                    }
                        
                }
            setMatrixAdy(deleteMatriz);
        }
        
        
    }
    }
    
    
    public void kosaraju(){
        Kosaraju k = new Kosaraju();
        k.stronglyConnected(this);
    }
    
    
//    
//    public void dfs(int v){
//        visitado[v] = true;
//        System.out.println(v +" ");
//        for (int i = 0; i < getMatrixAdy().length; i++) {
//            if (getMatrixAdy()[v][i] == 1 && !visitado[v]) {
//                dfs(v);
//            }
//        }
//    }
//    
//    public void stronglyCon(){
//        visitado = new boolean[getMatrixAdy().length];
//        StackKosa pila = new StackKosa();
//        
//        for(int v=0; v< getMatrixAdy().length; v++){
//            if(!visitado[v]){
//                findOrder(v,pila);
//            }
//        }
//        
//        invertir();
//        
//        visitado = new boolean[getMatrixAdy().length];
//        while(!pila.isEmpty()){
//            int vertex = pila.pop().getElement();
//            if(!visitado[vertex]){
//                dfs(vertex);
//                System.out.println("");
//            }
//        }
//    }
//    
//    public void findOrder(int v, StackKosa pila){
//        visitado[v] = true;
//        
//        for (int i = 0; i < getMatrixAdy().length; i++) {
//            if(getMatrixAdy()[v][i] == 1 && !visitado[v]){
//                findOrder(v, pila);
//            }
//        }
//        pila.push(v);
//    }
//    
//    public void invertir(){
//        for (int i = 0; i < getMatrixAdy().length; i++) {
//            for (int j = 0; j < getMatrixAdy().length; j++) {
//                if(getMatrixAdy()[i][j] == 1){
//                    getMatrixAdy()[i][j] = 0;
//                    getMatrixAdy()[i][j] = 1;
//                }
//            }
//        }
//    }
    
    
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
