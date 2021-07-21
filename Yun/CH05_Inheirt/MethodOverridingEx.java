
public class MethodOverridingEx 
{
	private void paint(Shape p) {
		p.draw(); // p�� ����Ű�� ��ü ���� �������̵��� draw() ȣ��. 
				  // ���� ���ε�
	}
	
	public void run()
	{
		Line line = new Line();
		paint(line); 
		paint(new Shape()); 
		paint(new Line()); 
		paint(new Rect()); 
		paint(new Circle()); 

	}
	
	void run2()
	{
		Shape start, last, obj;
		// ��ũ�� ����Ʈ�� ���� �����Ͽ� ����
		
		start = new Line(); // Line ��ü ����
		last = start;
		
		obj = new Rect();
		last.next = obj; // Rect ��ü ����
		last = obj;
		
		obj = new Line(); // Line ��ü ����
		last.next = obj;
		last = obj;
		
		obj = new Circle(); // Circle ��ü ����
		last.next = obj;
		
		// ��� ���� ���
		Shape p = start;
		while(p != null) {
			p.draw();
			p = p.next;
		}
	}
	

}
