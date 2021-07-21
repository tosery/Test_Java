
public class Ex0305 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++)
		{
			if (i%2 != 0) // 이거 외에도 i%2 ==1 이런식으로 할 수도 있다.
				continue;
			else
				sum += i;
		}
		System.out.println("1부터 100까지 짝수의 합은" + sum);
	}

}
