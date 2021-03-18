/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDEC.Parcial;

import javax.swing.JOptionPane;

/**
 *
 * @author Raulito
 */
public class Rectangulo extends FiguraGeometrica{
    
    private float base;
    private float altura;
    private float ResultadoArea;
    private float ResultadoPerimetro;
    
    
    public Rectangulo(){
        super ();
        
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getResultadoArea() {
        return ResultadoArea;
    }

    public void setResultadoArea(float ResultadoArea) {
        this.ResultadoArea = ResultadoArea;
    }

    public float getResultadoPerimetro() {
        return ResultadoPerimetro;
    }

    public void setResultadoPerimetro(float ResultadoPerimetro) {
        this.ResultadoPerimetro = ResultadoPerimetro;
    }

    
    
    
    public void ProcesarDatos (){
        Rectangulo nuevo = new Rectangulo();
        String pedir1 = JOptionPane.showInputDialog("Ingresar el valor de la base");
        float b = Float.parseFloat(pedir1);
        nuevo.setBase(b);
        String pedir2 = JOptionPane.showInputDialog("Ingresar el valor de la altura");
        float h = Float.parseFloat(pedir2);
        nuevo.setAltura(h);
        float resua;
        float resup;
        resua = b*h;
        resup = (2*b)+(2*h);
        nuevo.setResultadoArea(resua);
        nuevo.setResultadoPerimetro(resup);
        nuevo.setNombre("Rectangulo");
        JOptionPane.showMessageDialog(null, "Un restangulo de base "+nuevo.getBase()+" y de altura "+nuevo.getAltura()+" tiene los siguientes datos:"+"\n"
                + "Area: "+nuevo.getResultadoArea()+"\n"
                + "Perimetro: "+nuevo.getResultadoPerimetro());
    }
    
    
}
