
import java.util.Scanner;
public class Exp0412 {

	public static void main(String[] args) 
	{
		//Seat 클래스 존재.
		Seat st = new Seat();
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
//try catch로 문자 받는 오류 잡을 것 (최종 수정할 때)
		while(true)
		{
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >>");
			int num =  sc.nextInt();
			if(!(num>=1 && num<=4))
			{
				System.out.println("1~4번 중 선택하세요");
				continue;
			}
		
			if(cnt == 0)
			{
				st.reset(); //전 좌석 초기화 
				cnt++;
			}
			
			switch(num)
			{
			case 1:
				st.reserve();
				break;
			case 2:
				st.view();
				break;
			case 3:
				st.cancel();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
	
}

