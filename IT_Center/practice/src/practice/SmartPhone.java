package practice;

interface PhoneInterface {		//�������̽� ����
	final int TIMEOUT = 10000; 	//��� �ʵ� ����
	void sendCall();			//�߻� �޼ҵ�
	void receiveCall();			//�߸�
	default void printLogo() {		//default �޼ҵ�
		System.out.println(" ** phone ** ");
	}
}

interface MobilePhoneInterface extends PhoneInterface {
		void sendSMS();
		void receiveSMS();
}
interface MP3Interface {		//�������̽� ����
	public void play();
	public void stop();
}
class PDA {
	public int calculate(int x, int y) {
		return x + y;
	}
}
/*SmartPhone Ŭ������ PDA�� ��ӹް�
MobilePhoneInterface�� MP3Interface �������̽��� ����� 
�߻� �޵����� ��� ���� */
class SmartPhone extends PDA implements
MobilePhoneInterface, MP3Interface {
	// MobilePhoneInterface�� �߻� �޼ҵ� ����
	@Override
	public void sendCall() {
		System.out.println("������~");
	}
	@Override
	public void receiveCall() {
		System.out.println("��ȭ ��");
	}
	@Override
	public void sendSMS() {
		System.out.println("���� ��");
	}
	@Override
	public void receiveSMS() {
		System.out.println("���� ��");
	}
	
	//MP3Interface�� �߻� �޼ҵ� ����
	@Override
	public void play() {
		System.out.println("���� ������");
	}
	@Override
	public void stop() {
		System.out.println("���� �ߴ�");
	}
	 
	//�߰��� �ۼ��� �޼ҵ�
	public void schedule() {
		System.out.println("���� �����մϴ�.");
	}
}
