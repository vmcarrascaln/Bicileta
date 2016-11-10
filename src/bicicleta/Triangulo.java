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
public class Triangulo extends FiguraGeometrica {
    private int lado;

    public Triangulo(String color, int lado) {
        super(color);
        this.lado = lado;
    }
    @Override
    public double calcularArea (){
        return (Math.pow(this.lado, 2)*(Math.sqrt(3)/4));
        
    }
    
}
