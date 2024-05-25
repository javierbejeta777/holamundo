package holamundo;

import java.util.Scanner;

public class Multiplicar {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Escribe el primer numero");
		int num1 = Integer.parseInt(ent.nextLine());
		
		System.out.println("Escribe el segundo numero");
		int num2 = Integer.parseInt(ent.nextLine());
		
		System.out.println(Multiplicar(num1,num2));
	}
	
	public static float Multiplicar(int num1, int num2) {
		float resultado = num1*num2;
		return resultado;
	}
}
