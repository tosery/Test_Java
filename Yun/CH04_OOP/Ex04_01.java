
public class Ex04_01 {

	public static void main(String[] args) 
	{
//		Goods camera = new Goods();
//		Goods camera2 = new Goods();
		Goods camera;
		camera = new Goods();

//		camera.name = "Nikon";
//		camera.price = 400000;
//		camera.numberOfStock = 30;
//		camera.sold = 50;
//
//		System.out.println("��ǰ �̸�:" + camera.name);
//		System.out.println("��ǰ ����:" + camera.price);
//		System.out.println("��� ����:" + camera.numberOfStock);
//		System.out.println("�ȸ� ����:" + camera.sold);
			
		camera.setName("Nikon");
		camera.setPrice(400000);
		camera.setNumberOfStock(30);
		camera.setSold(50);
		
		System.out.println("��ǰ �̸�:" + camera.getName());
		System.out.println("��ǰ ����:" + camera.getPrice());
		System.out.println("��� ����:" + camera.getNumberOfStock());
		System.out.println("�ȸ� ����:" + camera.getSold());
		
	}

}
