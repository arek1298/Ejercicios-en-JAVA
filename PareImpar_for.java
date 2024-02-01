import java.util.Scanner;

public class PareImpar_for {
	private static Scanner teclado;

	public static void main(String[]args) {
		teclado = new Scanner(System.in);
		
		int n1;
		int veces = 1;
		int i;
		
		for (i=1; i<=veces; i++)
		{
		System.out.println( "Cuantas veces lo quieres hacer: " );
		veces = teclado.nextInt();
		
		System.out.println( "Introduce n1: ");
		n1 = teclado.nextInt();
		
		if (n1 % 2 == 0)
		System.out.println( "El numero es par ");
		else
			System.out.println( "El numero es impar ");
	}
}
}
