
public class Add 
{

	public static void main(String[] args) 
	{
		String a1[] = new String[200];
		int sum = 0;
		
		for(int i=0; i<args.length;i++)
		{
			a1[i] = args[i];
			try 
			{
				sum += Integer.parseInt(a1[i]);
			}
			catch(NumberFormatException e)
			{
				continue;
			}

		}
		System.out.println("гу╟Х: " + sum);
	}

}
