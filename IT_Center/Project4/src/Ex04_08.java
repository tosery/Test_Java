import java.util.Scanner;
public class Ex04_08 {

	public static void main(String[] args) {
		CurrencyConverter.setRate(1121);	//ȯ������
		
		
		while (true) {
			
			System.out.println("***���Ͻô� ȯ������ ��ȣ�� �Է����ּ���***");
			System.out.println("1. KWR �� Dollar");
			System.out.println("2. Dollar �� KWR");
			System.out.println("0. ����");
			System.out.print("��ȣ�Է� >>");
			
			Scanner a = new Scanner(System.in);
			
			int selectnum = a.nextInt();
			
			if(selectnum == 1) {
				System.out.println("------------------------------");
				System.out.println("ȯ���� �ݾ��� �Է����ּ���(����:KWR)");
				System.out.print("�ݾ��Է� >>");
				double kwr = a.nextInt();
				System.out.println(kwr + "���� " + CurrencyConverter.toDollar(kwr) + "�޷��Դϴ�.");
			}
			else if(selectnum == 2) {
				System.out.println("------------------------------");
				System.out.println("ȯ���� �ݾ��� �Է����ּ���(����:$)");
				System.out.print("�ݾ��Է� >>");
				double dollar = a.nextInt();
				System.out.println(dollar + "�޷��� " + CurrencyConverter.toKWR(dollar) + "�� �Դϴ�.");
			}
			else if(selectnum == 0) {
				System.out.println("�ý����� �����մϴ�...");
				break;
			}
			else
				System.out.println("�߸��� �Է��Դϴ�.");
			
		}
	}

}

