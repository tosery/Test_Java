import java.util.Scanner;
public class Ex_p_0211_if 
{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���(1~12)>>");
		int number = in.nextInt();
		if(number==3||number==4||number==5)
			System.out.println("��");
		else if(number==6||number==7||number==8)
			System.out.println("����");
		else if(number==9||number==10||number==11)
			System.out.println("����");
		else if(number==12||number==1||number==2)
			System.out.println("�ܿ�");
		else
			System.out.println("�߸��Է�");
		
	}

}
