
package practice;
import java.util.Scanner;

public class Pr03_03 {

	public static void main(String[] args) {
		System.out.print("������ �Է��Ͻÿ�>>");
		Scanner a = new Scanner(System.in);
		
		for(int i=a.nextInt(); i>0; i--) {
			for(int j=0; j<i; j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
