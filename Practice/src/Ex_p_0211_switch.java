import java.util.Scanner;
public class Ex_p_0211_switch 
{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		switch(number)
		{
		case 3:
			System.out.println("봄");
			break;
		case 4:
			System.out.println("봄");
			break;
		case 5:
			System.out.println("봄");
			break;
		case 6:
			System.out.println("여름");
			break;
		case 7:
			System.out.println("여름");
			break;
		case 8:
			System.out.println("여름");
			break;
		case 9:
			System.out.println("가을");
			break;
		case 10:
			System.out.println("가을");
			break;
		case 11:
			System.out.println("가을");
			break;
		case 12:
			System.out.println("겨울");
			break;
		case 1:
			System.out.println("겨울");
			break;
		case 2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("잘못된 입력");
		}
	}

}