import java.util.Scanner;

public class MayorMenor {
	private static Scanner teclado;

	public static void main(String[]args) {
		teclado = new Scanner(System.in);
		int n1;
		int n2;
		
		System.out.print("Introduzca n1: " );
		n1 = teclado.nextInt();
		
		System.out.print("Introduzca n2: " );
		n2 = teclado.nextInt();
		
		if (n1>n2)
			{
			System.out.println( "El mayor es: " + n1);
			}
		else
				System.out.println( "El mayor es: " + n2);
		if (n1<n2)
		{
		System.out.println( "El menor es: " + n1);
		}
		else
		System.out.println( "El menor es: " + n2);	
	}
}
