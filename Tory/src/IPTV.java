
public class IPTV extends ColorTV
{
	private String ip;
	
	public IPTV(String ip, int size, int color) 
	{
		super(size,color);
		this.ip = ip;
	}
	
	public void printProperty()
	{
		String str = this.ip;
		int num1 = getSize();
		int num2 = getColor();
		System.out.println("나의 IPTV는 "+str+" 주소의 "+num1+"인치 " + num2+"컬러");
	}
}
