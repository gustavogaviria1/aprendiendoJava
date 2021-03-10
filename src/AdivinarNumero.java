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
//			numeroIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número para buscar coincidencia....."));
//			if(numeroIngresado == numeroAleatorio) {
//				break;				
//			}
//			else if(numeroIngresado > numeroAleatorio) {
//				System.out.println("Debe ingresar un número más PEQUEÑO");				
//			}
//			else if(numeroIngresado < numeroAleatorio) {
//				System.out.println("Debe ingresar un número más GRANDE");				
//			}
//			intentos++;
//		}while(numeroIngresado != numeroAleatorio);
//		System.out.println("\nLOS NÚMEROS COINCIDEN!!!!!!!!!!!, el número es...   " + numeroAleatorio);
//		System.out.println("Lo logrón en " + intentos + " intentos");
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
		System.out.print("Ingrese un número....:   ");
		digitado = ingreso.nextInt();
		while (aleatorio != digitado) {
			if(aleatorio < digitado) {
				System.out.println("Debe ingresar un número MENOR");
			}
			else if(aleatorio > digitado) {
				System.out.println("Debe ingresar un número MAYOR");
			}
			intentos ++;
			System.out.print("Ingrese un número....:   ");
			digitado = ingreso.nextInt();
		}
		System.out.println("\nLos números conincidentes son " + digitado);
		System.out.println("\nLo logró en...   " + intentos + " intentos");

	}

}