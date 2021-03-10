import java.util.Scanner;
public class CicloFor_NumeroFactorial {

	public static void main(String[] args) {
//		========================================= FORMA 1 ========================================
//		Scanner factorial = new Scanner(System.in);
//		System.out.print("Ingrese un número cualquiera...:   ");
//		int valor = factorial.nextInt();
//		int resultado, resultado2;
//		int valor2 = valor;
//		int i;
//		for (i= (valor-1); i>0; i--) {
//			resultado = valor2 * i; 
//			System.out.print((i+1) + " x ");
//			valor2 = resultado;
//		}
//		System.out.print(i+1);
//		System.out.println("\n\nEl factorial del número: " + valor + " es: " + valor2);
		
		
//		========================================= FORMA 2 ========================================		
		Scanner factorial = new Scanner(System.in);
		System.out.print("Ingrese un valor:....   ");
		int valor = factorial.nextInt();
		int valorFinal = 1;
		for (int i = valor; i > 0; i--) {
			valorFinal = valorFinal*i;
			System.out.print(i + " x ");
		}
		System.out.println("\n\nEl factorial del número: " + valor + " es: " + valorFinal);
	}	
}
