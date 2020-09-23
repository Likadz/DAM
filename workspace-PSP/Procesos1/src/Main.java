import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException{
		
		Process p = new ProcessBuilder("cmd.exe","/c","dir ", "C:\\Users\\2dam3").start();//exe a ejecutar, atributo del cmd y el comando a ejecutar y si queremos la ruta 
		
			
		BufferedReader br= new BufferedReader (new InputStreamReader(p.getInputStream()));//cogemos el stream del proceso
		
		//ahora leemos el inputstream
		String linea;
		while((linea = br.readLine()) !=null){
			System.out.println("mensaje del proceso: " + linea);
		}

	}
	
}
