
public class Exp0313 
{

	public static void main(String[] args) 
	{
		int arr[] = new int[99];
		for(int i=0; i<99;i++)
		{
			arr[i]=i+1;
			if(arr[i]<10 && arr[i]%3==0)
			{
				System.out.println((i+1)+"¹Ú¼ö Â¦");
			}
			else if(arr[i]>=10 && arr[i]<=99)
			{
				if(arr[i]/10==3||arr[i]/10==6||arr[i]/10==9)
				{
					if((arr[i]%10)==3||(arr[i]%10)==6||(arr[i]%10)==9)
					{
						System.out.println((i+1)+"¹Ú¼ö Â¦Â¦");
					}
					else if((arr[i]%10)!=3||(arr[i]%10)!=6||(arr[i]%10)!=9)
					{
						System.out.println((i+1)+"¹Ú¼ö Â¦");
					}
				}
					
			}
		}
	}

}
