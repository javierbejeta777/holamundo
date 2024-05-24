package holamundo;

public class dividir {

	public static void main(String[]args) {
		Scanner ent=new Scanner(System.in);
		
		System.out.println("Indique el primer numero:");
		int num1=Integer.parseInt(ent.nextLine().replace(",", "."));
		System.out.println("Indique el segundo numero:");
		int num2=Integer.parseInt(ent.nextLine().replace(",", "."));
		System.out.println(resta(num1,num2));
		
	}
public double Division(double a,double b) {
	return a/b;
}

}
