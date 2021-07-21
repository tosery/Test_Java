import java.util.Scanner;
public class Ex_p_0207 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		if(num1<=200)
			if(num2<=200)
				System.out.println((num1 + "," + num2) + "는 사각형 안에 있습니다.");
		in.close();
	}

}
