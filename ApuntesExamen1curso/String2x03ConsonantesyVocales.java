package EjerciciosStrings;

import entrada.Teclado;

public class String2x03ConsonantesyVocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String frase="";
		int contvocales;
		int contconsonantes;
		String vocales;
		String consonantes;
		do {
		frase = Teclado.leerCadena("Introduce frase");
		contconsonantes=0;
		contvocales=0;
		vocales="";
		consonantes="";
		for(int i = 0; i<frase.length();i++) {
			if(frase.charAt(i)=='a' || frase.charAt(i)=='A' || frase.charAt(i)=='e' || frase.charAt(i)=='E' || frase.charAt(i)=='i' || frase.charAt(i)=='I' || frase.charAt(i)=='o' ||frase.charAt(i)=='O' || frase.charAt(i)=='u' ||frase.charAt(i)=='U') {
				vocales=vocales+frase.charAt(i);
				contvocales++;
			}else if(frase.charAt(i)>='a' && frase.charAt(i)<='z' || frase.charAt(i)>='A' && frase.charAt(i)<='Z') {
				consonantes=consonantes+frase.charAt(i);
				contconsonantes++;
			}
		}
		}while(frase.length()>60);
		System.out.println("Hay un total de "+contvocales+" vocales");
		System.out.println("vocales: "+vocales);
		System.out.println("Hay un total de "+contconsonantes+" consonantes");
		System.out.println("consonantes: "+consonantes);
	}

}
