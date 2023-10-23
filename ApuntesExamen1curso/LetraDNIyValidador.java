package EjerciciosStrings;

import entrada.Teclado;
public class LetraDNIyValidador {
	 
    public static void main(String[] args) {
       
         System.out.print("Introduce tu número de DNI: ");
         int numDNI = Teclado.leerEntero("Introduce:");
         System.out.printf("La letra que corresponde a %d es %c", numDNI, calcularLetra(numDNI));
         System.out.println();
         String dni = numDNI+String.valueOf(calcularLetra(numDNI));
         
         if(validadorDNI(dni)) {
        	 System.out.println("El dni +"+dni+" es valido");
         }else {
        	 System.out.println("El dni "+dni+" es invalido");
         }
        
    }

    private static char calcularLetra(int dni){
         String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
         int resto = dni%23;
         return caracteres.charAt(resto);
    }

    @SuppressWarnings("unused")
    private static char calcularLetraArray(int dni){
         char caracteres[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
         int resto = dni%23;
         return caracteres[resto];
    }
    
    
    
    private static boolean validadorDNI(String dni) {
    	    return dni.matches("^[0-9]{8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]$");
    	     
    	
    }
}