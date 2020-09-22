package Ejercicio1;

public class Punto extends FiguraGeometrica {

    public Punto(int posicionY, int posicionX){
        super(posicionY, posicionX);
    }
    @Override
    public double perimetro(){
    	return 0;
    }
    @Override 
    public double superficie(){
    	return 0;
    }
    @Override
    public String toString(){
    	return " PUNTO " + super.toString() ;
    }
}
