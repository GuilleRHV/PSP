package EjerciciosStrings;

import entrada.Teclado;

public class String2x07RotacionesDerecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String frase = Teclado.leerCadena("Introduce cadena");
	
		//Funcionara como una barra deslizante
		String frasedoble=frase+frase;
		
		//ROTAR A LA IZQUIERDA
		System.out.println("Mover a la izquierda");
		for(int i=0;i<frase.length();i++) {
			String f = frasedoble.substring(i,frase.length()+i);
			System.out.println(f);
		}
		
		//ROTAR A LA DERECHA
		System.out.println("Mover a la derecha");
		for(int i=frase.length();i>=0;i--) {
			String f = frasedoble.substring(i,frase.length()+i);
			System.out.println(f);
		}

		
		
		
		//METODO 2
		
		
		/*	int cont = 0;
		String linea="";
		String aux = frase;
		
		
		System.out.println("Mover a la izquierda");
		System.out.println(frase);
		for(int i=0;i<frase.length();i++) {
			frase = frase.substring(1)+frase.charAt(0);
		System.out.println(frase);
		
		}
		frase=aux;
		System.out.println("Mover a la derecha");
		System.out.println(frase);
		for(int i=0;i<=frase.length()-1;i++) {
			
			frase=frase.charAt(frase.length()-1)+ frase.substring(0,frase.length()-1);
		System.out.println(frase);
		*/
		
		
	

}
}
