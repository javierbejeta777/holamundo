package holamundo;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Operaciones {
	
	public static void Multiplicar() {
		DecimalFormat df = new DecimalFormat("#.##");
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el primer numero"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el segundo numero"));
		float resultado = num1*num2;
		JOptionPane.showMessageDialog(null, num1 + " x " + num2 + " = " + df.format(resultado));
	}
	
	public static void main(String[] args) {
		multiplicar();
	}

}
