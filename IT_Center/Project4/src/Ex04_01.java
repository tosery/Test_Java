
public class Ex04_01 {

	public static void main(String[] args) {
		Goods camera = new Goods();
		/*
		Goods camera;		//°´Ã¼¾Æ´Ô(¹Ì»ý),camera °´Ã¼º¯¼ö
		camera = new Goods();	//new Goods(); = Âð°´Ã¼
		//Âð°´Ã¼°¡ °´Ã¼º¯¼ö¿¡ ´ã¾ÆÁö¸é camera°¡ °´Ã¼(¿Ï»ý)°¡ µÊ.
		 */
		
		camera.name = "Nikon";
		camera.price = 400000;
		camera.numberOfStock = 30;
		camera.sold = 50;
		
		System.out.println("»óÇ° ÀÌ¸§: "+camera.name);
		System.out.println("»óÇ° °¡°Ý: "+camera.price);
		System.out.println("Àç°í ¼ö·®: "+camera.numberOfStock);
		System.out.println("ÆÈ¸° ¼ö·®: "+camera.sold);

	}

}
