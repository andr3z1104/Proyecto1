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
public class Usuario {
    
    private String name;
    private Lista relaciones;
    private int cantRelaciones;

    public Usuario(String name) {
        this.name = name;
    }

    

    public Usuario(String name, int cantRelaciones) {
        this.name = name;
        this.cantRelaciones = cantRelaciones;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lista getRelaciones() {
        return relaciones;
    }

    public void setRelaciones(Lista relaciones) {
        this.relaciones = relaciones;
    }

    public int getCantRelaciones() {
        return cantRelaciones;
    }

    public void setCantRelaciones(int cantRelaciones) {
        this.cantRelaciones = cantRelaciones;
    }
}
