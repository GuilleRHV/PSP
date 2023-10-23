package EjerciciosStrings;

import entrada.Teclado;

public class String1x04pasaraMayusMinus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		do {
			 opcion =Teclado.leerEntero("0. Salir\n1. pasar a mayuscula\n2. Pasar a minuscula");
		char letra = Teclado.leerCaracter("Introduce caracter");
		switch(opcion) {
		case 0:
			break;
		case 1:
			System.out.println(pasaramayus(letra));;
			break;
		case 2:
			System.out.println(pasaraminus(letra));;
			break;
			
		}
	}while(opcion!=0);
	
	}
	
	public static char pasaramayus(char a) {
		return (char)(a-32);
	}

	public static char pasaraminus(char a) {
		return (char)(a+32);
	}
}
