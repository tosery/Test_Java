
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
		
		System.out.println("상품 이름: " + camera.name);
		System.out.println("상품 가격: " + camera.price);
		System.out.println("재고 수량: " + camera.numberOfstock);
		System.out.println("팔린 수량: " + camera.sold);
		
	}

}
