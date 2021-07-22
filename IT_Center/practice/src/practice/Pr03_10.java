package practice;

public class Pr03_10 {		//4x4배열, 1~10랜덤수 10개를 임의로배치, 나머지6개의 값은 0

	public static void main(String[] args) {
		int arr1[][] = new int[4][4];	//최종 배열
		int rdnum[] = new int[10];		//1~10 랜덤수 10개
		int nums[] = new int[16];		//4x4배열에 넣을 16개의 수
		int zeropoint[] = new int[6];	//0이 들어갈 6개의 자리좌표
		
		for(int i=0; i<rdnum.length; i++)
			rdnum[i] = (int)(Math.random()*10 +1);
			//rdnum 배열 완성
		
		for(int i=0; i<zeropoint.length; i++) {
			zeropoint[i] = (int)(Math.random()*15);
			for(int j=0; j<i; j++) {
				if(zeropoint[i] == zeropoint[j]) {
					i = i - 1;
					break;
				}
			}
		}	//zeropoint 배열 완성
		
		int r_count = 0;	//랜덤수 개수 카운트
		int z_count = 0;	//0 개수 카운트
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
