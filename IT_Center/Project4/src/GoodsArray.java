import java.util.Scanner;
public class GoodsArray {
	
	//1.�������(=�Ӽ�,�ʵ�)
	Goods[] goodsArray;
	
	//2.������
	GoodsArray(){
		goodsArray = new Goods[3];
		
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<goodsArray.length; i++) {
			System.out.print((i+1) + "��° �Է½���>>");
			String name = s.next();
			int price = s.nextInt();
			int n = s.nextInt();
			int sold = s.nextInt();
			Goods goods = new Goods(name, price, n, sold);
			goodsArray[i] = goods;
		}
		
	}
	
	//3.(���)�޼ҵ�(=�Լ�)
	void printGoodsArray() {
		for(int i=0; i<goodsArray.length; i++) {
			String name = goodsArray[i].getName();
			int price = goodsArray[i].getPrice();
			int n = goodsArray[i].getNumberOfStock();
			int sold = goodsArray[i].getSold();
			
			System.out.println(name + " " + price + " " + n + " " + sold);
		}
		
	}
	
	
	

}
