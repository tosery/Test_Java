
public class TV 
{
	private String maker;
	private int year;
	private int size;
	
	public TV(String maker, int year, int size) {
		this.maker = maker;
		this.year = year;
		this.size = size;
	}
	
	public void show()
	{
		System.out.print(maker + "���� ���� ");
		System.out.print(year + "�� ");
		System.out.print(size +"��ġ");
	}
	

}
