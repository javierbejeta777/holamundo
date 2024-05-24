package holamundo;

import java.util.Scanner;

public class Sumar {
	public static void main(String[]args) {
		Scanner ent=new Scanner(System.in);
		
		System.out.println("Indique el primer numero:");
		int num1=Integer.parseInt(ent.nextLine().replace(",", "."));
		System.out.println("Indique el segundo numero:");
		int num2=Integer.parseInt(ent.nextLine().replace(",", "."));
		System.out.println(suma(num1,num2));
		
	}

	public static int suma(int num1,int num2) {
		return num1+num2;
	}

}
