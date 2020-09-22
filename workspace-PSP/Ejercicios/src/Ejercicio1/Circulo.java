package Ejercicio1;

public class Circulo extends FiguraGeometrica{
    int radio;

    public Circulo(int posicionY, int posicionX, int radio){
        super(posicionY, posicionX);
        this.radio=radio;
    }
    @Override
    public double perimetro(){
        double res= 2*Math.PI*radio;
        return res;
    }
    @Override
    public double superficie(){
        int r=radio*radio;
        double res= Math.PI*r;
        return res;
    }
    
    @Override
    public String toString(){
    	return " CIRCULO "+super.toString()  ;//concatenamos el to string del padre con un string mas 
    }
}
    /*
    //atributos
    float posicionX;
    float posicionY;
    int radio;

    //constructores
    public Circulo(float posicionX, float posicionY, int radio){
        this.posicionX=posicionX;
        this.posicionY=posicionY;
        this.radio=radio;
    }
    public Circulo(int radio){
        this.radio=radio;
    }

    //getters setters
    public float getPosicionX() {
        return posicionX;
    }

    public float getPosicionY() {
        return posicionY;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public void setPosicionX(float posicionX) {
        this.posicionX = posicionX;
    }

    public void setPosicionY(float posicionY) {
        this.posicionY = posicionY;
    }


    //metodos
    public double perimetro(int radio){
       double res= 2*Math.PI*radio;
        return res;
    }

    public double superficie(int radio){
        int r=radio*radio;
        double res= Math.PI*r;
        return res;
    }
}*/
