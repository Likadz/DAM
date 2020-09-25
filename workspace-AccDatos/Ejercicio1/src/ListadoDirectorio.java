import java.io.File;

public class ListadoDirectorio {

	public static void main(String args[]){
		String sDirectorio = "c:/Users/2dam3/Desktop/AccesoADatos";
		File f = new File(sDirectorio);
		if (f.exists()){
			File[] ficheros = f.listFiles();
			for (int x=0;x<ficheros.length;x++){
				System.out.println("Fichero " + (x+1) + " " +ficheros[x].getName());
			}
		}
		else {
			System.out.println("el fichero no existe");

		}
	}
}
