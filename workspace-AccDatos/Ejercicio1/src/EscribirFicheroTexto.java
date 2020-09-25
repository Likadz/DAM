import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFicheroTexto {
	public static void main(String [] arg)   {
		String frase="Esta frase es la del texto";

		File fichero = new File("c:/Users/2dam3/Desktop/AccesoADatos/Texto/FichTexto.txt");
		FileWriter fw =null;
		try{
			fw = new FileWriter(fichero);
			//fw = new FileWriter(fichero, true); para que añada contenido en vez de sobreescribirlo
			for(int i=0; i< frase.length();i++){
				fw.write(frase.charAt(i));
			}
			fw.write(".");
			fw.close();

		}catch(IOException ioe){
			System.out.println("Ha habido un error");
		}



	}

}
