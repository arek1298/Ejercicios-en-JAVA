import java.util.Scanner;

public class Resta {
	
	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		
		int n1;
		int n2;
		
		System.out.print("Introduzca n1: " );
		n1 = teclado.nextInt();
		
		System.out.print("Introduzca n2: " );
		n2 = teclado.nextInt();
		
		System.out.println( "La resta es: " + (n1-n2));
	}
}
