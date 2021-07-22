package practice;
import java.util.Scanner;
public class Pr03_06 {

	public static void main(String[] args) {
		System.out.print("금액을 입력하시오>>");
		Scanner a = new Scanner(System.in);
		
		int money = a.nextInt();
		
		int []unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		for(int i=0; i<unit.length; i++) {
			int c = 0;
			if(i==0)
				c = money/unit[i];
			else
				c = (money%unit[i-1])/unit[i];
			
			if(c!=0)
				System.out.println(unit[i]+"원 짜리 : "+c+"개");
		}
	}

}
