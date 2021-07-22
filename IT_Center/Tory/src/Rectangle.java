
public class Rectangle 
{
	private int x;
	private int y;
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void show() {
		System.out.print("("+x+","+y+")���� ");
		System.out.println("ũ�Ⱑ "+width+"x"+height+"�� �簢��");
	}

	public int square() 
	{
		return width*height;
	}

	public boolean contains(Rectangle a) 
	{
		if( x<=a.x && y<=a.y && x+width >= a.x+a.width && y+height >= a.y+a.height)
			return true;
		else
			return false;
	}

}
