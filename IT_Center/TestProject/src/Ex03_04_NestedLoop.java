
public class Ex03_04_NestedLoop {

	public static void main(String[] args) {
		int i, j;
		
		for(i=1; i<10; i++,System.out.println()) {
			for(j=1; j<10; j++,System.out.print('\t')) {
				System.out.print(i + "*" + j + "=" + i*j);
			}
		}
	}

}
