
public class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface
{

	@Override
	public void play() {
		System.out.println("������ ����մϴ�!");
		
	}

	@Override
	public void stop() {
		System.out.println("������ �����մϴ�!");
		
	}

	@Override
	public void sendCall() {
		System.out.println("������������~!!!");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ�!");
	}

	@Override
	public void sendSMS() {
		System.out.println("���ڰ� ���ϴ�!");
		
	}

	@Override
	public void receiveSMS() {
		System.out.println("���ڰ� �Ծ��!!");
	}

	public void schedule() {
		System.out.println("������ �����մϴ�!!");
		
	}
}
