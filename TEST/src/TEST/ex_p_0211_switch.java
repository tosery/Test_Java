package TEST;
import java.util.Scanner;
public class ex_p_0211_switch 
{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		switch(number)
		{
		case 3,4,5:
			System.out.println("��");
			break;
		case 6,7,8:
			System.out.println("����");
			break;
		case 9,10,11:
			System.out.println("����");
			break;
		case 12,1,2:
			System.out.println("�ܿ�");
			break;
		default:
			System.out.println("�߸��� �Է�");
		}
	}

}
