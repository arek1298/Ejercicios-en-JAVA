import java.util.Scanner;

public class Cifras {

	private static Scanner teclado;

	public static void main(String[] args) {
		//TODO
		
		teclado = new Scanner(System.in);
		
		int n1;
		
		System.out.println( "Escribe un numero: ");
		n1=teclado.nextInt();
		
		if (n1<9)
			System.out.println( "El numero tiene una cifra ");
		else
			if (n1<=99)
				System.out.println( "El numero tiene dos cifras ");
			else
				if (n1<=999)
					System.out.println( "El numero tiene tres cifras ");
				else
					if (n1<=9999)
						System.out.println( "El numero tiene cuatro cifras ");
					else
						if (n1<=99999)
							System.out.println( "El numero tiene mas de cuatro cifras ");
	}
}
