
public class ArrayUtil {
	
	
	public ArrayUtil() {
		
	}
	
	
	public static int [] concat(int[] a, int[] b) {
		int [] c = new int[a.length + b.length];
		
		for(int i=0; i<a.length; i++)
			c[i] = a[i];
		for(int i=a.length; i<c.length; i++)
			c[i] = b[i-a.length];
		
		return c;
	}
	
	
	//배열a 출력
	public static void print(int[] a) {
		System.out.print("[ ");
		for(int i=0; i<a.length; i++) {
			if(i==a.length-1)
				System.out.print(a[i]);
			else
				System.out.print(a[i] + ", ");
		}
		System.out.print(" ]");
	}
}
