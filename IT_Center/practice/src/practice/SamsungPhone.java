package practice;

interface PhoneInterface {		//인터페이스 선언
	/*static final*/ int TIMEOUT = 10000; 	//상수 필드 선어, static 생략함.
	/* abstract*/ void sendCall();			//추상 메소드
	/* abstract*/ void receiveCall();			//추메, 
	default void printLogo() {		//default 메소드
		System.out.println(" ** phone ** ");
	}
}

public class SamsungPhone implements PhoneInterface, AInterface {
	//PhoneInterface의 모든 메소드 구현
	@Override
	public void sendCall() {
		System.out.println("띠리ㄹ이~");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}
	
	//메소드 추가 작성, flash는 인터페이스에서 상속 안받았음.
	public void flash() {
		System.out.println("전화기에 불 켜짐");
		System.out.println(PhoneInterface.TIMEOUT);
		System.out.println(AInterface.TIMEOUT);
	}
}


