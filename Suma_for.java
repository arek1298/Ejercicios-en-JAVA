import java.util.Scanner;

public class Suma_for 
{
	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner (System.in);
		
		int veces = 1; 
		int n1;
		int n2;
		int i;
		for (i = 1; i<=veces; i++)
		{
		System.out.println( "Cuantas veces quieres hacer la suma: ");
		System.out.println("Introduzca n1: " );
		n1 = teclado.nextInt();
		
		System.out.println("Introduzca n2: " );
		n2 = teclado.nextInt();
		
		System.out.println( "La suma es: " + (n1+n2));
	}
}
}
