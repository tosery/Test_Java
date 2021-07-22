package practice;
import java.util.Scanner;
public class Pr03_05 {
	public static void main(String[] args) {
		System.out.print("양의 정수 10개를 입력하시오>>");
		Scanner a = new Scanner(System.in);
		
		int num[] = new int[10];
		
		
		for(int i=0; i<num.length; i++) {		//배열에 입력받은수 넣기
			num[i] = a.nextInt();
			if(i ==0)
				System.out.print("3의 배수는 ");
			if(num[i]%3 == 0) {					
				System.out.print(num[i] + " ");
			}
		}
	}

}
