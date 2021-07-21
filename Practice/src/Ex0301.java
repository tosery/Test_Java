
public class Ex0301 {

	public static void main(String[] args) {
		int i;
		int j=0;
		
		for(i=1;i<=10;i++)
		{
			j +=i;
			System.out.print(i);
			if(i==10)
			{
				System.out.print("=");
				System.out.print(j);
			}
			else
				System.out.print("+");
		}
	}

}
