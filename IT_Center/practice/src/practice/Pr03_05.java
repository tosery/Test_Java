package practice;
import java.util.Scanner;
public class Pr03_05 {
	public static void main(String[] args) {
		System.out.print("���� ���� 10���� �Է��Ͻÿ�>>");
		Scanner a = new Scanner(System.in);
		
		int num[] = new int[10];
		
		
		for(int i=0; i<num.length; i++) {		//�迭�� �Է¹����� �ֱ�
			num[i] = a.nextInt();
			if(i ==0)
				System.out.print("3�� ����� ");
			if(num[i]%3 == 0) {					
				System.out.print(num[i] + " ");
			}
		}
	}

}
