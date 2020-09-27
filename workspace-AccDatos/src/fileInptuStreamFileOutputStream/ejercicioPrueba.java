package fileInptuStreamFileOutputStream;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ejercicioPrueba {
	public static void main(String [] arg) {
	
		//declaración del fichero
		File fichero =new File("C:\\Users\\2dam3\\Desktop\\DAM_LeireSarobe\\AccesoADatos\\nombre.dat");
	
		try {
			FileOutputStream fOut = new FileOutputStream(fichero);//flujo de salida
			FileInputStream fInput = new FileInputStream(fichero);//flujo de entrada
			
			int i=0;
			while(i<100){
				fOut.write(i);
				i++;
			}
			
			//cerramos el flujo de salida
			fOut.close();
			
			//visualizar datos del fichero
			while((i=fInput.read())!=-1){
				System.out.println(i);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
				
		
	}	
}
