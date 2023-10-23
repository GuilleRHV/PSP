package EjerciciosStrings;

import treemapAlumno2.Teclado;

public class TrianguloEquilatero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Teclado.leerEntero("Introduce n");
		for(int i=0;i<num;i++)
        {   //Espacios
            for(int j=(num-2-i);j>=0;j--)
            {
               System.out.print(" ");
               
            }
            //Marca asteriscos
            for(int j=0;j<i+1;j++)
            {
                System.out.print("* ");
            }
            //saltos de linea
            System.out.println();
            
        }
		
	}

}
