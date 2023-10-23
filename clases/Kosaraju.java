/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
/**
 *
 * @author andre
 */
public class Kosaraju {
    
    private boolean[] visitado;
    
    public void stronglyConnected(GRAFO a){
        visitado = new boolean[a.getMatrixAdy().length];
        StackKosa pila = new StackKosa();
        
        for (int vertice = 0; vertice < a.getMatrixAdy().length; vertice++) {
            if(!visitado[vertice]){
                findOrder(a, vertice, pila);
            }
        }
        
        invertir(a);
        
        visitado = new boolean[a.getMatrixAdy().length];
        while(!pila.isEmpty()){
            int vertex = pila.pop().getElement();
            if(!visitado[vertex]){
                dfs(a,vertex);
                System.out.println("");
            }
        }
    }
    
    public void findOrder(GRAFO a, int v, StackKosa pila){
        visitado[v] = true;
        
        for (int i = 0; i < a.getMatrixAdy().length; i++) {
            if(a.getMatrixAdy()[v][i]==1 && !visitado[v]){
                findOrder(a,v,pila);
            }
        }
    }
    
    public void invertir(GRAFO a){
        for (int i = 0; i < a.getMatrixAdy().length; i++) {
            for (int j = 0; j < a.getMatrixAdy().length; j++) {
                if(a.getMatrixAdy()[i][j] == 1){
                    a.getMatrixAdy()[i][j]=0;
                    a.getMatrixAdy()[i][j]=2;
                }
            }
        }
    }
    
    public void dfs(GRAFO a, int v){
        visitado[v] = true;
        System.out.println(v+" ");
        
        for (int i = 0; i < a.getMatrixAdy().length; i++) {
            if(a.getMatrixAdy()[v][i] == 2 && !visitado[i]){
                dfs(a,i);
            }
        }
    }
    
    
}
