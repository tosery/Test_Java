package jun.view;

import java.util.Scanner;

import jun.controller.SMDController;
import jun.domain.SpeedMeasuringDevice;

public class Nav {
//Ŭ������ ���赵, ���赵�� ��ü�� �����, ��ü���� �����Ͽ� ���α׷��� �ȴ�.
//	private SMDController SMD = new SMDController();
	private SMDController smdCon = new SMDController();
	private Scanner sc = new Scanner(System.in);
	SpeedMeasuringDevice[] smdArr = smdCon.printSMD(); 
	private int overspeed;
	
	public Nav() {
		int menuNum = 0;
		do {
			System.out.println("========== �������� ��Ģ�� Ȯ���ϼ��� ==========");
			System.out.println("(1): �ӵ����� Ȯ���ϱ� ");
			System.out.println("(2): ��Ģ��/���·� �����ϱ� ");
			System.out.println("(3): ���·� ���� �������� ��� ���� ��");
			System.out.println("(9): ���α׷� ����");
			System.out.print("�޴� ��ȣ : ");
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
			default : System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է��ϼ���.");
			}
			
		}while(menuNum != 9);

		menuNum = sc.nextInt();
		
	}

//TODO: 1. �ӵ� �ʰ� �Ϸ� 2.��Ģ��/���·� ���� �Ϸ� 3.���·� ���� ���� ����Ʈ ��ɱ�����(DB�����Ǵ� �ϵ��ڵ� �Ǿ�� �ؼ� ����)
	private void inputData(int mainNum) {
		this.overspeed = overspeed;
		switch(mainNum) {
		case 1:
			System.out.print("����ȣ �Է�: ");
			String carNumIn = sc.next();
			for(int i = 0; i<smdArr.length ; i++) {
				if(smdArr[i].getCarNum().equals(carNumIn)) {
					if(smdArr[i].getSpeed() > SMDController.LimitedSpeed) {
						System.out.println("���������� �ϼ̽��ϴ�. " + smdArr[i].inform());
						overspeed = smdArr[i].getSpeed() - SMDController.LimitedSpeed;
						System.out.println(overspeed + "�ʰ��Ͽ����ϴ�.");
					}
					return;
				}else {
					System.out.println("��ġ�ϴ� ����ȣ�� �������� �ʽ��ϴ�.");
					return;
				}
			}
			break;
		case 2:
			System.out.print("����ȣ �Է�: ");
			carNumIn = sc.next();
			System.out.println();
			if(overspeed != 0) {
				if(overspeed<20) {
					System.out.println("�����Ͻ� ������·�� 30,000��");
				}else if(overspeed>=20) {
					System.out.println("�����Ͻ� ������·�� 60,000��");
				}
			}
			break;
		case 9:
			System.out.println("���α׷��� �����մϴ�.");
			return;
	
		default: System.out.println("�߸��Է�");
		}
	}
	
	
}
