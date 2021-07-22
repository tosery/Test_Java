
import java.util.Arrays;
import java.util.Scanner;
//���⵵ try catch�� ���� ���� ��(���� ������ ��)
public class Seat 
{
	private String []seat_S = new String[10];
	private String []seat_A = new String[10];
	private String []seat_B = new String[10];

	Seat()
	{
	}
	
	public void reset()
	{
		
		for(int i = 0; i<seat_S.length ; i++)
		{
			seat_S[i] = "---  ";
		}
		for(int i = 0; i<seat_A.length ; i++)
		{
			seat_A[i] = "---  ";
		}
		for(int i = 0; i<seat_B.length ; i++)
		{
			seat_B[i] = "---  ";
		}
	}
	public void reserve()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�¼����� S(1), A(2), B(3)>>");
		int num106 = sc.nextInt();
		switch(num106)
		{
		case 1://S���
			System.out.println(Arrays.toString(this.seat_S));
			System.out.print("�¼���ȣ: ");
			int num107 = sc.nextInt();
			System.out.print("�̸�: ");
			String str = sc.next();
			this.seat_S[num107-1] = str;
			break;
		case 2://A���
			System.out.println(Arrays.toString(this.seat_A));
			System.out.print("�¼���ȣ: ");
			int num108 = sc.nextInt();
			System.out.print("�̸�: ");
			String str2 = sc.next();
			this.seat_A[num108-1] = str2;
			break;
		case 3://B���
			System.out.println(Arrays.toString(this.seat_B));
			System.out.print("�¼���ȣ: ");
			int num109 = sc.nextInt();
			System.out.print("�̸�: ");
			String str3 = sc.next();
			this.seat_B[num109-1] = str3;
			break;
		default:
			System.out.println("1~3�� �� �����ϼ���");
		}
	}
	public void view()
	{
		System.out.println("S���: " + Arrays.toString(this.seat_S));
		System.out.println("A���: " + Arrays.toString(this.seat_A));
		System.out.println("B���: " + Arrays.toString(this.seat_B));
		System.out.println("<<<��ȸ�� �Ϸ� �߽��ϴ�>>>");
	}
	public void cancel()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�¼����� S(1), A(2), B(3)");
		int num110 = sc.nextInt();
		switch(num110)//1�� S��� 2�� A��� 3�� B���
		{
		case 1://S���
			System.out.println(Arrays.toString(this.seat_S));
			System.out.print("�̸�: ");
			String str4 = sc.next();
			for(int i=0; i<seat_S.length;i++)
			{
				if(seat_S[i].equals(str4))
				{
					seat_S[i] = null;
					seat_S[i] = "---  ";
					System.out.println(str4+"�� �� ��Ұ� �Ϸ�Ǿ����ϴ�.");
				}
				if(i==seat_S.length-1)
				{
					System.out.println(str4 + "���� S��� ����ܿ� �����ϴ�.");
				}
			}
			break;
		case 2://A���
			System.out.println(Arrays.toString(this.seat_A));
			System.out.print("�̸�: ");
			String str5 = sc.next();
			for(int i=0; i<seat_A.length;i++)
			{
				if(seat_A[i].equals(str5))
				{
					seat_A[i] = null;
					seat_A[i] = "---  ";
					System.out.println(str5+"�� �� ��Ұ� �Ϸ�Ǿ����ϴ�.");
				}
				if(i==seat_A.length-1)
				{
					System.out.println(str5 + "���� A��� ����ܿ� �����ϴ�.");
				}
			}
			break;
		case 3://B���
			System.out.println(Arrays.toString(this.seat_B));
			System.out.print("�̸�: ");
			String str6 = sc.next();
			for(int i=0; i<seat_B.length;i++)
			{
				if(seat_B[i].equals(str6))
				{
					seat_B[i] = null;
					seat_B[i] = "---  ";
					System.out.println(str6+"�� �� ��Ұ� �Ϸ�Ǿ����ϴ�.");
				}
				if(i==seat_B.length-1)
				{
					System.out.println(str6 + "���� B��� ����ܿ� �����ϴ�.");
				}
			}
			break;
		default:
			System.out.println("1~3�� �� �����ϼ���");

		}
	}
}