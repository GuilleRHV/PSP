package EjerciciosStrings;

import entrada.Teclado;

public class String2x06PiramideLetras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase = Teclado.leerCadena("Introduce frase");
		String linea="";
		for (int i = 0; i<frase.length();i++) {
			linea = linea +frase.charAt(i);
			System.out.println(linea);
		}
	}

}
