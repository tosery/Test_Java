import java.util.Scanner;
abstract class Converter 
{//������ �͸� ���ÿ�!!!!! �߻�Ŭ����
	abstract protected double convert(double src);
	abstract protected String srcString();
	abstract protected String destString();
	protected double ratio;
	
	public void run()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println(srcString() + "��(��)" + destString() + "�� �ٲߴϴ�.");
		System.out.print(srcString() + "��(��) �Է��ϼ���>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ���: " + res + destString() + "�Դϴ�");
		scanner.close();
	}
	
}
