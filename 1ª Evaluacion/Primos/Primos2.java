package ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Primos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader entradaHijo = null;
        String numero, linea;
        try {
            File directorio = new File("bin");
            ProcessBuilder pb = new ProcessBuilder("java", "ejercicios.CalculaPrimos2");
            pb.directory(directorio);
            
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escribe un numero primo");
            linea = teclado.readLine();
            while (!linea.equals("fin")) {
            	
            	Process hijo = pb.start();

                entradaHijo = new BufferedReader(new InputStreamReader(hijo.getInputStream()));
                PrintStream salidaHijo = new PrintStream(hijo.getOutputStream());
                

               
            	
            	
            	salidaHijo.println(linea);
   			 	salidaHijo.flush(); //Asegura que los datos se han enviado
   			 	numero = entradaHijo.readLine();
   			 	
                while (numero != null) {
                	 
                	System.out.println(numero);
                         
                	numero = entradaHijo.readLine();
                    
                }
              
                System.out.println("Escribe algo ");	
                
               
                
                linea = teclado.readLine();
                hijo.destroy();
            }
           

           
            
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                if (entradaHijo != null) {
                    entradaHijo.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        
    }
	}

}
