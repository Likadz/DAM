package Entregable;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {
public static void main(String [] arg) throws IOException {

		//declaración del fichero
		File fichero =new File(".\\Vehiculos.dat");

		//creamos el escaner
		Scanner sc=new Scanner(System.in);
		//pedimos los datos
		System.out.println("Por favor, introduce la marca del coche");
		String marca=sc.nextLine();
		System.out.println("Por favor, introduce el modelo del coche");
		String modelo=sc.nextLine();
		System.out.println("Por favor, introduce la matricula del coche");
		String matricula=sc.nextLine();
		System.out.println("Por favor, introduce la capacidad del deposito del coche en litros");
		int deposito;
        while (!sc.hasNextInt()) {
            String input = sc.next();
            System.out.printf("\"%s\" El depósito debe ser un número entero y positivo.\n", input);
        }
        deposito = sc.nextInt();

		//Cerramos el escaner
		sc.close();

		//creamos el vehiuclo
		Vehiculo vehiculo=new Vehiculo(modelo,matricula,marca,deposito);

		try {
			FileOutputStream fOut = new FileOutputStream(fichero);//flujo de salida
			ObjectOutputStream datOS = new ObjectOutputStream(fOut);

			datOS.writeObject(vehiculo);//escribimos el objeto

			//cerramos el flujo de salida
			datOS.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}

		//Imprimir
		try{
			FileInputStream fileinp = new FileInputStream(fichero);
			ObjectInputStream datIS=new ObjectInputStream(fileinp);

			try{
				while(true){
					vehiculo=(Vehiculo) datIS.readObject();//creamos el objeto a partir del objeto del fichero
					//imprimimos
					System.out.println("Modelo: " + vehiculo.getModelo() + ", Matricula:" + vehiculo.getMatricula() + ", Marca: " + vehiculo.getMarca());
				}
			}catch(ClassNotFoundException e){
			}
			catch(EOFException eof){
			}

			datIS.close();//cerramos el flujo
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
