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
public class PruebaRectangulo extends FiguraGeometrica{
    
    private float base;
    private float altura;
    private float ResultadoArea1;
    private float ResultadoArea2;
    private float ResultadoArea3;
    private float ResultadoPerimetro1;
    private float ResultadoPerimetro2;
    private float ResultadoPerimetro3;
    
    
    public PruebaRectangulo(){
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
    public float getResultadoArea1() {
        return ResultadoArea1;
    }

    public void setResultadoArea1(float ResultadoArea1) {
        this.ResultadoArea1 = ResultadoArea1;
    }

    public float getResultadoArea2() {
        return ResultadoArea2;
    }

    public void setResultadoArea2(float ResultadoArea2) {
        this.ResultadoArea2 = ResultadoArea2;
    }

    public float getResultadoArea3() {
        return ResultadoArea3;
    }

    public void setResultadoArea3(float ResultadoArea3) {
        this.ResultadoArea3 = ResultadoArea3;
    }

    public float getResultadoPerimetro1() {
        return ResultadoPerimetro1;
    }

    public void setResultadoPerimetro1(float ResultadoPerimetro1) {
        this.ResultadoPerimetro1 = ResultadoPerimetro1;
    }

    public float getResultadoPerimetro2() {
        return ResultadoPerimetro2;
    }

    public void setResultadoPerimetro2(float ResultadoPerimetro2) {
        this.ResultadoPerimetro2 = ResultadoPerimetro2;
    }

    public float getResultadoPerimetro3() {
        return ResultadoPerimetro3;
    }

    public void setResultadoPerimetro3(float ResultadoPerimetro3) {
        this.ResultadoPerimetro3 = ResultadoPerimetro3;
    }

    
    public void ProcesarDatosRec (){
        PruebaRectangulo nuevo = new PruebaRectangulo();
        String pedir1 = JOptionPane.showInputDialog("Ingresar el valor de la base para el rectangulo 1");
        float b = Float.parseFloat(pedir1);
        nuevo.setBase(b);
        String pedir2 = JOptionPane.showInputDialog("Ingresar el valor de la altura para el rectangulo 1");
        float h = Float.parseFloat(pedir2);
        nuevo.setAltura(h);
        float resua1;
        float resup1;
        resua1 = b*h;
        resup1 = (2*b)+(2*h);
        nuevo.setResultadoArea1(resua1);
        nuevo.setResultadoPerimetro1(resup1);
        String pedir1b = JOptionPane.showInputDialog("Ingresar el valor de la base para el rectangulo 2");
        float b2 = Float.parseFloat(pedir1b);
        nuevo.setBase(b2);
        String pedir2b = JOptionPane.showInputDialog("Ingresar el valor de la altura para el rectangulo 2");
        float h2 = Float.parseFloat(pedir2b);
        nuevo.setAltura(h2);
        float resua2;
        float resup2;
        resua2 = b2*h2;
        resup2 = (2*b2)+(2*h2);
        nuevo.setResultadoArea2(resua2);
        nuevo.setResultadoPerimetro2(resup2);
        String pedir1c = JOptionPane.showInputDialog("Ingresar el valor de la base para el rectangulo 3");
        float b3 = Float.parseFloat(pedir1c);
        nuevo.setBase(b3);
        String pedir2c = JOptionPane.showInputDialog("Ingresar el valor de la altura para el rectangulo 3");
        float h3 = Float.parseFloat(pedir2c);
        nuevo.setAltura(h3);
        float resua3;
        float resup3;
        resua3 = b3*h3;
        resup3 = (2*b3)+(2*h3);
        nuevo.setResultadoArea3(resua3);
        nuevo.setResultadoPerimetro3(resup3);
        JOptionPane.showMessageDialog(null, "Rectangulo 1: \n"
                + "Area: "+nuevo.getResultadoArea1()+"\nPerimetro: "+nuevo.getResultadoPerimetro1()+"\n"+"\n"+
                "Rectangulo 2: \n"
                + "Area: "+nuevo.getResultadoArea2()+"\nPerimetro: "+nuevo.getResultadoPerimetro2()+"\n"+"\n"+
                "Rectangulo 3: \n"
                + "Area: "+nuevo.getResultadoArea3()+"\nPerimetro: "+nuevo.getResultadoPerimetro3());
        
        
        
        
    }
}