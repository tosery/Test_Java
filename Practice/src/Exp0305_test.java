import java.util.Scanner;

public class Exp0305_test 
{
	public static void main(String[] args) 
	{
		int arr1[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.print("10개 정수 입력->");

		for(int i=0; i<arr1.length; ++i)
		{
			arr1[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr1.length; ++i)
		{
			if(arr1[i]%3 == 0) {
				System.out.println(arr1[i]);
			}
		}
	}
}
