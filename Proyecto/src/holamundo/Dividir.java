package holamundo;

import java.util.Scanner;

public class Dividir {
	public static void main (String args) {
		Scanner ent=new Scanner(System.in);
		String num1= ent.nextLine();
		String num2= ent.nextLine();
		Division(Double.parseDouble(num1),Double.parseDouble(num2));
	}
public static double Division(double a,double b) {
	return a/b;
}

}
