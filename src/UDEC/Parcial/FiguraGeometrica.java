/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDEC.Parcial;

/**
 *
 * @author Raulito
 */
public abstract class FiguraGeometrica {
    private String Nombre;
    
    public FiguraGeometrica(){
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
}
