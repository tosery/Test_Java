package TEST;
import java.util.Scanner;
public class ex_p_0211_switch 
{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		switch(number)
		{
		case 3,4,5:
			System.out.println("봄");
			break;
		case 6,7,8:
			System.out.println("여름");
			break;
		case 9,10,11:
			System.out.println("가을");
			break;
		case 12,1,2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("잘못된 입력");
		}
	}

}
