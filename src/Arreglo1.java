import java.util.Scanner;

import javax.swing.JOptionPane;

public class Arreglo1 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int [] arreglo = new int[10];
//		
//		for (int i = 0; i < arreglo.length; i++) {
//			arreglo[i] = i;
//			//arreglo[i] = (int) (Math.random()*100);
//		}
////		for (int i=0; i < arreglo.length; i++) {
////			System.out.println("Posición_" + i + "... " + arreglo[i]);
////		}
//		for (int cadaNro:arreglo) {
//			System.out.print(cadaNro + " | ");			
//		}
		
		
		
		
		
		
//		String [] paises = new String[10];
////		Scanner pais = new Scanner(System.in);
//		for (int i = 0; i < paises.length; i++) {
//			String pais = JOptionPane.showInputDialog("Ingrese País para la posición...   " + (i+1));
//			paises[i] = pais;
////			System.out.print("Ingrese País para la posición...   " + (i+1) + "   ");
////			paises[i] = pais.nextLine();
//		}
////		for (int i =0; i < paises.length; i++) {
////			System.out.println("Pais_" + (i+1) + "......   " + paises[i]);
////		}
//		int nroPais=1;
//		for(String cadaPais:paises) {			
//			System.out.println("Pais_" + nroPais + "....   " + cadaPais);
//			nroPais++;
//		}
		
		Scanner capturaAnimales = new Scanner(System.in);
		String [] animales = new String[10];
		for(int i=0; i<animales.length; i++) {
			System.out.print("Animal " + (i+1 + "...   "));
			String animal = capturaAnimales.nextLine();
			animales[i] = animal;
			
		}
		for(String cadaAnimal:animales) {
			System.out.print(cadaAnimal + " | ");
		}
		
	}

}
