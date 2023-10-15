package tema1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Primos {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Random rand = new Random();
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		PrintStream salida = new PrintStream(System.out);
		String linea = entrada.readLine();
		
		while(linea!=null) {
			
			int numprimo = Integer.parseInt(linea);
			int cont = 0;
			List <Integer>primos = new ArrayList<>();
			for( int i = numprimo; i > 0; i--) {
				if(numprimo%i==0) {
					cont++;
					
				}
			}
		
				
			if(!esPrimo(numprimo)) {
				
				String frase ="";
			
				frase=frase+"El numero "+numprimo+" no es primo\nLos numeros primos menores que "+numprimo+": \n";
				for( int x = numprimo; x> 0; x--) {
					
					if(esPrimo(x)) {
						primos.add(x);
						
					}
				}
				
				if(primos!=null) {
			
					for (Integer p : primos) {
						frase=frase+p+"\n";
						
					}
				}
			
				salida.print(frase);
			}else {
				
				
				salida.println("El numero "+numprimo+" es primo");
			}
			salida.flush();
			linea = entrada.readLine();
		}
		System.exit(0);
	}
	
	
	
	public static boolean esPrimo(int n) {
	    
		if(n==2) return true;
		
	    if (n%2==0) return false;
	    
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}

}

