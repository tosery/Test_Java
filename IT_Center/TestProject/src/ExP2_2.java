import java.util.Scanner;
public class ExP2_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		if(number>=100)
			System.out.println("No, 두자리수만 입력!");
		
		else if ((number-number%10)/10==(number%10))
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		else
			System.out.println("NO! 10의 자리와 1의 자리가 다릅니다.");
	}

}
