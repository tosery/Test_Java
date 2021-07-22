import java.util.Scanner;
abstract class Converter 
{//정해진 것만 쓰시오!!!!! 추상클래스
	abstract protected double convert(double src);
	abstract protected String srcString();
	abstract protected String destString();
	protected double ratio;
	
	public void run()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println(srcString() + "을(를)" + destString() + "로 바꿉니다.");
		System.out.print(srcString() + "을(를) 입력하세요>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: " + res + destString() + "입니다");
		scanner.close();
	}
	
}
