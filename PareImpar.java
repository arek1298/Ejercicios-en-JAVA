import java.util.Scanner;

public class PareImpar {
	private static Scanner teclado;

	public static void main(String[]args) {
		teclado = new Scanner(System.in);
		
		int n1;
		
		System.out.println( "Introduce n1: ");
		n1 = teclado.nextInt();
		
		if (n1 % 2 == 0)
		System.out.println( "El numero es par ");
		else
			System.out.println( "El numero es impar ");
	}
}
