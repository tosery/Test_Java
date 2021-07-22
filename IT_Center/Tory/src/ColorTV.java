
public class ColorTV extends TV
{
	private int color;
		
	public ColorTV(int size, int c)
	{
		super(size);
		this.color = c;
	}
	
	protected int getColor()
	{
		return color;
	}
	
	public void printProperty()
	{
		int num1 = getSize();
		int num2 = this.color;
		System.out.println(num1+"인치 "+num2+"컬러");
	}
}
