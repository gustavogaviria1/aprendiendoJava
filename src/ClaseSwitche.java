//
///////////////////////////////////////////CAPTURA CON JOPTION//////////////////////////////////////////
//import java.util.Scanner;
//
//import javax.swing.JOptionPane;
//
//public class ClaseSwitche {
//
//	public static void main(String[] args) {
//
//			Scanner geoforma = new Scanner(System.in);
//
//			System.out.println("---M E N �---\n\n1. TRIANGULO.\n2. CUADRADO.\n3. C�RCULO.\n4. RECT�NCULO.\n5. SALIR.");
//			String respuesta;
//			do {
//				System.out.print("\n\nSeleccione Opci�n...:   ");
//				int opcion = geoforma.nextInt();
//				
//				switch (opcion) {
//				case 1:
//					double baseTriangulo = Double.parseDouble(JOptionPane.showInputDialog("TRI�NGULO Base...:   "));
//					double alturaTriangulo = Double.parseDouble(JOptionPane.showInputDialog("TRI�NGULO Altura"));
//					System.out.print("El �rea del TRI�NGULO es...:   ");
//					System.out.printf("%1.2f", (baseTriangulo*alturaTriangulo)/2);
//					break;
//				case 2:
//					double lado = Double.parseDouble(JOptionPane.showInputDialog("CUADRADO Lado...:   "));
//					System.out.print("El �rea del CUADRADO es...:   ");
//					System.out.printf("%1.2f", Math.pow(lado, 2));
//					break;
//				case 3:
//					double radio = Double.parseDouble(JOptionPane.showInputDialog("C�RCULO Radio...:   "));
//					System.out.print("El �rea del C�RCULO es...:   ");
//					System.out.printf("%1.2f", Math.PI*radio);
//					break;
//				case 4:
//					double baseRectangulo = Double.parseDouble(JOptionPane.showInputDialog("RECT�NGLO Base...:   "));
//					double alturaRectangulo = Double.parseDouble(JOptionPane.showInputDialog("RECT�NGULO Alutra...:"));
//					System.out.print("El �rea del RECT�NGULO es...:   ");
//					System.out.printf("%1.2f", (baseRectangulo*alturaRectangulo));
//					break;
//				default:
//					System.out.println("\nOpci�n Errada, intente de nuevo");
//					break;
//				}
//				respuesta = JOptionPane.showInputDialog("\n\nDesea calcular el �rea de otra figura...:???   SI o NO");
//			}while(respuesta.equalsIgnoreCase("SI"));
//			System.out.println("\n\nF I N  P R O G R A M A");
//
//	}
//
//}


///////////////////////////// CAPTURA CON SCANNER////////////////////////////////////////////

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ClaseSwitche {

	public static void main(String[] args) {

			Scanner geoforma = new Scanner(System.in);
			Scanner rta = new Scanner(System.in);
			System.out.println("---M E N �---\n\n1. TRIANGULO.\n2. CUADRADO.\n3. C�RCULO.\n4. RECT�NCULO.\n5. SALIR.");
			String respuesta;
			do {
				System.out.print("\n\nSeleccione Opci�n...:   ");
				int opcion = geoforma.nextInt();
				
				switch (opcion) {
				case 1:
//					double baseTriangulo = Double.parseDouble(JOptionPane.showInputDialog("TRI�NGULO Base...:   "));
//					double alturaTriangulo = Double.parseDouble(JOptionPane.showInputDialog("TRI�NGULO Altura"));
					System.out.print("Tri�ngulo Base...:   ");
					double baseTriangulo = geoforma.nextDouble();
					System.out.println("Tri�ngulo Altura...:   ");
					double alturaTriangulo = geoforma.nextDouble();
					System.out.print("El �rea del TRI�NGULO es...:   ");
					System.out.printf("%1.2f", (baseTriangulo*alturaTriangulo)/2);
					break;
				case 2:
//					double lado = Double.parseDouble(JOptionPane.showInputDialog("CUADRADO Lado...:   "));
					System.out.print("Cuadrado Base...:   ");
					double lado = geoforma.nextDouble();
					System.out.print("El �rea del CUADRADO es...:   ");
					System.out.printf("%1.2f", Math.pow(lado, 2));
					break;
				case 3:
//					double radio = Double.parseDouble(JOptionPane.showInputDialog("C�RCULO Radio...:   "));
					System.out.print("El �rea del C�RCULO es...:   ");
					double radio = geoforma.nextDouble();
					System.out.printf("%1.2f", Math.PI*radio);
					break;
				case 4:
//					double baseRectangulo = Double.parseDouble(JOptionPane.showInputDialog("RECT�NGLO Base...:   "));
//					double alturaRectangulo = Double.parseDouble(JOptionPane.showInputDialog("RECT�NGULO Altura...:"));
					System.out.print("Rect�ngulo Base...:   ");
					double baseRectangulo = geoforma.nextDouble();
					System.out.print("Rect�ngulo Altura...:   ");
					double alturaRectangulo = geoforma.nextDouble();
					System.out.print("El �rea del RECT�NGULO es...:   ");
					System.out.printf("%1.2f", (baseRectangulo*alturaRectangulo));
					break;
				default:
					System.out.println("\nOpci�n Errada, intente de nuevo");
					break;
				}
//				respuesta = JOptionPane.showInputDialog("\n\nDesea calcular el �rea de otra figura...:???   SI o NO");
				System.out.println("\n\nDesea calcular el �rea de otra figura...:???   SI o NO");
				respuesta = rta.nextLine();
			}while(respuesta.equalsIgnoreCase("SI"));
			System.out.println("\n\nF I N  P R O G R A M A");

	}

}
