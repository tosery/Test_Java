package TEST;
import java.util.Scanner;
public class ex_p_0212_if 
{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double num1 = in.nextDouble();
		String s = in.next();
		double num2 = in.nextDouble();
		
		if(s.equals("+"))
			System.out.println(num1+num2);
		else if(s.equals("-"))
			System.out.println(num1-num2);
		else if(s.equals("*"))
			System.out.println(num1*num2);
		else if(s.equals("/"))
		{
			if(num2 == 0)
				System.out.println("0으로 나눌 수 없습니다.");
			else
				System.out.println(num1/num2);
		}
		
		
	}

}
