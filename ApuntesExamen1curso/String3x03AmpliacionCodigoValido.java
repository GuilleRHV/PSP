package EjerciciosStrings;

import entrada.Teclado;

public class String3x03AmpliacionCodigoValido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = Teclado.leerCadena("Introduce frase");
		
		int contvalidos=0;
		int continvalidos=0;
		
		
		for(int i = 0;i<5;i++) {
		if(tieneFormatoValido(frase)) {
			System.out.println("Tiene formato valido");
			if(tieneContenidoValido(frase)) {
				System.out.println("Tiene contenido valido");
				contvalidos++;
			}else {
				System.out.println("No tiene contenido valido");
				continvalidos++;
			}
			
		}else {
			System.out.println("No tiene formato valido");
			continvalidos++;
		}
		
		
		}
		System.out.println("Han habido un total de "+contvalidos+" codigos validos");
		System.out.println("Han habido un total de "+continvalidos+" codigos invalidos");
		
		
		
	}
	
	public static boolean tieneContenidoValido(String frase) {
		boolean valido=false;
		String consonantes="[BCDFGHJKLMNPQRSTVWXYZ]";
		if(frase.matches("^(ZRG|HSC|TRL)"+consonantes+"(PQ|MD|GR)-[0-9]{4}")) {
			int contsuma=0;
			for(int i = frase.length()-4;i<frase.length();i++) {
				contsuma = contsuma+Character.getNumericValue(frase.charAt(i));
			}
			
			
			if(contsuma>=20) {
			valido = true;}
		}
		return valido;
	}
	
	
	public static boolean tieneFormatoValido(String frase) {
		boolean valido=false;
		String consonantes="[BCDFGHJKLMNPQRSTVWXYZ]";
		if(frase.length()==11 &&  frase.matches("^"+consonantes+"{6}-[0-9]{4}")){
			valido=true;
		}
		return valido;
	}

}
