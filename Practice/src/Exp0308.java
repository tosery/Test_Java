import java.util.Scanner;
public class Exp0308 
{

	public static void main(String[] args) 
	{
		System.out.print("���� �� ��? ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int [num];
		if(num>100||num<0)
		{
			System.out.println("100���� ���� ������ �Է��ϼ���.");
			sc.close();
			return;
		}
		else
		{	
			int i;
			for(i=0; i<num; i++)
			{
				arr[i] = (int)(Math.random()*100+1);
				for(int j=0;j<i;j++) //�ߺ�üũ!
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
