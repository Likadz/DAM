package Ejercicios;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirTextoBufferedReader {
	public static void main(String [] arg)   {
		String frase="Esta frase es la del texto";

		File fichero = new File("c:/Users/2dam3/Desktop/AccesoADatos/Texto/FTbufferedReader.txt");

		FileReader fr;
		try {
			fichero.createNewFile();
			fr = new FileReader(fichero);
			BufferedReader br = new BufferedReader(fr);
			 String linea;
	         while((linea=br.readLine())!=null) //mietras que lo que lea no sea nulo
	            System.out.println(linea);


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
