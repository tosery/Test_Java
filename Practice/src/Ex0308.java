import java.util.Scanner;
public class Ex0308 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int intArray[] = new int[5];
		double sum = 0;
		
		for (int i = 0; i < intArray.length; i++)
			intArray[i] = a.nextInt();
		
		for (int i = 0; i < intArray.length; i++)
			sum += intArray[i];
		System.out.println("�迭 ������ �����" + sum/intArray.length + "�Դϴ�.");
	}

}
