package EjerciciosStrings;

import entrada.Teclado;

public class String2x10ContarPalabras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase =Teclado.leerCadena("Introduce frase");
		System.out.println("Hay un total de "+contarEspacios(frase)+" palabras");
	}
	
	public static int contarEspacios(String frase) {
		String frasearray[]=frase.split(" ");
		return frasearray.length;
	}

}
