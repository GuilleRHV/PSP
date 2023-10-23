package EjerciciosStrings;

import entrada.Teclado;

public class String2x02SignosDePuntuacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase="";
		int contsignospuntuacion;
		String cadena="";
		do {
			 contsignospuntuacion=0;
		 frase = Teclado.leerCadena("Introduce una frase");
		 
		 
		 //NO HE PUESTO TODOS
		for(int i = 0; i<frase.length();i++) {
			if(frase.charAt(i)>=39 && frase.charAt(i)<=46 || frase.charAt(i)==34 || frase.charAt(i)==44 ||frase.charAt(i)==33 || frase.charAt(i)==63 || frase.charAt(i)==58 || frase.charAt(i)==59 || frase.charAt(i)==91) {
				cadena=cadena+frase.charAt(i);
				contsignospuntuacion++;
			}
		}
		}while(frase.length()>60);
		System.out.println("La frase tiene "+contsignospuntuacion+" signos de puntuacion");
		System.out.println("Signos de puntuacion: "+cadena);
		
		
	}

}
