import java.util.Scanner;
public class Exp2_10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double num1 = in.nextDouble();
		double num2 = in.nextDouble();
		double r1 = in.nextDouble();
		double x = in.nextDouble();
		double y = in.nextDouble();
		double r2 = in.nextDouble();
		double a = Math.abs(x-num1);
		double b = Math.abs(y-num2);
		double d = Math.sqrt(a*a+b*b);
		if(d>(r1+r2))
			System.out.println("두 원은 안 겹친다.");
		else
			System.out.println("두 원은 겹친다.");
		
	}

}
