
import java.util.Arrays;
import java.util.Scanner;
//여기도 try catch로 오류 잡을 것(최종 수정할 때)
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
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		int num106 = sc.nextInt();
		switch(num106)
		{
		case 1://S등급
			System.out.println(Arrays.toString(this.seat_S));
			System.out.print("좌석번호: ");
			int num107 = sc.nextInt();
			System.out.print("이름: ");
			String str = sc.next();
			this.seat_S[num107-1] = str;
			break;
		case 2://A등급
			System.out.println(Arrays.toString(this.seat_A));
			System.out.print("좌석번호: ");
			int num108 = sc.nextInt();
			System.out.print("이름: ");
			String str2 = sc.next();
			this.seat_A[num108-1] = str2;
			break;
		case 3://B등급
			System.out.println(Arrays.toString(this.seat_B));
			System.out.print("좌석번호: ");
			int num109 = sc.nextInt();
			System.out.print("이름: ");
			String str3 = sc.next();
			this.seat_B[num109-1] = str3;
			break;
		default:
			System.out.println("1~3번 중 선택하세요");
		}
	}
	public void view()
	{
		System.out.println("S등급: " + Arrays.toString(this.seat_S));
		System.out.println("A등급: " + Arrays.toString(this.seat_A));
		System.out.println("B등급: " + Arrays.toString(this.seat_B));
		System.out.println("<<<조회를 완료 했습니다>>>");
	}
	public void cancel()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("좌석구분 S(1), A(2), B(3)");
		int num110 = sc.nextInt();
		switch(num110)//1은 S등급 2는 A등급 3은 B등급
		{
		case 1://S등급
			System.out.println(Arrays.toString(this.seat_S));
			System.out.print("이름: ");
			String str4 = sc.next();
			for(int i=0; i<seat_S.length;i++)
			{
				if(seat_S[i].equals(str4))
				{
					seat_S[i] = null;
					seat_S[i] = "---  ";
					System.out.println(str4+"님 의 취소가 완료되었습니다.");
				}
				if(i==seat_S.length-1)
				{
					System.out.println(str4 + "님이 S등급 고객명단에 없습니다.");
				}
			}
			break;
		case 2://A등급
			System.out.println(Arrays.toString(this.seat_A));
			System.out.print("이름: ");
			String str5 = sc.next();
			for(int i=0; i<seat_A.length;i++)
			{
				if(seat_A[i].equals(str5))
				{
					seat_A[i] = null;
					seat_A[i] = "---  ";
					System.out.println(str5+"님 의 취소가 완료되었습니다.");
				}
				if(i==seat_A.length-1)
				{
					System.out.println(str5 + "님이 A등급 고객명단에 없습니다.");
				}
			}
			break;
		case 3://B등급
			System.out.println(Arrays.toString(this.seat_B));
			System.out.print("이름: ");
			String str6 = sc.next();
			for(int i=0; i<seat_B.length;i++)
			{
				if(seat_B[i].equals(str6))
				{
					seat_B[i] = null;
					seat_B[i] = "---  ";
					System.out.println(str6+"님 의 취소가 완료되었습니다.");
				}
				if(i==seat_B.length-1)
				{
					System.out.println(str6 + "님이 B등급 고객명단에 없습니다.");
				}
			}
			break;
		default:
			System.out.println("1~3번 중 선택하세요");

		}
	}
}