package Ejercicio1;

public abstract class FiguraGeometrica {

    private int posicionX;
    private int posicionY;

    public FiguraGeometrica(int posicionY, int posicionX){
        this.posicionY=posicionY;
        this.posicionX=posicionX;
    }

    //Los convertimos en ABSTRACTOS para no tener que implementarlos aquí y que cada hijo se encarge de implementarlo.
    public abstract double perimetro();
    public abstract double superficie();
    
    @Override
    public String toString(){
    	return "figura geometrica. Posiciones: posX="+posicionX+ " posY="+ posicionY;
    }
    
    
}
