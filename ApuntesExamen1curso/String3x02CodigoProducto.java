package EjerciciosStrings;

import entrada.Teclado;

public class String3x02CodigoProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String codigo;
		int nactivoscatA=0;
		int nactivoscatB=0;
		int nactivoscatC=0;
		int ninactivoscatA=0;
		int ninactivoscatB=0;
		int ninactivoscatC=0;
		do {
		 codigo = Teclado.leerCadena("Introduce codigo");
		System.out.println(esValido(codigo));
			if(activosCatA(codigo)) {
				nactivoscatA++;
			}else if(inactivosCatA(codigo)) {
				ninactivoscatA++;
			}else if(activosCatB(codigo)) {
				nactivoscatB++;
			}else if(inactivosCatB(codigo)) {
				ninactivoscatA++;
			}else if(activosCatC(codigo)) {
				nactivoscatC++;
			}else if(inactivosCatC(codigo)) {
				ninactivoscatC++;
			}
		}while(!codigo.equals("0"));
		System.out.println("Nº activos cat A: "+nactivoscatA);
		System.out.println("Nº inactivos cat A: "+ninactivoscatA);
		System.out.println("Nº activos cat B: "+nactivoscatB);
		System.out.println("Nº inactivos cat B: "+ninactivoscatB);
		System.out.println("Nº activos cat C: "+nactivoscatC);
		System.out.println("Nº inactivos cat C: "+ninactivoscatC);
	}
	/*
	 * String regexp = "\\d{1,2}/\\d{1,2}/\\d{4}";

// Lo siguiente devuelve true
System.out.println(Pattern.matches(regexp, "11/12/2014"));
	 * 
	 * */
	//SE QUIERE QUE EMPIECE CON A/B/C DESPUES FECHA 1990-1995 DESPUES 1 o 0 Y 2 VALORES CUALQUIERA
	public static boolean esValido(String codigo) {
		boolean valido = false;
		//[^ ] que vale cualquier valor, si quisieramos que fuera, por ejemplo cualquiera menos A seria [^a]
		if(codigo.length()==8 &&  codigo.matches("^(A|B|C)(1990|1991|1992|1993|1994|1995)(1|0)[^ ]{2}$")) {
			valido = true;
		}
		
		return valido;
	}
	
	
	public static boolean activosCatA(String codigo) {
		
		boolean valido = false;
		//[^ ] que vale cualquier valor, si quisieramos que fuera, por ejemplo cualquiera menos A seria [^a]
		if(codigo.matches("^(A)(1990|1991|1992|1993|1994|1995)(1)[^ ]{2}$")) {
			valido = true;
		}
		return valido;
	}
		
	public static boolean inactivosCatA(String codigo) {
			
			boolean valido = false;
			//[^ ] que vale cualquier valor, si quisieramos que fuera, por ejemplo cualquiera menos A seria [^a]
			if(codigo.matches("^(A)(1990|1991|1992|1993|1994|1995)(0)[^ ]{2}$")) {
				valido = true;
			}
			return valido;
		}
	
	
		
		
	public static boolean activosCatB(String codigo) {
			
			boolean valido = false;
			//[^ ] que vale cualquier valor, si quisieramos que fuera, por ejemplo cualquiera menos A seria [^a]
			if(codigo.matches("^(B)(1990|1991|1992|1993|1994|1995)(1)[^ ]{2}$")) {
				valido = true;
			}
			return valido;
		}
	
	
	
	public static boolean inactivosCatB(String codigo) {
		
		boolean valido = false;
		//[^ ] que vale cualquier valor, si quisieramos que fuera, por ejemplo cualquiera menos A seria [^a]
		if(codigo.matches("^(B)(1990|1991|1992|1993|1994|1995)(0)[^ ]{2}$")) {
			valido = true;
		}
		return valido;
	}
	
	public static boolean activosCatC(String codigo) {
			
			boolean valido = false;
			//[^ ] que vale cualquier valor, si quisieramos que fuera, por ejemplo cualquiera menos A seria [^a]
			if(codigo.matches("^(C)(1990|1991|1992|1993|1994|1995)(1)[^ ]{2}$")) {
				valido = true;
			}
			return valido;
		}
	
	public static boolean inactivosCatC(String codigo) {
		
		boolean valido = false;
		//[^ ] que vale cualquier valor, si quisieramos que fuera, por ejemplo cualquiera menos A seria [^a]
		if(codigo.matches("^(C)(1990|1991|1992|1993|1994|1995)(0)[^ ]{2}$")) {
			valido = true;
		}
		return valido;
	}







}


