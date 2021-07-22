
public class Sub {
	private int a;
	private int b;
	
	public Sub(){
		
	}
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		
		int c = this.a - this.b;
		return c;
	}
}
