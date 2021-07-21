
public interface PhoneInterface 
{
	static final int TIMEOUT = 10000; // ��� �ʵ� ����
	
	abstract void sendCall(); // �߻� �޼ҵ�
	void receiveCall(); // �߻� �޼ҵ�
	
	default void printLogo() 
	{ 
		System.out.println("** Phone **");
	}

}
