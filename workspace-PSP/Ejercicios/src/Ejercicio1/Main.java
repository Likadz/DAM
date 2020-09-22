package Ejercicio1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int ladoA=5;
        int ladoB=5;
        Cuadrado karratu=new Cuadrado(5,5,10,5);
        System.out.println("CUADRADO:\n Perimetro " + karratu.perimetro()+ " - Superficie " + karratu.superficie() );

        int r=20;
        Circulo borobil=new Circulo(5,5,20);
        System.out.println("CIRCULO:\n Perimetro " + borobil.perimetro() + " - Superficie " + borobil.superficie() );

        Punto punto=new Punto(5,5);
        System.out.println("PUNTO:\n Perimetro " + punto.perimetro() + " - Superficie " + punto.superficie() );

        //arraytlist de figuras geometricas
        ArrayList<FiguraGeometrica> listado= new ArrayList<>();
        listado.add(new Cuadrado(5,10,20,14));
        listado.add(new Circulo(20,15,20));
        listado.add(new Punto(5,5));

        System.out.println("CUADRADO:\n Perimetro " + listado.get(0).perimetro()+ " - Superficie " + listado.get(0).superficie());
        System.out.println("CIRCULO:\n Perimetro " + listado.get(1).perimetro() + " - Superficie " + listado.get(1).superficie());
        System.out.println("PUNTO:\n Perimetro " + listado.get(2).perimetro() + " - Superficie " + listado.get(2).superficie());

        //Suma total de todos los perimetros y superficies de la lista de figuras
        float sumP=0;
        float sumS=0;
        /*for(int i=0; i< listado.size(); i++){
        	sumP+=listado.get(i).perimetro();
        	sumS+=listado.get(i).superficie();
        }*/
        
        //Loop for de otra forma
        for(FiguraGeometrica index : listado ){
        	sumP+=index.perimetro();
        	sumS+=index.superficie();
        }
        
        
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("SUMA DE TODOS LOS PERIMETROS " + sumP + "\nSUMA DE TODAS LAS SUPERFICIES " + sumS);
        
        System.out.println("---------------------------------------------------------------------------------");
        for(FiguraGeometrica index : listado ){
        	System.out.println(index.toString());
        }
        
    }
}
