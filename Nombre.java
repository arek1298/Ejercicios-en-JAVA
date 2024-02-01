import java.util.Scanner;

public class Nombre {

	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner( System.in );
		
		String nombre;
		
		System.out.print("Introduce tu nombre: " );
		nombre = teclado.next();
		
		System.out.println( " Hola " + (nombre));
}
}