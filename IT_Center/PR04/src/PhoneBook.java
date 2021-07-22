import java.util.Scanner;
public class PhoneBook {
	
	private int total;
	Phone ph[];
	
	
	public PhoneBook() {
		
	}
	
	public void set(int total) {
		this.total = total;
		
		String pname = "";
		String ptel = "";
		ph = new Phone[this.total];
		
		for(int i=0; i<ph.length; i++)
			ph[i] = new Phone(pname, ptel);
	}
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο��� �Է�>>");
		total = sc.nextInt();
		
		set(total);
		
		for(int i=0; i<total; i++) {
			System.out.print("�̸��� ��ȭ��ȣ>>");
			String iName = sc.next();
			String iTel = sc.next();
			ph[i] = new Phone(iName, iTel);
		}
		System.out.println("����Ǿ����ϴ�...");
		
		while (true) {
			System.out.print("�˻��� �̸�>>");
			String srchname = sc.next();
			search(srchname);
		}
		
	}
	
	public void search(String sname) {
		for(int i=0; i<ph.length; i++) {
			if(sname.equals(ph[i].getName())) {
				ph[i].show();
				break;
			}
			else if(i == ph.length-1)
				System.out.println(sname+"��(��) �����ϴ�");
		}
	}
}
