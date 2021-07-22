
class Goods {
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;
	
//	public Goods() {	//기본생성자(default)
//		
//	}

	public Goods(String name, int price, int numberOfStock, int sold) {
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
	}
	
	public void setAll(String name, int price, int numberOfStock, int sold) {
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
	}
	
//	Goods(String n, int p, int nStock, int s){
//		name = n;
//		price = p;
//		numberOfStock = nStock;
//		sold = s;
//	}
	
	
	
	String getName() {
		return name;
	}
	int getPrice() {
		return price;
	}
	int getNumberOfStock() {
		return numberOfStock;
	}
	int getSold() {
		return sold;
	}
}
