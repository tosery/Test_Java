
public class Average 
{

	public static void main(String[] args) 
	{
		int sum = 0;

			for(int i = 0; i<args.length; i++)
			{
				sum += Integer.parseInt(args[i]);
				if(i==(args.length-1))
				{
					System.out.print("ЦђБе: " + sum/(args.length));
				}
			}
			
	}

}
