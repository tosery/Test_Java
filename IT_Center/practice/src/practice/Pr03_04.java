package practice;
import java.util.Scanner;
public class Pr03_04 {
	public static void main(String[] args) {
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char c = s.charAt(0);
		
		for(char a=c; a>='a'; a--) {
			for(char d='a'; d<=a; d++)
				System.out.print(d);
			System.out.println();
		}
		

	}

}
