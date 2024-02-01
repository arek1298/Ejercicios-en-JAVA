import java.util.Scanner;

public class Divide {

	private static Scanner teclado;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1;
		int n2;
		teclado = new Scanner( System.in );
		
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
