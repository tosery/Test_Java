public class Test3 
{
	//in x out x
	static void method01() {
		System.out.println("안녀엉");
		System.out.println("하세용");
	}
	
	//in o out x
	static void method02(int a, int b) {
		int c = a + b;
		System.out.println("더한결과=" + c);
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
	
	//배열in
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
		System.out.println("리턴값: " + c);
		
		int f = method04(200, 300);
		System.out.println("f == " + f);
		
		System.out.println(method04(20, 50));
		
		
		int arr1[] = new int[3];
		arr1[0] = 11;
		arr1[1] = 23;
		
		method05(arr1);
		
		System.out.println("arr1[0]의 값이 바뀌엇는지 확인 = " + arr1[0]);
		// ->>method05의 리턴이 없었음에도 main의 arr1[0]이 바뀜
		// ->>배열은 reference이기 때문에 리턴이 없어도 됨
		// ->>int, double같은 value는 리턴값이 있어야 main에 적용
		
		
		int g = 10;
		method06(g);
		System.out.println("g == " + g);
		
	}

}
