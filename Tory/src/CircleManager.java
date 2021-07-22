import java.util.Scanner;

public class CircleManager 
{
	public void run() 
	{
		Scanner scanner = new Scanner(System.in);
		
		Circle c[] = new Circle[3];
		
		for(int i=0; i<c.length; i++)
		{
			System.out.print((i+1)+"번 째" + "x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			
			c[i] = new Circle(x,y,radius);
		}
		
//		for(int i=0; i<c.length; i++)
//		{
//			c[i].show(); //9번째 줄 Circle의 객체변수 c
//		}
		double max =0;
		int maxIndex = 0;
		for(int i=0; i<c.length; i++)
		{
			double square = c[i].getSquare();
			if(square > max)
			{
				max = square;
				maxIndex = i;
			}	
		}
		System.out.print("가장 면적이 큰 원은: ");
		c[maxIndex].show();
				
		scanner.close();
	}

}
