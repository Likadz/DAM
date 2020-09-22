package Biblioteca;

import java.util.Date;
import java.util.Scanner;

public class Dvd extends Multimedia{
	
	private String director;
	private String actor;
	
	public Dvd(String titulo, int nEjemplar, String fPublicacion, String genero, String productor, double duracion, Scanner sc){
		super(titulo, nEjemplar, fPublicacion, genero, productor, duracion);
		System.out.println("Por favor, introduzca el director");
    	director=sc.nextLine();
    	System.out.println("Por favor, introduzca el nombre de la actor");
    	actor=sc.nextLine();
	};
	public Dvd(String titulo, int nEjemplar, String fPublicacion, String genero, String productor, double duracion, String director, String actor) {
		super(titulo, nEjemplar, fPublicacion, genero, productor, duracion);
		this.director=director;
		this.actor=actor;
	
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	
	

}
