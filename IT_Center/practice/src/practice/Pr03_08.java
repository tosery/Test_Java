package practice;
import java.util.Scanner;

public class Pr03_08 {

	public static void main(String[] args) {
		System.out.print("���� �?");
		
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		if(b>=100 || b<0)
			System.out.println("1~100������ ���� �Է����ּ���");
		else {
			int arr1[] = new int[b];
			
			for(int i=0; i<arr1.length; i++) {
				arr1[i] = (int)(Math.random()*100 + 1);
//				if(arr1[i] in arr1)				//�ߺ��߰�: in ���� ���°�?
//					i = i-1;
				if (i!=0) {
					for(int j=0; j<i; j++) {
						if(arr1[i] == arr1[j]) {
							i = i-1;
							break;
						}
					}
				}
			}
			for(int i=0; i<arr1.length; i++) {
				System.out.print(arr1[i] + "\t");
				if((i+1)%10==0)
					System.out.println();
			}	
		}
	}
}
