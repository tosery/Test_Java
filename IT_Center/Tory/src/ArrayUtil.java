import java.util.Arrays;
public class ArrayUtil 
{

	public static int concat(int[] array1, int[] array2) 
	{
		int arrDLength = array1.length + array2.length;
		int []arrD = new int[arrDLength];// arrD�� 1,2��ģ ���̸�ŭ �Ҵ�
		System.arraycopy(array1, 0, arrD, 0, array1.length);
		System.arraycopy(array2, 0, arrD, array1.length, array2.length);
		
		return 0;
	}

	public static void print(int[] array3) 
	{
		
	}
	
}
