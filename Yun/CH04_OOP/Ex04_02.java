
public class Ex04_02 {

	public static void main(String[] args) {
		MyExp number1 = new MyExp();
//		number1.base = 2;
//		number1.exp = 3;
		number1.setBase(2);
		number1.setExp(3);
		
		double price;

		MyExp number2 = new MyExp();
//		number2.base = 3;
//		number2.exp = 4;
		number2.setBase(3);
		number2.setExp(4);

 		System.out.println("2�� 3�� = " + number1.getValue());
 		System.out.println("3�� 4�� = " + number2.getValue());
	
	}

}
