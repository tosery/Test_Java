
public class SamsungPhone implements PhoneInterface, AInterface
{

	@Override
	public void sendCall() {
		System.out.println("�츮������");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ�!");
	}

	public void flash() {		
		System.out.println("������ �������ϴ�!");
		System.out.println(PhoneInterface.TIMEOUT);
		
	}
	
}
