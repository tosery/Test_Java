
public class Ex04_1_Goods {
	String name;
	int price;
	int numberOfstock;
	int sold;
	
	public static void main(String[] args) {
		Ex04_1_Goods camera = new Ex04_1_Goods();
		
		camera.name = "Nikon";
		camera.price = 400000;
		camera.numberOfstock = 30;
		camera.sold = 50;
		
		System.out.println("��ǰ �̸�: " + camera.name);
		System.out.println("��ǰ ����: " + camera.price);
		System.out.println("��� ����: " + camera.numberOfstock);
		System.out.println("�ȸ� ����: " + camera.sold);
		
	}

}
