package practice;
import java.util.Scanner;
public class Pr03_04 {
	public static void main(String[] args) {
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
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
