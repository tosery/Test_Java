// Point�� ��ӹ��� ColorPoint ����
public class ColorPoint extends Point 
{ 
	private String color; // ���� ��
	
	public ColorPoint() {}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y); // Point�� ������ Point(x, y) ȣ��
		this.color = color;
	}



	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() { // �÷� ���� ��ǥ ���
		System.out.print(color);
		showPoint(); // Point Ŭ������ showPoint() ȣ�� 
	}
}
