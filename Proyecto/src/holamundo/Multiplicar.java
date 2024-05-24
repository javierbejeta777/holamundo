package holamundo;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Multiplicar {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el primer numero"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el segundo numero"));
		Multiplicar(num1,num2,df);
	}
	
	public static void Multiplicar(int num1, int num2,DecimalFormat df) {
		float resultado = num1*num2;
		JOptionPane.showMessageDialog(null, num1 + " x " + num2 + " = " + df.format(resultado));
	}
}
