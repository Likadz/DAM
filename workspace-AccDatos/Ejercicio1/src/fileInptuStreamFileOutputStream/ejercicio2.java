package fileInptuStreamFileOutputStream;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ejercicio2 {

	public static void main(String args[]) throws IOException{
		//declaración del fichero
		File fichero =new File("C:\\Users\\2dam3\\Desktop\\DAM_LeireSarobe\\AccesoADatos\\FichData.dat");
		
		FileInputStream fileinp = new FileInputStream(fichero);
		DataInputStream dataInp=new DataInputStream(fileinp);
		String nombre;
		int edad;
		try{
			while(true){//va a ir leyendo asta que no le quede mas por leer, entonces saltará la excepcion
				System.out.println("Nombre: " + dataInp.readUTF() + ", Edad:" + dataInp.readInt());
			}
		}catch(EOFException e){
		}
		dataInp.close();
	}
	
}
