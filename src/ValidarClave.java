//================================================                                        ====================================================
//================================================                          WHILE         ====================================================
//================================================                                        ====================================================
//import javax.swing.JOptionPane;
//
//public class ValidarClave {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		String clave = "abc123";
//		int intentos = 1;
//		clave = JOptionPane.showInputDialog("Ingrese la Contraseña.   Intentos " + intentos +"/3");
//		while (clave.equalsIgnoreCase("abc123") == false && intentos <4) {
//			intentos++;
//			if (intentos > 3) {
//				System.out.println("\nCLAVE BLOQUEADA, diríjase al adminsitrador del sistema");
//				break;			
//				}
//			System.out.println("Clave Errada, intente de nuevo, le quedan " + (4-intentos) + " Intentos");	
//			clave = JOptionPane.showInputDialog("Ingrese la Contraseña.   Intentos " + intentos +"/3");
//		}
//		if(clave.equalsIgnoreCase("abc123") == true && intentos <4) {
//			System.out.println("\nINGRESO EXITOSO!!!!!!!!");
//		}
//
//	}
//}
//================================================                                           ====================================================
//================================================                          DO WHILE         ====================================================
//================================================                                           ====================================================        
//import javax.swing.JOptionPane;
//
//public class ValidarClave {
//
//	public static void main(String[] args) {
//
//		String clave = "abcd1234";
//		int intentos = 1;
//		do {
//			clave = JOptionPane.showInputDialog("Ingrese la Clave:  " + intentos + "/3" );
//			if(intentos >=3) {
//				System.out.println("\nCLAVE BLOQUEADA, contactar al administrador del sistema.");
//				break;
//			}
//			
//			if(clave.equalsIgnoreCase("abcd1234") == false && intentos <=3) {
//				System.out.println("\nCLAVE ERRADA, le quedan " + (3-intentos) + " intentos");
//				intentos++;
//			}
//			
//		}while(clave.equals("abcd1234") == false && intentos <=3);
//		if (clave.equalsIgnoreCase("abcd1234") == true && intentos <=3) {
//			System.out.println("\nINGRESO EXITOSO!!!!!!!!!");
//		}
//	}
//}

//================================================                                           ====================================================
//================================================                         SCANNER           ====================================================
//================================================                                           ====================================================        

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ValidarClave {

	public static void main(String[] args) {

		int contadorIntentos = 1;
		Scanner clave = new Scanner(System.in);
		String contrasena = "abc123";
		int intentos = 1;
		do {
			System.out.print("\nIngrese la contraseña, intentos " + intentos + "/3...:   ");
			contrasena = clave.nextLine();
			if(intentos >= 3) {
				System.out.println("\nCONTRASEÑA BLOQUEADA");
				break;
			} 
			if (contrasena.equalsIgnoreCase("abc123") == false && intentos <=3) {
				System.out.println("\nCLAVE ERRADA, intente de nuevo, le quedan....   " + (3-intentos) + " intentos");
				intentos++;
			}

		}while(contrasena.equalsIgnoreCase("abc123") == false && intentos <=3);
		if(contrasena.equalsIgnoreCase("abc123") == true && intentos <= 3) {
			System.out.println("\nINGRESO EXITOSO  !!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
	}
}
