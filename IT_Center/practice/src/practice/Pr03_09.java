package practice;

public class Pr03_09 {

	public static void main(String[] args) {
		
		int arr1[][] = new int[4][4];
		
		for(int i=0; i<arr1.length; i++) {			//2차원 배열에서 행과 열의 길이구분
			for(int j=0; j<arr1[0].length; j++) {
				arr1[i][j] = (int)(Math.random()*10+1);
			}
		}
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[0].length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
