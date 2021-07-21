
public class Point 
{
	private int x, y; // �� ���� �����ϴ� x, y ��ǥ
	
	public Point() {
		this.x = this.y = 0;
	}
	
	public Point(int x, int y) {
		this.x = x; 
		this.y = y;
	}
	

	public void set(int x, int y) {
		this.x = x; 
		this.y = y;
	}
	
	public void showPoint() { // ���� ��ǥ ���
		System.out.println("(" + x + "," + y + ")");
	}
}
