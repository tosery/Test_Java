import java.util.Scanner;
public class Ex_p_0204 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		int num1count=0;
		int num2count=0;
		int num3count=0;
		int i=0;
		int j=0;
		int k=0;
		
		if (num1>num2)
			num1count+=1;
		else if(num1<num2)
			num2count+=1;
		else if(num1>num3)
			num1count+=1;
		else if(num3<num1)
			num3count+=1;
		else if(num2>num3)
			num2count+=1;
		else if(num2<num3)
			num3count+=1;
		else
			System.out.println("오류");
		
		if(num1count == 1)
		{
			System.out.println(num1);
		}
		else if(num2count == 1)
		{
			System.out.println(num2);
		}
		else if(num3count == 1)
		{
			System.out.println(num3);
		}
		else
			System.out.println("오류");
	}

}

