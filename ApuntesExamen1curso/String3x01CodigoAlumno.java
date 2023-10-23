package EjerciciosStrings;

import entrada.Teclado;

public class String3x01CodigoAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String codigo;
		do {
		 codigo = Teclado.leerCadena("Introduce codigo de alumno EMPIEZA DE 1990-1995 / 1 o 2 / H o M    (000000 para salir)");
		System.out.println(codigo.substring(4));
		if(esValido(codigo)) {
			System.out.println("El codigo de alumno es valido");
		}else {
			System.out.println("El codigo de alumno no es valido");
		}
		
		}while(codigo!=String.valueOf(000000));
		
	}
	
	public static boolean esValido(String codigo) {
		boolean valido=false;
		String partenumerica=codigo.substring(4);
		
		//El string matches-> ^ (para indicar por donde empieza)
		// 					(a|b) para elegir entre una u otra  
		//					{numero} para indicar cuantas veces se da el casoej telefono {9}		
		//					?   para indicar con que acaba
		
		if(codigo.length()==6 && Integer.parseInt(codigo.substring(0, 4))>=1990 && Integer.parseInt(codigo.substring(0, 4))<=1995 && partenumerica.matches("^(1|2){1}(M|H){1}?")) {
			valido = true;
		}
		
		return valido ;
			
		
		
	}

}
