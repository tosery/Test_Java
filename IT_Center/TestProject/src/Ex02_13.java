
public class Ex02_13 {

	public static void main(String[] args) {
		char grade = 'C';
				switch (grade)
				{
				case 'A':
				case 'B':
					System.out.println("�� ���Ͽ����ϴ�.");
					break;
				case 'C':
				case 'D':
					System.out.println("�� �� ����ϼ���.");
					break;
				case 'F':
					System.out.println("���� �б⿡ �ٽ� �����ϼ���.");
					break;
					default:
						System.out.println("�߸��� �����Դϴ�.");
				}
	}

}
