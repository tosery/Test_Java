import java.util.Scanner;
public class Exp0308 
{

	public static void main(String[] args) 
	{
		System.out.print("정수 몇 개? ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int [num];
		if(num>100||num<0)
		{
			System.out.println("100보다 작은 정수를 입력하세요.");
			sc.close();
			return;
		}
		else
		{	
			int i;
			for(i=0; i<num; i++)
			{
				arr[i] = (int)(Math.random()*100+1);
				for(int j=0;j<i;j++) //중복체크!
				{
					if((i>0)&&arr[i]==arr[j])
					{
						i--;
						break;
					}
				}
			}
			for(i=0;i<num;i++)
			{
				System.out.print(arr[i] + "\t");
				if((i+1)%10==0)
				{
					System.out.println();
				}
			}
		}
		sc.close();
	}

}
