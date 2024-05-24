package holamundo;

import java.util.Scanner;

public class Menu {
	
	public static void main(String [] args) {
		Scanner ent=new Scanner(System.in);
		int opcion=0;
		do {
			opcion=0;
			System.out.println("\t---Bienvenido a la calculadora---\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir");
			try {
			opcion=Integer.parseInt(ent.nextLine());
			}catch(NumberFormatException ex) {
				System.out.println("Numero no valido");
				opcion=0;
				break;
			}
			switch(opcion) {
			case 1:
				Sumar.main(null);
				break;
			case 2:
				Restar.main(null);
				break;
			case 3:
				Multiplicar.main(null);
				break;
			case 4:
				Dividir.main(null);
				break;
			case 5:
				System.out.println("ADIOOOOS");
				break;
			}
		}while(opcion!=5);
		System.out.println("Hola mundo");
	}

}
