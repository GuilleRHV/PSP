package runtime;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Padre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader entradaHijo = null;
		PrintStream salidaHijo = null;
		String numero, linea;
		try {
			File directorio = new File("bin");
			Runtime runtime = Runtime.getRuntime();

			Process hijo = null;

			BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Escribe un numero primo");
			linea = teclado.readLine();
			while (!linea.equals("fin")) {

				hijo = runtime.exec("java runtime.Hijo", null, new File("bin"));

				entradaHijo = new BufferedReader(new InputStreamReader(hijo.getInputStream()));
				salidaHijo = new PrintStream(hijo.getOutputStream());

				salidaHijo.println(linea);
				salidaHijo.flush(); // Asegura que los datos se han enviado
				numero = entradaHijo.readLine();

				while (!numero.equals("finproceso")) {

					System.out.println(numero);

					numero = entradaHijo.readLine();

				}

				System.out.println("Escribe algo ");
				// Vuelve a preguntar
				linea = teclado.readLine();

			}

			hijo.destroy();

		} catch (IOException ex) {
			System.err.println(ex.getMessage());
			ex.printStackTrace();
		} finally {
			try {
				if (entradaHijo != null) {
					entradaHijo.close();
				}
				if (salidaHijo != null) {
					salidaHijo.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}