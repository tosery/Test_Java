
public class Exp0307 
{

	public static void main(String[] args) 
	{
		int arr[] = new int [10];
		double sum = 0;
		for(int i=0; i<10;i++)
		{
			arr[i] = (int)(Math.random()*10+1); 
			System.out.print(arr[i]+" ");
			sum += arr[i];
		}
		System.out.println();
		System.out.println(sum/10);
	}

}
