
package bicicleta;

/**
 *
 * @author Estudiante
 */
public class Circulo extends FiguraGeometrica {
    public double radio;
    
    
public Circulo (String color, double radio){
    super(color);
    this.radio = radio;
  
}
public double calcularArea(){
    return (Math.pow(this.radio,2)*Math.PI);
    
}
}
