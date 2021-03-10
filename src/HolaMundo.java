import javax.swing.JOptionPane;

public class HolaMundo {
	public static void main(String[] args) {
		System.out.println("Hola Mundo de Nuevo");
		int entero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número ENTERO de -2.147.483.648 a 2.147.483.647"));
		Short corto = Short.parseShort(JOptionPane.showInputDialog("Ingrese un número CORTO de -32.768 a 32.767"));
		Long largo = Long.parseLong(JOptionPane.showInputDialog("Ingrese un número LARGO SUFIJO L  5.000 millones"));
		Byte tipoByte = Byte.parseByte(JOptionPane.showInputDialog("Ingrese un número BYTE de -128 a 127"));
		Float flotante = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un número con decimales 7 DECIMALES"));
		Double doble = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número con decimales 15 DECIMALES"));
		char caracter = JOptionPane.showInputDialog("Ingrese un solo CARACTER").charAt(0);
		System.out.println("El valor ENTERO es:...   " + entero);
		System.out.println("El valor CORTO es:....   "+ corto);
		System.out.println("El valor LARGO es:....   "+ largo);
		System.out.println("El valor BYTE es:.....   "+ tipoByte);
		System.out.println("El valor FLOTANTE es..   "+ flotante);
		System.out.println("El valor DOBLE es:....   "+ doble);
		System.out.println("El valor CARACTER es:.   "+ caracter);
	}

}
