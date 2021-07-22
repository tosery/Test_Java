import java.util.Scanner;
public class Exp2_9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float num1 = in.nextFloat(); //원의 중심x
		float num2 = in.nextFloat(); //원의 중심y
		float r = in.nextFloat();//반지름
		float x = in.nextFloat();
		float y = in.nextFloat();
		
		if((x-num1)<r ||(y-num2)<r)
			System.out.println("원안에 있다.");
		else
			System.out.println("오류");
		
		
	}

}
