import java.util.Scanner;
public class Exp2_9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float num1 = in.nextFloat(); //���� �߽�x
		float num2 = in.nextFloat(); //���� �߽�y
		float r = in.nextFloat();//������
		float x = in.nextFloat();
		float y = in.nextFloat();
		
		if((x-num1)<r ||(y-num2)<r)
			System.out.println("���ȿ� �ִ�.");
		else
			System.out.println("����");
		
		
	}

}
