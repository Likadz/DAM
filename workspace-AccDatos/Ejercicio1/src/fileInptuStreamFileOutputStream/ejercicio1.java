package fileInptuStreamFileOutputStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;

public class ejercicio1 {
	public static void main(String [] arg) {
		
		//declaración del fichero
		File fichero =new File("C:\\Users\\2dam3\\Desktop\\DAM_LeireSarobe\\AccesoADatos\\FichData.dat");
		
		//array nombres
		String aNombres [] ={"Leire","Ruben","Unai","Jon Ander","Arya"};
		//array edades
		int aEdades []={24,29,31,28,3};
		
		try {
			FileOutputStream fOut = new FileOutputStream(fichero);//flujo de salida
			DataOutputStream dOut = new DataOutputStream(fOut);
			
			for(int i=0;i<aNombres.length;i++){
				//escribimos nombre y edades
				dOut.writeUTF(aNombres[i]);
				dOut.writeInt(aEdades[i]);
			}
			
			//cerramos el flujo de salida
			dOut.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
}
