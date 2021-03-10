import javax.swing.JOptionPane;

public class Matrices {

	public static void main(String[] args) {
//		double [][] intereses = new double[6][6];
//		double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor base....  "));
//		for (int j=0; j<intereses.length; j++) {
//			intereses[0][j] = base;
//		}
//		for(int i=1; i<intereses.length; i++) {
//			double porc=10;
//			for(int j=0; j<intereses.length; j++) {
//				intereses[i][j] = intereses[(i-1)][j]*(1+(porc/100));
//				porc++;
//			}
//		}
//		System.out.println("   10%   |   11%    |   12%    |   13%    |   14%    |   15%    |");
//		for (int j=0; j<intereses.length; j++) {
//			System.out.printf("%1.2f", intereses[0][j]);
//			System.out.print(" | ");
//		}
//		for (int i=1; i<intereses.length; i++) {
//			System.out.println();
//			for(int j=0; j<intereses.length; j++) {
//				System.out.printf("%1.2f", intereses[i][j]);
//				System.out.print(" | ");
//			}
//		}
		
//==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>
//==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>==>>
		double [][] intereses = new double[6][6];
		double acumulado;
		double interes = 0.01;
		
		for(int i=0; i<intereses.length; i++) {
			intereses[0][i] = 10000;
			acumulado = 10000;
			for(int j=1; j<intereses.length; j++) {
				acumulado = acumulado+(acumulado*interes);
				intereses[i][j] = acumulado;
				interes = interes + 0.01;
			}
		}
		
		for(int i=0; i<intereses.length; i++) {
			System.out.println();
			for(int j=0; i<intereses.length; j++) {
				System.out.printf("%1.2f", intereses[i][j]);
				System.out.print(" | ");
			}
		}
	
	
	}
}
