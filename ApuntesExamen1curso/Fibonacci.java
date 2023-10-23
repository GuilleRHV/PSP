package EjerciciosStrings;

import treemapAlumno2.Teclado;

public class Fibonacci {

	public static void main(String[] args) {
		int numero,fibo1,fibo2,i;
		  
        do{
            System.out.print("Introduce numero mayor que 1: ");
            numero = Teclado.leerEntero("Introduce n:");
        }while(numero<=1);
  
        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");                 

        fibo1=1;
        //Es un auxiliar
        fibo2=1;

        System.out.print(fibo1 + " ");
        for(i=2;i<=numero;i++){
            System.out.print(fibo2 + " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        System.out.println();

}
}