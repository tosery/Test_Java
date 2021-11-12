package jun.view;

import java.util.Scanner;

import jun.controller.SMDController;
import jun.domain.SpeedMeasuringDevice;

public class Nav {
//클래스는 설계도, 설계도로 객체를 만들고, 객체들을 조합하여 프로그램이 된다.
//	private SMDController SMD = new SMDController();
	private SMDController smdCon = new SMDController();
	private Scanner sc = new Scanner(System.in);
	SpeedMeasuringDevice[] smdArr = smdCon.printSMD(); 
	private int overspeed;
	
	public Nav() {
		int menuNum = 0;
		do {
			System.out.println("========== 교통위반 범칙금 확인하세요 ==========");
			System.out.println("(1): 속도위반 확인하기 ");
			System.out.println("(2): 범칙금/과태료 납입하기 ");
			System.out.println("(3): 과태료 납입 내역보기 기능 구현 중");
			System.out.println("(9): 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			menuNum = sc.nextInt();
//			menuNum = sc.Integer.parseInt(sc.nextLine());
			switch(menuNum) {
			case 1: 
				inputData(1);
				break;
			case 2:
				inputData(2);
				break;
			case 3:
				inputData(3);
				break;
			case 9:
				inputData(9);
				return;
			default : System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			}
			
		}while(menuNum != 9);

		menuNum = sc.nextInt();
		
	}

//TODO: 1. 속도 초과 완료 2.범칙금/과태료 납입 완료 3.과태료 납입 내역 리스트 기능구현중(DB구현또는 하드코딩 되어야 해서 보류)
	private void inputData(int mainNum) {
		this.overspeed = overspeed;
		switch(mainNum) {
		case 1:
			System.out.print("차번호 입력: ");
			String carNumIn = sc.next();
			for(int i = 0; i<smdArr.length ; i++) {
				if(smdArr[i].getCarNum().equals(carNumIn)) {
					if(smdArr[i].getSpeed() > SMDController.LimitedSpeed) {
						System.out.println("과속위반을 하셨습니다. " + smdArr[i].inform());
						overspeed = smdArr[i].getSpeed() - SMDController.LimitedSpeed;
						System.out.println(overspeed + "초과하였습니다.");
					}
					return;
				}else {
					System.out.println("일치하는 차번호가 존재하지 않습니다.");
					return;
				}
			}
			break;
		case 2:
			System.out.print("차번호 입력: ");
			carNumIn = sc.next();
			System.out.println();
			if(overspeed != 0) {
				if(overspeed<20) {
					System.out.println("납입하실 교통과태료는 30,000원");
				}else if(overspeed>=20) {
					System.out.println("납입하실 교통과태료는 60,000원");
				}
			}
			break;
		case 9:
			System.out.println("프로그램을 종료합니다.");
			return;
	
		default: System.out.println("잘못입력");
		}
	}
	
	
}
