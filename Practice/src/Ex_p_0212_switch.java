import java.util.Scanner;
public class Ex_p_0212_switch 
{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double num1 = in.nextDouble();
		String s = in.next();
		double num2 = in.nextDouble();
		
		switch(s)
		{
			case "+": 
				System.out.println(num1+num2);
				break;
			case "-":
				System.out.println(num1-num2);
				break;
			case "*":
				System.out.println(num1*num2);
				break;
			case "/":
				if(num2 == 0)
				{
					System.out.println("0으로 나눌 수 없습니다.");
					break;
				}
				else
					System.out.println(num1/num2);
				
		}

	}

}
