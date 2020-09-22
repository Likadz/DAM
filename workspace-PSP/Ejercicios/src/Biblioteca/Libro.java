package Biblioteca;

import java.util.Date;
import java.util.Scanner;

public class Libro extends Ejemplar {
	
	private String autor;
	private String editorial;
	private int nHojas;
	
	public Libro(String titulo, int nEjemplar, String fPublicacion, String genero, Scanner sc){
		super(titulo, nEjemplar, fPublicacion, genero);
		System.out.println("Por favor, introduzca el autor");
    	autor=sc.nextLine();
    	System.out.println("Por favor, introduzca el nombre de la editorial");
    	editorial=sc.nextLine();
    	System.out.println("Por favor, introduzca el número de hojas");
    	nHojas=sc.nextInt();
    			
	}
	
	public Libro(String titulo, int nEjemplar, String fPublicacion, String genero, String autor, String editorial, int nHojas){
		super(titulo, nEjemplar, fPublicacion, genero);
		this.autor=autor;
		this.editorial=editorial;
		this.nHojas=nHojas;
		
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getEditorial() {
		return editorial;
	}


	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}


	public int getnHojas() {
		return nHojas;
	}


	public void setnHojas(int nHojas) {
		this.nHojas = nHojas;
	}
	
	

}
