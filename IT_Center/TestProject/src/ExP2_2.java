import java.util.Scanner;
public class ExP2_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		if(number>=100)
			System.out.println("No, ���ڸ����� �Է�!");
		
		else if ((number-number%10)/10==(number%10))
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		else
			System.out.println("NO! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
	}

}
