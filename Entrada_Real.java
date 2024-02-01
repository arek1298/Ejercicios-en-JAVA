import java.util.Scanner;

public class Entrada_Real {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1, n2;
		
		Scanner teclado = new Scanner( System.in );
		
		System.out.print("Introduzca primer numero: " );
		n1 = teclado.nextFloat();
		
		System.out.print("Introduzca segundo numero: " );
		n2 = teclado.nextFloat();
		
		System.out.println( "Los numeros que escribiste son " + n1 + ", " + n2 );
	}
}
