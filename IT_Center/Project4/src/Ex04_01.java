
public class Ex04_01 {

	public static void main(String[] args) {
		Goods camera = new Goods();
		/*
		Goods camera;		//��ü�ƴ�(�̻�),camera ��ü����
		camera = new Goods();	//new Goods(); = ��ü
		//��ü�� ��ü������ ������� camera�� ��ü(�ϻ�)�� ��.
		 */
		
		camera.name = "Nikon";
		camera.price = 400000;
		camera.numberOfStock = 30;
		camera.sold = 50;
		
		System.out.println("��ǰ �̸�: "+camera.name);
		System.out.println("��ǰ ����: "+camera.price);
		System.out.println("��� ����: "+camera.numberOfStock);
		System.out.println("�ȸ� ����: "+camera.sold);

	}

}
