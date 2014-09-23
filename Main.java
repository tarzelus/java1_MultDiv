import java.util.Scanner;

/*
 *Programa para visualizar en pantalla el resultado 
 * de la suma y la resta de dos números.
 */
public class Main {

	public static void main (String args[]) {

		int numero1, numero2, resultadoMul;
		double resultadoDiv;
		Arithmetic operaciones = new Arithmetic();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\ningresa un número: ");
		numero1 = sc.nextInt();

		System.out.print("ingresa otro número: ");
		numero2 = sc.nextInt();

		resultadoMul = operaciones.mul(numero1, numero2);
		resultadoDiv = operaciones.div(numero1, numero2);

		System.out.println("\nEl resultado de la multiplicació es: " + resultadoMul);
		System.out.println("\nEl resultado de la Division es: " + resultadoDiv);
	
		System.out.println("\n\nEGUN ONA IZAN!!\n");
	}
}
