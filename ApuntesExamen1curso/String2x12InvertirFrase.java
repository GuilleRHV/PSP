package EjerciciosStrings;

import entrada.Teclado;

public class String2x12InvertirFrase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String frase = Teclado.leerCadena("Introduce frase");
		String arrayfrase[] = frase.split(" ");
		for(int i = arrayfrase.length-1;i>=0;i--) {
			System.out.print(arrayfrase[i]+" ");
		}
	}

}
