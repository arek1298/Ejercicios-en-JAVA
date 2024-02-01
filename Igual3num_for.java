import java.util.Scanner;

public class Igual3num_for {
	private static Scanner teclado;

	public static void main(String[]args){
		teclado = new Scanner(System.in);
		
		int n1;
		int n2;
		int n3;
		int veces = 1;
		int i;
		
		for (i=1; i<=veces; i++);
		{
		System.out.println( "Cuantas veces lo quieres hacer: ");
		veces = teclado.nextInt();
		
		System.out.println( "Introduce n1: ");
		n1 = teclado.nextInt();
		
		System.out.println( "Introduce n2: ");
		n2 = teclado.nextInt();
		
		System.out.println( "Introduce n3: ");
		n3 = teclado.nextInt();
		
		if (n1 == n2) {
            if (n1 == n3) {
            	System.out.println("Son iguales a: " + n1);
            } else {
                System.out.println("Son iguales a: " + n3);
            }
        } else if (n2 == n3) {
            System.out.println("Son iguales a: " + n2);
        } else {
            System.out.println("Son iguales a: " + n3);
        }
    }
}
}