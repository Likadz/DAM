package Ejercicios;
import java.io.File;
import java.io.IOException;

public class Ejercicio4 {
	public static void main(String[] args) throws IOException{

		try{
			//creamos el directorio
			File directorio = new File("c:/Users/2dam3/Desktop/AccesoADatos/NUEVODIR");//ruta
			directorio.mkdirs();//creación
			//creamos 2 ficheros
			File fichero1 = new File("c:/Users/2dam3/Desktop/AccesoADatos/NUEVODIR/fichero1.txt");//ruta
			fichero1.createNewFile();//creacion
			File fichero2 = new File("c:/Users/2dam3/Desktop/AccesoADatos/NUEVODIR/fichero2.txt");//ruta
			fichero2.createNewFile();//cracion

			File f3=new File("c:/Users/2dam3/Desktop/AccesoADatos/NUEVODIR/ficheroAUX.txt");
			//renombramos un fichero
			boolean correcto = fichero1.renameTo(f3);
			if (correcto)
				  System.out.println("El renombrado ha sido correcto");
			else
				  System.out.println("El renombrado no se ha podido realizar");

		}catch(IOException e){
			System.out.println("ha habido un error");
		}

	}
}
