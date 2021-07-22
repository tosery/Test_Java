
public class CurrencyConverter {
	private static double rate;
	
	public static double toDollar(double won) {
		return won/rate;	//원화 >> 달러
	}
	
	public static double toKWR(double dollar) {
		return dollar * rate;	//달러 >> 원화
	}
	
	public static void setRate(double r) {
		rate = r;		//환율 설정
	}
	
}
