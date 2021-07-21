import java.util.Scanner;
public class Exp0306 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int []unit = {50000,10000,1000,500,100,50,10,1};
		int unitcnt[] = new int[8];
		int sc1 = sc.nextInt(); 
		for(int i = 0; i<8; i++)
		{
			unitcnt[i] = sc1/unit[i];
			sc1 = sc1-unitcnt[i]*unit[i];
			if(unitcnt[i] != 0)
			{
				System.out.println(unit[i]+ "¿ø Â¥¸®: " + unitcnt[i]);
			}
		}
		sc.close();
	}

}
