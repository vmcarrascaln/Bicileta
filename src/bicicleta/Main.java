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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Circulo llanta1 = new Circulo ("Negro",10);
      
      Circulo llanta2 = new Circulo ("Negro",10);
       
      Circulo plato = new Circulo ("Negro",2);
       
      Triangulo marco1 = new Triangulo("Rojo",5);
      
      Triangulo marco2 = new Triangulo("Rojo",5);
      
      Triangulo marco3 = new Triangulo("Rojo",5);
      
      Bicicleta b = new Bicicleta ();
      
      b.agregarFiguraGeometrica(plato);
      b.agregarFiguraGeometrica(llanta1);
      b.agregarFiguraGeometrica(llanta2);
      b.agregarFiguraGeometrica(marco1);
      b.agregarFiguraGeometrica(marco2);
      b.agregarFiguraGeometrica(marco3);
      double area = b.calcularAreaTotal();
        System.out.println(area);
    }
    
}
