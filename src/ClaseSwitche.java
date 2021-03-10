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
//			System.out.println("---M E N Ú---\n\n1. TRIANGULO.\n2. CUADRADO.\n3. CÍRCULO.\n4. RECTÁNCULO.\n5. SALIR.");
//			String respuesta;
//			do {
//				System.out.print("\n\nSeleccione Opción...:   ");
//				int opcion = geoforma.nextInt();
//				
//				switch (opcion) {
//				case 1:
//					double baseTriangulo = Double.parseDouble(JOptionPane.showInputDialog("TRIÁNGULO Base...:   "));
//					double alturaTriangulo = Double.parseDouble(JOptionPane.showInputDialog("TRIÁNGULO Altura"));
//					System.out.print("El área del TRIÁNGULO es...:   ");
//					System.out.printf("%1.2f", (baseTriangulo*alturaTriangulo)/2);
//					break;
//				case 2:
//					double lado = Double.parseDouble(JOptionPane.showInputDialog("CUADRADO Lado...:   "));
//					System.out.print("El área del CUADRADO es...:   ");
//					System.out.printf("%1.2f", Math.pow(lado, 2));
//					break;
//				case 3:
//					double radio = Double.parseDouble(JOptionPane.showInputDialog("CÍRCULO Radio...:   "));
//					System.out.print("El área del CÍRCULO es...:   ");
//					System.out.printf("%1.2f", Math.PI*radio);
//					break;
//				case 4:
//					double baseRectangulo = Double.parseDouble(JOptionPane.showInputDialog("RECTÁNGLO Base...:   "));
//					double alturaRectangulo = Double.parseDouble(JOptionPane.showInputDialog("RECTÁNGULO Alutra...:"));
//					System.out.print("El área del RECTÁNGULO es...:   ");
//					System.out.printf("%1.2f", (baseRectangulo*alturaRectangulo));
//					break;
//				default:
//					System.out.println("\nOpción Errada, intente de nuevo");
//					break;
//				}
//				respuesta = JOptionPane.showInputDialog("\n\nDesea calcular el área de otra figura...:???   SI o NO");
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
			System.out.println("---M E N Ú---\n\n1. TRIANGULO.\n2. CUADRADO.\n3. CÍRCULO.\n4. RECTÁNCULO.\n5. SALIR.");
			String respuesta;
			do {
				System.out.print("\n\nSeleccione Opción...:   ");
				int opcion = geoforma.nextInt();
				
				switch (opcion) {
				case 1:
//					double baseTriangulo = Double.parseDouble(JOptionPane.showInputDialog("TRIÁNGULO Base...:   "));
//					double alturaTriangulo = Double.parseDouble(JOptionPane.showInputDialog("TRIÁNGULO Altura"));
					System.out.print("Triángulo Base...:   ");
					double baseTriangulo = geoforma.nextDouble();
					System.out.println("Triángulo Altura...:   ");
					double alturaTriangulo = geoforma.nextDouble();
					System.out.print("El área del TRIÁNGULO es...:   ");
					System.out.printf("%1.2f", (baseTriangulo*alturaTriangulo)/2);
					break;
				case 2:
//					double lado = Double.parseDouble(JOptionPane.showInputDialog("CUADRADO Lado...:   "));
					System.out.print("Cuadrado Base...:   ");
					double lado = geoforma.nextDouble();
					System.out.print("El área del CUADRADO es...:   ");
					System.out.printf("%1.2f", Math.pow(lado, 2));
					break;
				case 3:
//					double radio = Double.parseDouble(JOptionPane.showInputDialog("CÍRCULO Radio...:   "));
					System.out.print("El área del CÍRCULO es...:   ");
					double radio = geoforma.nextDouble();
					System.out.printf("%1.2f", Math.PI*radio);
					break;
				case 4:
//					double baseRectangulo = Double.parseDouble(JOptionPane.showInputDialog("RECTÁNGLO Base...:   "));
//					double alturaRectangulo = Double.parseDouble(JOptionPane.showInputDialog("RECTÁNGULO Altura...:"));
					System.out.print("Rectángulo Base...:   ");
					double baseRectangulo = geoforma.nextDouble();
					System.out.print("Rectángulo Altura...:   ");
					double alturaRectangulo = geoforma.nextDouble();
					System.out.print("El área del RECTÁNGULO es...:   ");
					System.out.printf("%1.2f", (baseRectangulo*alturaRectangulo));
					break;
				default:
					System.out.println("\nOpción Errada, intente de nuevo");
					break;
				}
//				respuesta = JOptionPane.showInputDialog("\n\nDesea calcular el área de otra figura...:???   SI o NO");
				System.out.println("\n\nDesea calcular el área de otra figura...:???   SI o NO");
				respuesta = rta.nextLine();
			}while(respuesta.equalsIgnoreCase("SI"));
			System.out.println("\n\nF I N  P R O G R A M A");

	}

}
