package practice;

interface PhoneInterface {		//인터페이스 선언
	final int TIMEOUT = 10000; 	//상수 필드 선어
	void sendCall();			//추상 메소드
	void receiveCall();			//추메
	default void printLogo() {		//default 메소드
		System.out.println(" ** phone ** ");
	}
}

interface MobilePhoneInterface extends PhoneInterface {
		void sendSMS();
		void receiveSMS();
}
interface MP3Interface {		//인터페이스 선언
	public void play();
	public void stop();
}
class PDA {
	public int calculate(int x, int y) {
		return x + y;
	}
}
/*SmartPhone 클래스는 PDA를 상속받고
MobilePhoneInterface와 MP3Interface 인터페이스에 선언된 
추상 메도스를 모두 구현 */
class SmartPhone extends PDA implements
MobilePhoneInterface, MP3Interface {
	// MobilePhoneInterface의 추상 메소드 구현
	@Override
	public void sendCall() {
		System.out.println("따르릉~");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화 옴");
	}
	@Override
	public void sendSMS() {
		System.out.println("문자 감");
	}
	@Override
	public void receiveSMS() {
		System.out.println("문자 옴");
	}
	
	//MP3Interface의 추상 메소드 구현
	@Override
	public void play() {
		System.out.println("음악 연주함");
	}
	@Override
	public void stop() {
		System.out.println("음악 중단");
	}
	 
	//추가로 작성한 메소드
	public void schedule() {
		System.out.println("일정 관리합니다.");
	}
}
