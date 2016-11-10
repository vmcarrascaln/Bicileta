/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicleta;

/**
 *
 * @author Estudiante
 */
public class Bicicleta {
    private FiguraGeometrica [] fgs;
    private int numFgs;
    public Bicicleta (){
        this.fgs = new FiguraGeometrica[6];
        this.numFgs = 0;
    }
    public boolean agregarFiguraGeometrica (FiguraGeometrica f){
        if(this.numFgs<6){
            this.fgs[this.numFgs] = f;
            this.numFgs++;
            return true;
                    
        }
        return false;
        
    }
    public double calcularAreaTotal(){
        double area = 0;
        for (FiguraGeometrica fg : fgs)
            area += fg.calcularArea();
        return area;
        
    }
}

