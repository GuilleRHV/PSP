package tema1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class GeneraPrimos {


    public static void main(String[] args) {
        BufferedReader entradaHijo = null;
        String numero, linea;
        try {
            File directorio = new File("bin");
            ProcessBuilder pb = new ProcessBuilder("java", "tema1.Primos");
            pb.directory(directorio);
            Process hijo = pb.start();

            entradaHijo = new BufferedReader(new InputStreamReader(hijo.getInputStream()));
            PrintStream salidaHijo = new PrintStream(hijo.getOutputStream());
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Escribe un numero primo");
            linea = teclado.readLine();

            while (!linea.equals("fin")) {
            	
                salidaHijo.println(linea); // Env�a la l�nea al proceso hijo
                salidaHijo.flush();
              
                numero = entradaHijo.readLine();
                while(numero!=null) {
                	 
                         System.out.println(numero);
                         numero = entradaHijo.readLine();
                  
                }
              
                	System.out.println("Escribe algo ");	
                
               // entradaHijo = new BufferedReader(new InputStreamReader(hijo.getInputStream()));
                
                linea = teclado.readLine();
            }
           

            hijo.destroy();
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
