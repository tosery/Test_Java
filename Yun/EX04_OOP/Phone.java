
public class Phone 
{
	//1.�������
	private String name;
	private String tel;
	
	//2.������
//	public Phone() {
//		this.name = "ȫ�浿";
//		this.tel = "000-0000";
//	}
	
	public Phone(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}

	//3.�޼ҵ�
	public String getTel() {
		return tel;
	}

	public String getName() {
		return name;
	}
	
}
