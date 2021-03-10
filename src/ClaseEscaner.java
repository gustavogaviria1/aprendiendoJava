import java.util.Scanner;

public class ClaseEscaner {

	public static void main(String[] args) {

		Scanner ingreseDatos = new Scanner(System.in);
		boolean arrobaSi = false;
		boolean puntoSi = false;
		String email;
		String tipoDoc;
		String mensaje = "";
		String ciudad;
		String nomDoc ="";
		String talla ="";
		int edad;
		double estatura;
		double salario;
		
		System.out.print("Nombres........:  ");
		String nombres = ingreseDatos.nextLine();
		System.out.print("Apellidos......:  ");
		String apellidos = ingreseDatos.nextLine();
		do {
			arrobaSi = false;
			puntoSi = false;			
			System.out.print("Email..........:  ");
			email = ingreseDatos.nextLine();
			for (int i = 0; i < email.length(); i ++) {
				if (email.charAt(i) == '@') {
					arrobaSi = true;					
				}
				else if (email.charAt(i) == '.') {
					puntoSi = true;
				}
			}
			if(arrobaSi == false && puntoSi == false) {
				System.out.println("Email INCORRECTO, falta arroba (@) y falta punto (.), intente de nuevo");
			}
			else if(puntoSi == false) {
				System.out.println("Email INCORRECTO, falta punto (.), intente de nuevo");
			}
			else if(arrobaSi == false ) {
					System.out.println("Email INCORRECTO, falta arroba (@) , intente de nuevo");
				}
		}while (arrobaSi == false || puntoSi == false);
		System.out.print("Ciudad.........:  ");
		ciudad = ingreseDatos.nextLine();
		
		do {
			System.out.print("Tipo Doc.......:  ");
			tipoDoc = ingreseDatos.nextLine();
			if(tipoDoc.equalsIgnoreCase("CC")) {
				nomDoc = "cédula de ciudadanía";
			}
			else if(tipoDoc.equalsIgnoreCase("RC")) {
				nomDoc = "registro civil de nacimiento";
			}
			else if(tipoDoc.equalsIgnoreCase("TI")) {
				nomDoc = "tarjeta de identidad";
			}
			else {
				System.out.println("TIPO DE DOCUMENTO INCORRECTO, intente de nuevo");
			}
		}while(tipoDoc.equalsIgnoreCase("CC") == false && tipoDoc.equalsIgnoreCase("RC") == false && tipoDoc.equalsIgnoreCase("TI") == false);
		
		System.out.print("Nro Doc........:  ");			
		int nroDoc = ingreseDatos.nextInt();

		do {			
			System.out.print("Edad...........:  ");
			edad = ingreseDatos.nextInt();
			if (edad < 18) {
				mensaje = " Adolescente, menor de edad";
			}
			else if(edad >= 18 && edad <=40 ) {
				mensaje = "Joven mayor de edad";
			}
			else if(edad > 40 && edad <= 65) {
				mensaje = "maduro";
			}
			else if (edad > 65){
				mensaje = "adulto mayor, población vulnerable";
			}
		}while(edad < 1 || edad > 110);
		
		do {
			System.out.print("Estatura.......:  ");
			estatura = ingreseDatos.nextDouble();
			if(estatura < 1.50) {
				talla = "BAJA.";
			}
			else if(estatura >= 1.50 && estatura < 1.70) {
				talla = "MEDIA.";
			}
			else if(estatura >= 1.70 && estatura <= 2.10) {
				talla = "ALTA.";
			}
			else {
				System.out.println("VALOR ERRADO, intente de nuevo");
			}
		}while(estatura < 1 || estatura > 2.10);
		
		do {
			System.out.print("Salario........:  ");
			salario = ingreseDatos.nextDouble();
		}while(salario < 100);
		
		System.out.println("\n\n");
		System.out.println("Tipo Doc.......:  " + nomDoc.toUpperCase());
		System.out.println("Nro de " + tipoDoc.toUpperCase() + "......:  " + nroDoc);
		System.out.println("Nombres........:  " + nombres.toUpperCase());
		System.out.println("Apellidos......:  " + apellidos.toUpperCase());
		System.out.println("Ciudad.........:  " + ciudad.toUpperCase());
		System.out.println("Edad...........:  " + edad + " años. Grupo Poblacional:  " + mensaje.toUpperCase());
		System.out.println("Estatura.......:  " + estatura + " metros. " + talla);
		System.out.println("Email..........:  " + email);
		System.out.println("Salario........:  " + salario);
	}

}
