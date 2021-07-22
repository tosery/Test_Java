package practice;

interface PhoneInterface {		//�������̽� ����
	/*static final*/ int TIMEOUT = 10000; 	//��� �ʵ� ����, static ������.
	/* abstract*/ void sendCall();			//�߻� �޼ҵ�
	/* abstract*/ void receiveCall();			//�߸�, 
	default void printLogo() {		//default �޼ҵ�
		System.out.println(" ** phone ** ");
	}
}

public class SamsungPhone implements PhoneInterface, AInterface {
	//PhoneInterface�� ��� �޼ҵ� ����
	@Override
	public void sendCall() {
		System.out.println("�츮����~");
	}
	@Override
	public void receiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ�.");
	}
	
	//�޼ҵ� �߰� �ۼ�, flash�� �������̽����� ��� �ȹ޾���.
	public void flash() {
		System.out.println("��ȭ�⿡ �� ����");
		System.out.println(PhoneInterface.TIMEOUT);
		System.out.println(AInterface.TIMEOUT);
	}
}


