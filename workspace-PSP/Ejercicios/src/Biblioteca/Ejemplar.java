package Biblioteca;

import java.util.Date;
import java.util.Scanner;

public abstract class Ejemplar {
	
	private String titulo;
	private int nEjemplar;
	private String fPublicacion;
	private String genero;
	
	public Ejemplar(Scanner sc){
		System.out.println("Por favor, introduzca el Titulo");
    	titulo=sc.nextLine();
    	System.out.println("Por favor, introduzca el número del ejemplar");
    	nEjemplar=sc.nextInt();
    	System.out.println("Por favor, introduzca la fecha de publicación");
    	fPublicacion=sc.nextLine();
    	System.out.println("Por favor, introduzca el género");
    	genero=sc.nextLine();
	}
	
	public Ejemplar(String titulo, int nEjemplar, String fPublicacion, String genero){
		this.titulo=titulo;
		this.nEjemplar=nEjemplar;
		this.fPublicacion=fPublicacion;
		this.genero=genero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getnEjemplar() {
		return nEjemplar;
	}

	public void setnEjemplar(int nEjemplar) {
		this.nEjemplar = nEjemplar;
	}

	public String getfPublicacion() {
		return fPublicacion;
	}

	public void setfPublicacion(String fPublicacion) {
		this.fPublicacion = fPublicacion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	
}
