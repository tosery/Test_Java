public class Test3 
{
	//in x out x
	static void method01() {
		System.out.println("�ȳ��");
		System.out.println("�ϼ���");
	}
	
	//in o out x
	static void method02(int a, int b) {
		int c = a + b;
		System.out.println("���Ѱ��=" + c);
	}
	
	//in x out o
	static int method03() {
		int c = 100;
		return c;
	}
	
	//in o out o
	static int method04(int a, int b) {
		int c = a + b;
		return c;
	}
	
	//�迭in
	static void method05(int[] arr) {
		arr[0] = arr[0] + 15;
	}
	
	static void method06(int g) {
		g = g + 11;
	}
	
	public static void main(String[] args) 
	{
		method01();
		
		method02(3, 4);
		int x = 10, y = 32;
		method02(x, y);
		
		int c = method03();
		System.out.println("���ϰ�: " + c);
		
		int f = method04(200, 300);
		System.out.println("f == " + f);
		
		System.out.println(method04(20, 50));
		
		
		int arr1[] = new int[3];
		arr1[0] = 11;
		arr1[1] = 23;
		
		method05(arr1);
		
		System.out.println("arr1[0]�� ���� �ٲ������ Ȯ�� = " + arr1[0]);
		// ->>method05�� ������ ���������� main�� arr1[0]�� �ٲ�
		// ->>�迭�� reference�̱� ������ ������ ��� ��
		// ->>int, double���� value�� ���ϰ��� �־�� main�� ����
		
		
		int g = 10;
		method06(g);
		System.out.println("g == " + g);
		
	}

}
