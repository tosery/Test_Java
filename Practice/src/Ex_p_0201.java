import java.util.Scanner;
public class Ex_p_0201 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		float number = in.nextInt()/1216f;
		System.out.println("52000원은 $"+Math.round((number) * 100) / 100.0+"입니다.");

	}

}
