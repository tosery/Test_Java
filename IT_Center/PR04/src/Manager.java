import java.util.Scanner;
public class Manager {
	
	Seat st = new Seat();
	
	public Manager() {
		
	}
	
	
	//예약
	public void rs() {
//		Seat st = new Seat();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("좌석구분 : S(1) / A(2) / B(3) >>");
			int ch = sc.nextInt();
			if(ch == 1) {
				st.showS();
				System.out.print("예약자 이름>>");
				String name = sc.next();
				System.out.print("예약할 좌석번호>>");
				int sch = sc.nextInt();
				if(st.getS(sch-1) != "___")
					System.out.println("!! 이미 예약된 자리입니다. 다시 진행해주세요 !!");
				else {
					st.setS(sch-1, name);
					System.out.println("** 예약이 완료되었습니다 **");
					break;
				}
			}
			else if(ch == 2) {
				st.showA();
				System.out.print("예약자 이름>>");
				String name = sc.next();
				System.out.print("예약할 좌석번호>>");
				int sch = sc.nextInt();
				if(st.getA(sch-1) != "___")
					System.out.println("!! 이미 예약된 자리입니다. 다시 진행해주세요 !!");
				else {
					st.setA(sch-1, name);
					System.out.println("** 예약이 완료되었습니다 **");
					break;
				}
			}
			else if(ch == 3) {
				st.showB();
				System.out.print("예약자 이름>>");
				String name = sc.next();
				System.out.print("예약할 좌석번호>>");
				int sch = sc.nextInt();
				if(st.getB(sch-1) != "___")
					System.out.println("!! 이미 예약된 자리입니다. 다시 진행해주세요 !!");
				else {
					st.setB(sch-1, name);
					System.out.println("** 예약이 완료되었습니다 **");
					break;
				}
			}
			else
				System.out.println("!! 없는 좌석입니다. 다시 선택해주세요 !!");
			
			
		}
//		sc.close();
		
		//예약자명 중복 추가하기
	}
	
	//조회
	public void view() {
//		Seat st = new Seat();
		st.showS();
		st.showA();
		st.showB();
		System.out.println("---조회를 완료하였습니다---");
	}
	
	//취소
	public void cancle() {
//		Seat st = new Seat();
		Scanner sc = new Scanner(System.in);
		while(true) {
			int succ = 0;
			System.out.print("좌석구분 : S(1) / A(2) / B(3) >>");
			int ch = sc.nextInt();
			if(ch == 1) {
				st.showS();
				System.out.print("취소할 예약자명>>");
				String name = sc.next();
				for(int i=0; i<10; i++) {
					if(name.equals(st.getS(i))) {
						st.setS(i, "___");
						System.out.println("** 취소가 완료되었습니다 **");
						succ = 1;
						break;
					}
				}
				if(succ==1) break;

			}
			else if(ch == 2) {
				st.showA();
				System.out.print("취소할 예약자명>>");
				String name = sc.next();
				for(int i=0; i<10; i++) {
					if(name.equals(st.getA(i))) {
						st.setA(i, "___");
						System.out.println("** 취소가 완료되었습니다 **");
						succ=1;
						break;
					}
				}
				if(succ==1) break;
			}
			else if(ch == 3) {
				st.showB();
				System.out.print("취소할 예약자명>>");
				String name = sc.next();
				for(int i=0; i<10; i++) {
					if(name.equals(st.getB(i))) {
						st.setB(i, "___");
						System.out.println("** 취소가 완료되었습니다 **");
						succ=1;
						break;
					}
				}
				if(succ==1) break;
			}
			else
				System.out.println("!! 잘못된 입력입니다 !!");
			
			System.out.println("!! 예약정보를 찾을 수 없습니다. 다시 진행해주세요 !!");
		}
//		sc.close();
	}
	//끝내기
	public void end() {
		System.out.println("프로그램을 종료합니다...");
	}
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("예약:1 / 조회:2 / 취소:3 / 끝내기:4 >>");
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
				System.out.println("!! 없는 번호입니다. 다시 선택해주세요 !!");
		}
		sc.close();
		
	}
}
