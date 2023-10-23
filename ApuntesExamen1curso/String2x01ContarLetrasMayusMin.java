package EjerciciosStrings;

import entrada.Teclado;

public class String2x01ContarLetrasMayusMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = Teclado.leerCadena("Introduce frase");
		int mayus = 0;
		String frasemayus="";
		String fraseminus="";
		int minus = 0;
		for(int i = 0; i<frase.length();i++) {
			if(frase.charAt(i)>=65 && frase.charAt(i)<=90) {
				frasemayus=frasemayus+frase.charAt(i);
				minus++;
			}else if(frase.charAt(i)>=97&& frase.charAt(i)<=122) {
				fraseminus=fraseminus+frase.charAt(i);
				mayus++;
			}
		}
		
		System.out.println("Frase: "+frase);
		System.out.println("Mayusculas: "+frasemayus+". Hay "+mayus+" mayusculas");
		System.out.println("Minusculas: "+fraseminus+". Hay "+minus+" minusculas");
	}

}
