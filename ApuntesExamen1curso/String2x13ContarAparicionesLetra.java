package EjerciciosStrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import entrada.Teclado;

public class String2x13ContarAparicionesLetra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	 String frase = Teclado.leerCadena("Introduce cadena");
	        char[] arrayfrase = frase.toCharArray();
	      //  Arrays.sort(arrayfrase);
	        String s = String.valueOf(arrayfrase);
	     
	        for (int i = 0; i < arrayfrase.length;) {
	            System.out.println(arrayfrase[i]+"("+(s.lastIndexOf(arrayfrase[i])-s.indexOf(arrayfrase[i])+1)+")");
	            i+= (s.lastIndexOf(arrayfrase[i]) - s.indexOf(arrayfrase[i]) + 1);
	}*/
		
		
		//Con mapas
		String frase = Teclado.leerCadena("Introduce cadena");
		Map <Character,Integer> mapa = new HashMap<Character, Integer>();
		for (int i = 0; i < frase.length();i++) {
			int cont=0;
			char caracterprimario = frase.charAt(i);
			for (int x = 0; x < frase.length();x++) {
				if(caracterprimario==frase.charAt(x)) {
					cont++;
					}
		}
			mapa.put(frase.charAt(i), cont);
		
	}
		
		System.out.println(mapa);
		
	}
	
	

}
