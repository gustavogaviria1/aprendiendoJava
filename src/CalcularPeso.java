import javax.swing.JOptionPane;

public class CalcularPeso {

	public static void main(String[] args) {
		String nombre;
		double estatura;
		int estatu, peso;
		String sexo;
		String rta = "";
		do {
			nombre = JOptionPane.showInputDialog("Ingrese el nombe de la persona....");
			estatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la estatura:....."));
			sexo = JOptionPane.showInputDialog("Ingrese el sexo M / F");
			estatu = (int)(estatura*100);

			 if(sexo.equalsIgnoreCase("m")) {
				 peso = estatu - 100;
				 System.out.println(nombre + " mide " + estatura + " metros de estatura y pesa  " + peso + " kilogramos");
			 }
			 else {
				 peso = estatu - 110;
				 System.out.println(nombre + " mide " + estatura + " metros de estatura y pesa  " + peso + " kilogramos");
			 }
			 rta = JOptionPane.showInputDialog("DESEA INGRESAR OTRO?...   S/N");
		}while(rta.equalsIgnoreCase("n") == false);

	} 

}
