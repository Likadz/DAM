package Biblioteca;

import java.util.Date;
import java.util.Scanner;

public class Revista extends Ejemplar{
	
	private String editorial;
	private int nPag;
	
	public Revista(String titulo, int nEjemplar, String fPublicacion, String genero, Scanner sc){
		super(titulo, nEjemplar, fPublicacion, genero);
		
    	System.out.println("Por favor, introduzca el nombre de la editorial");
    	editorial=sc.nextLine();
    	System.out.println("Por favor, introduzca el número de páginas");
    	nPag=sc.nextInt();
	}
	
	public Revista(String titulo, int nEjemplar, String fPublicacion, String genero, String editorial, int nPag){
		super(titulo, nEjemplar, fPublicacion, genero);
		this.editorial=editorial;
		this.nPag=nPag;
	}


	public String getEditorial() {
		return editorial;
	}


	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}


	public int getnPag() {
		return nPag;
	}


	public void setnPag(int nPag) {
		this.nPag = nPag;
	}
	
	
}
