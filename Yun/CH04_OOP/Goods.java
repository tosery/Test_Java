
public class Goods 
{
	//1.�������
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;
	
	//2.������
	Goods() //�⺻(default ������)
	{
		
	}
	
	public Goods(String _name, int price, int numberOfStock, int sold) {
		name = _name;
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
	
	//3.�޼ҵ�
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	public int getNumberOfStock() {
		return numberOfStock;
	}
	public int getSold() {
		return sold;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setNumberOfStock(int numberOfStock) {
		this.numberOfStock = numberOfStock;
	}
	public void setSold(int sold) {
		this.sold = sold;
	}
	
	void printPrice() {
		double dc = price * 0.9;
		System.out.println(dc);
	}
	

}
