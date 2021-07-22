package practice;

public class Pr03_07 {

	public static void main(String[] args) {
		//int n = (int)(Math.random()*10 + 1);
		
		int arr1[] = new int[10];
		
		double sum = 0;
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = (int)(Math.random()*10 + 1);
			sum += arr1[i];
		}
		
		double avg = sum / arr1.length;
		
		System.out.print("·£´ýÇÑ Á¤¼öµé : ");
		for(int i=0; i<arr1.length; i++)
			System.out.print(arr1[i]+" ");
		
		System.out.println();
		System.out.print("Æò±ÕÀº " + avg);
	}

}
