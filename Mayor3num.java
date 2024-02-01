import java.util.Scanner;

public class Mayor3num {
	private static Scanner teclado;

	public static void main(String[]args) {
		teclado = new Scanner(System.in);
		int n1;
		int n2;
		int n3;
		
		System.out.print("Introduzca n1: " );
		n1 = teclado.nextInt();
		
		System.out.print("Introduzca n2: " );
		n2 = teclado.nextInt();
		
		System.out.print( "Introduzca n3: " );
		n3 = teclado.nextInt();
		
		 if (n1 > n2) {
	            if (n1 > n3) {
	                System.out.println("El mayor es: " + n1);
	            } else {
	                System.out.println("El mayor es: " + n3);
	            }
	        } else if (n2 > n3) {
	            System.out.println("El mayor es: " + n2);
	        } else {
	            System.out.println("El mayor es: " + n3);
	        }
	    }
	}