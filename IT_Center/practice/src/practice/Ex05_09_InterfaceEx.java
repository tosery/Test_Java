package practice;

public class Ex05_09_InterfaceEx {
	public static void main(String[] args)
	{
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3�� 5�� ���ϸ� " + phone.calculate(3,5));
		phone.schedule();
		
	}
}