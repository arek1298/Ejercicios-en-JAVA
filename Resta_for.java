import java.util.Scanner;

public class Resta_for 
{
	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		
		int n1;
		int n2;
		int veces = 1;
		int i;
		
		for (i=1; i<=veces; i++)
		{	
		System.out.println( "Cuantas veces quieres la resta: " );
		veces = teclado.nextInt();
		
		System.out.print("Introduzca n1: " );
		n1 = teclado.nextInt();
		
		System.out.print("Introduzca n2: " );
		n2 = teclado.nextInt();
		
		System.out.println( "La resta es: " + (n1-n2));
	}
}
}
