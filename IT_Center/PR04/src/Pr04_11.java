import java.util.Scanner;
public class Pr04_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>>");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		String asmd = sc.next();
		
		if(asmd.equals("+")) {
			Add ad = new Add();
			ad.setValue(a, b);
			System.out.println(ad.calculate());
		}
		else if(asmd.equals("-")){
			Sub sb = new Sub();
			sb.setValue(a, b);
			System.out.println(sb.calculate());
		}
		else if(asmd.equals("*")){
			Mul ml = new Mul();
			ml.setValue(a, b);
			System.out.println(ml.calculate());
		}
		else if(asmd.equals("/")){
			if(b == 0)
				System.out.println("0���� ���� �� �����ϴ�.");
			else {
			Div dv = new Div();
			dv.setValue(a, b);
			System.out.println(dv.calculate());
			}
		}
	}

}
