package ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class CalculaPrimos {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		PrintStream salida = new PrintStream(System.out);
		String linea = entrada.readLine();
		
		
		
		if (linea!=null) {
			
			int numprimo = Integer.parseInt(linea);
			int cont = 0;
		
				
			if(!esPrimo(numprimo)) {
				
				
				salida.println("El numero "+numprimo+" no es primo\nLos numeros primos menores que "+numprimo+": ");
				salida.flush();
				//frase=frase+"El numero "+numprimo+" no es primo\nLos numeros primos menores que "+numprimo+": \n";
				for( int x = numprimo; x> 0; x--) {
					
					if(esPrimo(x)) {
					
						salida.println(x);
						salida.flush();
					}
				}
				
			}else {
				
				
				salida.println("El numero "+numprimo+" es primo");
				salida.flush();
			}
			
			
			
			
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
