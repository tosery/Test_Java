import java.util.Scanner;
public class Manager {
	
	Seat st = new Seat();
	
	public Manager() {
		
	}
	
	
	//����
	public void rs() {
//		Seat st = new Seat();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("�¼����� : S(1) / A(2) / B(3) >>");
			int ch = sc.nextInt();
			if(ch == 1) {
				st.showS();
				System.out.print("������ �̸�>>");
				String name = sc.next();
				System.out.print("������ �¼���ȣ>>");
				int sch = sc.nextInt();
				if(st.getS(sch-1) != "___")
					System.out.println("!! �̹� ����� �ڸ��Դϴ�. �ٽ� �������ּ��� !!");
				else {
					st.setS(sch-1, name);
					System.out.println("** ������ �Ϸ�Ǿ����ϴ� **");
					break;
				}
			}
			else if(ch == 2) {
				st.showA();
				System.out.print("������ �̸�>>");
				String name = sc.next();
				System.out.print("������ �¼���ȣ>>");
				int sch = sc.nextInt();
				if(st.getA(sch-1) != "___")
					System.out.println("!! �̹� ����� �ڸ��Դϴ�. �ٽ� �������ּ��� !!");
				else {
					st.setA(sch-1, name);
					System.out.println("** ������ �Ϸ�Ǿ����ϴ� **");
					break;
				}
			}
			else if(ch == 3) {
				st.showB();
				System.out.print("������ �̸�>>");
				String name = sc.next();
				System.out.print("������ �¼���ȣ>>");
				int sch = sc.nextInt();
				if(st.getB(sch-1) != "___")
					System.out.println("!! �̹� ����� �ڸ��Դϴ�. �ٽ� �������ּ��� !!");
				else {
					st.setB(sch-1, name);
					System.out.println("** ������ �Ϸ�Ǿ����ϴ� **");
					break;
				}
			}
			else
				System.out.println("!! ���� �¼��Դϴ�. �ٽ� �������ּ��� !!");
			
			
		}
//		sc.close();
		
		//�����ڸ� �ߺ� �߰��ϱ�
	}
	
	//��ȸ
	public void view() {
//		Seat st = new Seat();
		st.showS();
		st.showA();
		st.showB();
		System.out.println("---��ȸ�� �Ϸ��Ͽ����ϴ�---");
	}
	
	//���
	public void cancle() {
//		Seat st = new Seat();
		Scanner sc = new Scanner(System.in);
		while(true) {
			int succ = 0;
			System.out.print("�¼����� : S(1) / A(2) / B(3) >>");
			int ch = sc.nextInt();
			if(ch == 1) {
				st.showS();
				System.out.print("����� �����ڸ�>>");
				String name = sc.next();
				for(int i=0; i<10; i++) {
					if(name.equals(st.getS(i))) {
						st.setS(i, "___");
						System.out.println("** ��Ұ� �Ϸ�Ǿ����ϴ� **");
						succ = 1;
						break;
					}
				}
				if(succ==1) break;

			}
			else if(ch == 2) {
				st.showA();
				System.out.print("����� �����ڸ�>>");
				String name = sc.next();
				for(int i=0; i<10; i++) {
					if(name.equals(st.getA(i))) {
						st.setA(i, "___");
						System.out.println("** ��Ұ� �Ϸ�Ǿ����ϴ� **");
						succ=1;
						break;
					}
				}
				if(succ==1) break;
			}
			else if(ch == 3) {
				st.showB();
				System.out.print("����� �����ڸ�>>");
				String name = sc.next();
				for(int i=0; i<10; i++) {
					if(name.equals(st.getB(i))) {
						st.setB(i, "___");
						System.out.println("** ��Ұ� �Ϸ�Ǿ����ϴ� **");
						succ=1;
						break;
					}
				}
				if(succ==1) break;
			}
			else
				System.out.println("!! �߸��� �Է��Դϴ� !!");
			
			System.out.println("!! ���������� ã�� �� �����ϴ�. �ٽ� �������ּ��� !!");
		}
//		sc.close();
	}
	//������
	public void end() {
		System.out.println("���α׷��� �����մϴ�...");
	}
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("����:1 / ��ȸ:2 / ���:3 / ������:4 >>");
			int choice = sc.nextInt();
			
			if(choice == 1)
				rs();
			else if(choice == 2)
				view();
			else if(choice == 3)
				cancle();
			else if(choice == 4) {
				end();
				break;
			}
			else
				System.out.println("!! ���� ��ȣ�Դϴ�. �ٽ� �������ּ��� !!");
		}
		sc.close();
		
	}
}
