import java.util.Scanner;

//=======================================  JOption  ==============================================================
//import javax.swing.JOptionPane;
//
//public class AdivinarNumero {
//
//	public static void main(String[] args) {
//		
//		int numeroIngresado=0, contadorIntentos = 0;
//		int numeroAleatorio = (int)(Math.random()*100);
//		int intentos = 1;
//		
//		
//		do {
//
//			numeroIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un n�mero para buscar coincidencia....."));
//			if(numeroIngresado == numeroAleatorio) {
//				break;				
//			}
//			else if(numeroIngresado > numeroAleatorio) {
//				System.out.println("Debe ingresar un n�mero m�s PEQUE�O");				
//			}
//			else if(numeroIngresado < numeroAleatorio) {
//				System.out.println("Debe ingresar un n�mero m�s GRANDE");				
//			}
//			intentos++;
//		}while(numeroIngresado != numeroAleatorio);
//		System.out.println("\nLOS N�MEROS COINCIDEN!!!!!!!!!!!, el n�mero es...   " + numeroAleatorio);
//		System.out.println("Lo logr�n en " + intentos + " intentos");
//
//	}
//
//}


//=======================================  JOption  ==============================================================


public class AdivinarNumero {

	public static void main(String[] args) {
		
		Scanner ingreso = new Scanner(System.in);
		int digitado = 0, intentos = 0;
		int aleatorio = (int)(Math.random()*100);
		System.out.print("Ingrese un n�mero....:   ");
		digitado = ingreso.nextInt();
		while (aleatorio != digitado) {
			if(aleatorio < digitado) {
				System.out.println("Debe ingresar un n�mero MENOR");
			}
			else if(aleatorio > digitado) {
				System.out.println("Debe ingresar un n�mero MAYOR");
			}
			intentos ++;
			System.out.print("Ingrese un n�mero....:   ");
			digitado = ingreso.nextInt();
		}
		System.out.println("\nLos n�meros conincidentes son " + digitado);
		System.out.println("\nLo logr� en...   " + intentos + " intentos");

	}

}