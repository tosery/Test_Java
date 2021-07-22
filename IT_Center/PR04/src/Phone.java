
public class Phone {
	private String name;
	private String tel;
	
	Phone(String name, String tel){
		this.name = name;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	
	public void show() {
		System.out.println(name+"의 번호는 "+tel+" 입니다.");
	}
}
