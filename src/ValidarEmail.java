import javax.swing.JOptionPane;

public class ValidarEmail {

	public static void main(String[] args) {

		boolean siArroba = false;
		boolean siPuntos = false;
		String correoElectronico = JOptionPane.showInputDialog("Ingrese el Correo Electrónico");
		for (int i=0; i<correoElectronico.length(); i++) {
			if(correoElectronico.charAt(i) == '@') {
				siArroba = true;
			}
			if(correoElectronico.charAt(i) == '.') {
				siPuntos = true;
			}
		}
		if(siArroba == true && siPuntos == true) {
			System.out.println("!!!!!CORREO INGRESADO CORRECTAMENTE!!!!!");
		}
		else {
			System.out.println("Correo incorrecto, intente de nuevo");
		}
			
	
	}

}
