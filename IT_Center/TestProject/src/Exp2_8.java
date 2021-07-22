import java.util.Scanner;
public class Exp2_8 
{

	public static boolean inRect(int x, int y, int rect_x1, int rect_y1, int rect_x2, int rect_y2)
	{
		if((x>=rect_x1 && x<=rect_x2)&&(y>=rect_y1 && y<=rect_y2))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		System.out.println("두 점(x1,y1), (x2,y2)의 좌표를 입력하세요");
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		int x2 = in.nextInt();
		int y2 = in.nextInt();
		
		if(inRect(x1,y1, 100, 100, 200, 200)||
			inRect(x1,y2, 100, 100, 200, 200)||
			inRect(x2,y1, 100, 100, 200, 200)||
			inRect(x2,y2, 100, 100, 200, 200))
			
			System.out.println("사각형이 겹칩니다.");
		
		else if(inRect(100,100,x1,y1,x2,y2)||
				inRect(100,200,x1,y1,x2,y2)||
				inRect(200,100,x1,y1,x2,y2)||
				inRect(200,200,x1,y1,x2,y2))
			System.out.println("사각형이 겹칩니다.");
		else
		{
			System.out.println("사각형이 겹치지 않습니다.");
		}
		in.close();
		
	}

}
