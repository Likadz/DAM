package Biblioteca;

import java.util.Date;
import java.util.Scanner;

public class Cd extends Multimedia{

	private String artista;
	
	public Cd(String titulo, int nEjemplar, String fPublicacion, String genero, String productor, double duracion, Scanner sc){
		super(titulo, nEjemplar, fPublicacion, genero, productor, duracion);
		System.out.println("Por favor, introduzca el artista");
    	artista=sc.nextLine();
	};
	
	public Cd(String titulo, int nEjemplar, String fPublicacion, String genero, String productor, double duracion, String artista) {
		super(titulo, nEjemplar, fPublicacion, genero, productor, duracion);
		this.artista=artista;
		
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	

	
}
