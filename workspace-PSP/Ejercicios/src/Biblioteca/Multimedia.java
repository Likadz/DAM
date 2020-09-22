package Biblioteca;

import java.util.Date;
import java.util.Scanner;

public abstract class Multimedia extends Ejemplar{
	
	private String productor;
	private double duracion;
	
	public Multimedia(String titulo, int nEjemplar, String fPublicacion, String genero, Scanner sc){
		super(titulo, nEjemplar, fPublicacion, genero);
		System.out.println("Por favor, introduzca el productor");
    	productor=sc.nextLine();
    	System.out.println("Por favor, introduzca el tiempo de duración");
    	duracion=sc.nextDouble();
		
	}
	
	public Multimedia(String titulo, int nEjemplar, String fPublicacion, String genero, String productor, double duracion){
		super(titulo, nEjemplar, fPublicacion, genero);
		this.productor=productor;
		this.duracion=duracion;
	}

	public String getProductor() {
		return productor;
	}

	public void setProductor(String productor) {
		this.productor = productor;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	
	

}
