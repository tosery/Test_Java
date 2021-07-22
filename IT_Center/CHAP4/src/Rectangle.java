
public class Rectangle {
	//�ʵ�
	private int x;
	private int y;
	private int width;
	private int height;
	
	//������			(x,y)���� ũ�Ⱑ width*height�� �簢��
	Rectangle(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	//�޼ҵ�
	public int square() {		//�簢���� ����
		int sqr = this.width * this.height;
		return sqr;
	}
	
	public void show() {		//�簢���� ��ǥ�� ���̸� ȭ�鿡 ���
		System.out.println("("+this.x+","+this.y+")���� ũ�Ⱑ "+this.width+"x"+this.height+"�� �簢��");
	}
	
	public boolean contains(Rectangle r) {		//r�� �� �簢�� �ȿ� ������ true ����
		if(this.x < r.x && (this.x+this.width) > r.x && (this.x+this.width) > (r.x+r.width)) {
			if(this.y < r.y && (this.y+this.height) > r.y && (this.y+this.height) > (r.y+r.height))
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
}
