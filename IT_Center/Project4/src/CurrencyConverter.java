
public class CurrencyConverter {
	private static double rate;
	
	public static double toDollar(double won) {
		return won/rate;	//��ȭ >> �޷�
	}
	
	public static double toKWR(double dollar) {
		return dollar * rate;	//�޷� >> ��ȭ
	}
	
	public static void setRate(double r) {
		rate = r;		//ȯ�� ����
	}
	
}
