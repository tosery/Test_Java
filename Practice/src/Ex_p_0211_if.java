import java.util.Scanner;
public class Ex_p_0211_if 
{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12)>>");
		int number = in.nextInt();
		if(number==3||number==4||number==5)
			System.out.println("봄");
		else if(number==6||number==7||number==8)
			System.out.println("여름");
		else if(number==9||number==10||number==11)
			System.out.println("가을");
		else if(number==12||number==1||number==2)
			System.out.println("겨울");
		else
			System.out.println("잘못입력");
		
	}

}
