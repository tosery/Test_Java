
public class Exp0310 
{

	public static void main(String[] args) 
	{
		int arr[][] = new int [4][4];
		int cnt0 = 0;
		int cnt1 = 0;
		for(int i=0; i<4;i++)
		{
			for(int j=0; j<4; j++)
			{
				if((int)(Math.random()*2+1)==1)//랜덤 숫자 입력하기
				{
					if(cnt1 >=10)
					{
						j--;
						continue;
					}
					else 
					{
						arr[i][j] = (int)(Math.random()*10+1);
						cnt1++;
						System.out.print(arr[i][j] + "\t");
					}
				}
				else
				{
					if(cnt0 >=6)
					{
						j--;
						continue;
					}
					else 
					{
						arr[i][j] = 0;
						cnt0++;
						System.out.print(arr[i][j] + "\t");
					}
				}
			}
			System.out.println();
		}
	}

}
