import java.util.Scanner;
public class Pr04_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		
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
				System.out.println("0으로 나눌 수 없습니다.");
			else {
			Div dv = new Div();
			dv.setValue(a, b);
			System.out.println(dv.calculate());
			}
		}
	}

}
