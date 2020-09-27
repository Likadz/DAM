package Ejercicios;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFicheroTexto {
	public static void main(String [] arg)   {

		File directorio = new File("c:/Users/2dam3/Desktop/AccesoADatos/Texto");
		directorio.mkdirs();

		File fichero = new File("c:/Users/2dam3/Desktop/AccesoADatos/Texto/fichero.txt");
		FileReader fr=null;
		try{
			fr=new FileReader(fichero);
			int i;
			while((i=fr.read()) != -1){
				System.out.println((char) i);
			}

			fr.close();
		}catch(FileNotFoundException fn){
			System.out.println("No se encuentra el fichero");
		}
		catch (IOException ioe){
			System.out.println("Ha ocurrido un error");
		}


	}

}
