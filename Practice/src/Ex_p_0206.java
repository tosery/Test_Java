import java.util.Scanner;
public class Ex_p_0206 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		final int num2 = number;
		int cnt = 0;
		int ship = 0;
		int il = 0;
		if(number>=100)
			System.out.println("No, µÎÀÚ¸®¼ö¸¸ ÀÔ·Â!");
		ship = num2/10;
		il = num2%10;
		if(ship==3||ship==6||ship==9)
			if(il==3||il==6||il==9)
				System.out.println("¹Ú¼öÂ¦Â¦");
			else
				System.out.println("¹Ú¼öÂ¦");
		if(ship!=3||ship!=6||ship!=9)
			if(il==3||il==6||il==9)
				System.out.println("¹Ú¼öÂ¦");
	
	}

}