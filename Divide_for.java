import java.util.Scanner;

public class Divide_for {

	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner( System.in );
		int n1;
		int n2;
		int veces = 1;
		int i;
		
		for (i = 1; i<=veces; i++)
		{
		System.out.println( "Cuantas veces la division: ");
		veces = teclado.nextInt();

		System.out.print("Introduzca primer numero: " );
		n1 = teclado.nextInt();
		
		System.out.print("Introduzca segundo numero: " );
		n2 = teclado.nextInt();
		
		if (n2!=0)
		System.out.println( "El resultado de la division es " + (n1 / n2));
		else
			System.out.println( "No se puede hacer la division");
		}
		}
}
