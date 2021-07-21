import java.util.Scanner;

public class CalcApp {

	public void run() 
	{
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>>>");
		
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		String op = sc.next();
		char c = op.charAt(0);
		
		switch(c)
		{
			case '+':
				Add add1 = new Add();
				add1.setValue(a1, a2);
				System.out.println("����� "+add1.calculate());
				
				break;
			case '-':
				Sub sub1 = new Sub();
				sub1.setValue(a1, a2);
				System.out.println("����� "+sub1.calculate());
				break;
			case '*':
				Mul mul1 = new Mul();
				mul1.setValue(a1, a2);
				System.out.println("����� "+mul1.calculate());
				break;
			case '/':
				Div div1 = new Div();
				div1.setValue(a1, a2);
				System.out.println("����� "+div1.calculate());
				break;
			default :
				System.out.println("�����ڸ� �ȹٷ� �Է����ּ���!");
		}
		sc.close();
	}
}

class Add
{
	private int a;
	private int b;
	
	void setValue(int _a, int _b){
		a = _a;
		b = _b;
	}
	
	public int calculate(){
		//System.out.println(a+b);
		return a+b;
	}
}

class Sub
{
	private int a;
	private int b;
	
	void setValue(int _a, int _b){
		a = _a;
		b = _b;
	}
	
	public int calculate(){
		//System.out.println(a+b);
		return a-b;
	}
}

class Mul
{
	private int a;
	private int b;
	
	void setValue(int _a, int _b){
		a = _a;
		b = _b;
	}
	
	public int calculate(){
		//System.out.println(a+b);
		return a*b;
	}
}

class Div
{
	private int a;
	private int b;
	
	void setValue(int _a, int _b){
		a = _a;
		b = _b;
	}
	
	public int calculate(){
		//System.out.println(a+b);
		
		if(b==0)
		{
			System.out.println("0���� ������ �����!");
			return -9999;
		}
		
		return a/b;
	}
}
