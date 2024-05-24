package holamundo;

import java.util.Scanner;

public class divdir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent=new Scanner(System.in);
		System.out.println("Escribe el primer numero");
		String num1= ent.nextLine();
		System.out.println("Escribe el segundo numero");
		String num2= ent.nextLine();
		System.out.println(Division(Double.parseDouble(num1),Double.parseDouble(num2)));
	}
	
	public static double Division(double a,double b) {
		return a/b;
	}

}
