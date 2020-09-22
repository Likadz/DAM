package Ejercicio1;

public class Cuadrado extends FiguraGeometrica{

    int lado1;
    int lado2;

    public Cuadrado(int posicionY, int posicionX, int lado1, int lado2){
        super(posicionY, posicionX);
        this.lado1=lado1;
        this.lado2=lado2;
    }
    @Override
    public double perimetro(){
        return (2*lado1+2*lado2);
    }
    @Override
    public double superficie(){
        double res=0;
        res=lado1*lado2;
        return res;
    }
    
    @Override
    public String toString(){
    	return " RECTANGULO " + super.toString() ;
    }

    //PREHERENCIA
    /*
    //atributos
    float posicionX;
    float posicionY;
    int lado1;
    int lado2;


    //constructores
    public Cuadrado(float posicionX, float posicionY, int lado1, int lado2){
        this.posicionX=posicionX;
        this.posicionY=posicionY;
        this.lado1=lado1;
        this.lado2=lado2;
    }
    public Cuadrado(int lado1, int lado2){
        this.lado1=lado1;
        this.lado2=lado2;
    }

    //getters setters
    public float getPosicionX() {
        return posicionX;
    }

    public float getPosicionY() {
        return posicionY;
    }

    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setPosicionX(float posicionX) {
        this.posicionX = posicionX;
    }

    public void setPosicionY(float posicionY) {
        this.posicionY = posicionY;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    //metodos
    public int perimetro(int lado1, int lado2){
        int res=(lado1*2) + (lado2*2);
        return res;
    }

    public int superficie(int lado1, int lado2){
        int res=0;
        res=lado1*lado2;
        return res;
    }*/
}
