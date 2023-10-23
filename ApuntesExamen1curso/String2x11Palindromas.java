package EjerciciosStrings;

import entrada.Teclado;

public class String2x11Palindromas {

	public static void main(String[] args) {
		// TODO Auto-generated method stubdo
		boolean valido=true;
		String frase="";
		do {
		 frase=Teclado.leerCadena("Introduce frase");
		for(int i = 0; i<frase.length();i++) {
			if(frase.charAt(i)==32) {
				valido=false;
				System.out.println("Es invalido, no deben haber espacios en blanco");
				break;
			}
		}
		}while(!valido);
		String fraseinvertida = invertir(frase);
		if(fraseinvertida.equalsIgnoreCase(frase)) {
			System.out.println("Son palindromas");
		}else {
			System.out.println("No son palindromas");
		}
		//System.out.println(fraseinvertida);
	}
	
	public static String invertir(String frase) {
		String invertida="";
		for(int i = frase.length()-1;i>=0;i--) {
			invertida=invertida+frase.charAt(i);
		}
		return invertida;
	}

}
