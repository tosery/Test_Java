import java.util.Scanner;
public class Ex04_08 {

	public static void main(String[] args) {
		CurrencyConverter.setRate(1121);	//환율설정
		
		
		while (true) {
			
			System.out.println("***원하시는 환전유형 번호를 입력해주세요***");
			System.out.println("1. KWR → Dollar");
			System.out.println("2. Dollar → KWR");
			System.out.println("0. 종료");
			System.out.print("번호입력 >>");
			
			Scanner a = new Scanner(System.in);
			
			int selectnum = a.nextInt();
			
			if(selectnum == 1) {
				System.out.println("------------------------------");
				System.out.println("환전할 금액을 입력해주세요(단위:KWR)");
				System.out.print("금액입력 >>");
				double kwr = a.nextInt();
				System.out.println(kwr + "원은 " + CurrencyConverter.toDollar(kwr) + "달러입니다.");
			}
			else if(selectnum == 2) {
				System.out.println("------------------------------");
				System.out.println("환전할 금액을 입력해주세요(단위:$)");
				System.out.print("금액입력 >>");
				double dollar = a.nextInt();
				System.out.println(dollar + "달러는 " + CurrencyConverter.toKWR(dollar) + "원 입니다.");
			}
			else if(selectnum == 0) {
				System.out.println("시스템을 종료합니다...");
				break;
			}
			else
				System.out.println("잘못된 입력입니다.");
			
		}
	}

}

