package EjerciciosStrings;

import entrada.Teclado;

public class String2x08EspaciosEnBlanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n=1;
		int cont=0;
		do {
			String frase=Teclado.leerCadena("Introduce Nombre Completo nº"+(cont+1));
		int contespacios=0;
		
		for (int i =0;i<frase.length();i++) {
			if(frase.charAt(i)==32) {
				contespacios++;
			}
		}
		if(frase.startsWith(" ")) {
			cont=cont;
			System.out.println("No puede haber espacios en blanco al principio");
		
		}else if(frase.endsWith(" ")){
			System.out.println("No puede haber espacios en blanco al final");
		}else if (contespacios!=1) {
			System.out.println("Debe haber 1 espacio, nº de espacios: "+contespacios);
		}
		else {
			cont++;
		}
			
			
			
		
		}while(cont<2);
		System.out.println("fin");
	}

}
