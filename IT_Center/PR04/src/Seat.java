
public class Seat {
	
	private String [] Sclass = {"___", "___", "___", "___", "___", "___", "___", "___", "___", "___"};
	private String [] Aclass = {"___", "___", "___", "___", "___", "___", "___", "___", "___", "___"};
	private String [] Bclass = {"___", "___", "___", "___", "___", "___", "___", "___", "___", "___"};
	
	public Seat() {
		
	}
	
	
	public void setS(int a, String b) {
		Sclass[a] = b;
	}
	public void setA(int a, String b) {
		Aclass[a] = b;
	}
	public void setB(int a, String b) {
		Bclass[a] = b;
	}
	
	
	
	public String getS(int i) {
		return Sclass[i];
	}
	public String getA(int i) {
		return Aclass[i];
	}
	public String getB(int i) {
		return Bclass[i];
	}
	
	public void showS() {
		System.out.print("S>>\t");
		for(int i=0; i<Sclass.length; i++) {
			System.out.print("["+Sclass[i]+"]\t");
		}
		System.out.println();
	}
	public void showA() {
		System.out.print("A>>\t");
		for(int i=0; i<Aclass.length; i++)
			System.out.print("["+Aclass[i]+"]\t");
		System.out.println();
	}
	public void showB() {
		System.out.print("B>>\t");
		for(int i=0; i<Bclass.length; i++)
			System.out.print("["+Bclass[i]+"]\t");
		System.out.println();
	}
	
	
}
