package practice;

public class Pr03_10 {		//4x4�迭, 1~10������ 10���� ���Ƿι�ġ, ������6���� ���� 0

	public static void main(String[] args) {
		int arr1[][] = new int[4][4];	//���� �迭
		int rdnum[] = new int[10];		//1~10 ������ 10��
		int nums[] = new int[16];		//4x4�迭�� ���� 16���� ��
		int zeropoint[] = new int[6];	//0�� �� 6���� �ڸ���ǥ
		
		for(int i=0; i<rdnum.length; i++)
			rdnum[i] = (int)(Math.random()*10 +1);
			//rdnum �迭 �ϼ�
		
		for(int i=0; i<zeropoint.length; i++) {
			zeropoint[i] = (int)(Math.random()*15);
			for(int j=0; j<i; j++) {
				if(zeropoint[i] == zeropoint[j]) {
					i = i - 1;
					break;
				}
			}
		}	//zeropoint �迭 �ϼ�
		
		int r_count = 0;	//������ ���� ī��Ʈ
		int z_count = 0;	//0 ���� ī��Ʈ
		for(int i=0; i<zeropoint.length; i++) {
			nums[zeropoint[i]] = 0;
			for(int j=0; j<nums.length; j++) {
				if 
			}
		}
		
		for(int i=0; i<zeropoint.length; i++)
			System.out.print(zeropoint[i]+" ");
		
		System.out.println();
		
		for(int i=0; i<nums.length; i++)
			System.out.print(nums[i]+" ");
		
		
		
		
		

	}

}
