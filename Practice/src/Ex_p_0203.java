import java.lang.invoke.ConstantBootstraps;
import java.util.Scanner;
public class Ex_p_0203 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		final int num2 = number;
		int oman;//������ ��
		int ilman;//���� ��
		int ilcheon;//õ�� ��
		int obak;//�����
		int ilbak;//���
		int oship;//���ʿ�
		int ship;//�ʿ�
		
		oman = num2/50000;
		ilman = (num2-(oman*50000))/10000;
		ilcheon = (num2-oman*50000-ilman*10000)/1000;
		obak = (num2-oman*50000-ilman*10000-ilcheon*1000)/500;
		ilbak = (num2-oman*50000-ilman*10000-ilcheon*1000-obak*500)/100;
		oship = (num2-oman*50000-ilman*10000-ilcheon*1000-obak*500-ilbak*100)/50;
		ship = (num2-oman*50000-ilman*10000-ilcheon*1000-obak*500-ilbak*100-oship*50)/10;
		System.out.println("������ ��: "+(int)Math.floor(oman)+"��");
		System.out.println("���� ��: "+(int)Math.floor(ilman)+"��");
		System.out.println("õ�� ��: "+(int)Math.floor(ilcheon)+"��");
		System.out.println("�����: "+(int)Math.floor(obak)+"��");
		System.out.println("���: "+(int)Math.floor(ilbak)+"��");
		System.out.println("���ʿ�: "+(int)Math.floor(oship)+"��");
		System.out.println("�ʿ�: "+(int)Math.floor(ship)+"��");
	}

}