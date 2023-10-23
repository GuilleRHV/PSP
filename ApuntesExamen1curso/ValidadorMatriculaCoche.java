package EjerciciosStrings;

import entrada.Teclado;

public class ValidadorMatriculaCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String matricula = Teclado.leerCadena("Introduce matricula");
		
		if(validarMatriculaEuropea_Exp(matricula)) {
			System.out.println("La matricula "+matricula+" es valida.");
		}else {
			System.out.println("La matricula "+matricula+" es invalida.");
		}
		
		
		
	}
	
	public static boolean validarMatriculaEuropea_Exp(String matricula) {
		 
	    return matricula.matches("^[0-9]{4}[A-Z]{3}$");
	 
	}

}
